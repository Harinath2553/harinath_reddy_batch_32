import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';
import { MyComponentComponent } from './app/logic/my-component.component';
import { AppModule } from './app/app.module';


platformBrowserDynamic().bootstrapModule(AppModule)
  .catch(err => console.error(err));
