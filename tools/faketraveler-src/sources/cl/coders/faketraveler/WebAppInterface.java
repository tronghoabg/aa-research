package cl.coders.faketraveler;

import android.util.Log;
import android.webkit.JavascriptInterface;
import cl.coders.faketraveler.MainActivity;

/* loaded from: classes.dex */
public class WebAppInterface {
    private final MainActivity mainActivity;

    public WebAppInterface(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @JavascriptInterface
    public void setPosition(final String str) {
        this.mainActivity.runOnUiThread(new Runnable() { // from class: cl.coders.faketraveler.WebAppInterface$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$setPosition$0(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPosition$0(String str) {
        try {
            this.mainActivity.setLatLng(Double.parseDouble(str.substring(str.indexOf(40) + 1, str.indexOf(44))), Double.parseDouble(str.substring(str.indexOf(44) + 2, str.indexOf(41))), MainActivity.SourceChange.CHANGE_FROM_MAP);
        } catch (Throwable th) {
            Log.e(WebAppInterface.class.toString(), "Could not set new position from map!", th);
        }
    }

    @JavascriptInterface
    public void setZoom(final String str) {
        this.mainActivity.runOnUiThread(new Runnable() { // from class: cl.coders.faketraveler.WebAppInterface$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$setZoom$1(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setZoom$1(String str) {
        try {
            this.mainActivity.setZoom(Double.parseDouble(str));
        } catch (Throwable th) {
            Log.e(WebAppInterface.class.toString(), "Could not save zoom!", th);
        }
    }
}
