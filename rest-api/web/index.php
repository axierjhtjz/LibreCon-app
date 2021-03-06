<?php

require_once __DIR__ . '/../vendor/autoload.php';

$app = new Silex\Application();

require __DIR__ . '/../resources/config/dev.php';

if(getenv('APPLICATION_ENV') == 'development'){
    require __DIR__ . '/../resources/config/dev.php';
}else{
    require __DIR__ . '/../resources/config/prod.php';
}

require __DIR__ . '/../src/app.php';

$app['http_cache']->run();
