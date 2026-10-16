package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import androidx.car.app.media.OpenMicrophoneResponse;
import com.google.android.apps.auto.components.demand.audio.GhMicrophoneContentProvider;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public final class jwm extends gdu {
    private final Context c;
    private final String d;

    public jwm(geu geuVar) {
        this.c = geuVar;
        this.d = ((gmh) ((jwq) geuVar).c).a.getPackageName();
    }

    @Override // defpackage.gdu
    public final OpenMicrophoneResponse a(sn snVar) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            try {
                ContentResolver contentResolver = this.c.getContentResolver();
                String str = this.d;
                yph yphVar = GhMicrophoneContentProvider.a;
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(new Uri.Builder().scheme("content").authority("com.google.android.projection.gearhead.provider").path("/mic").appendQueryParameter("mic_owner_package_key", str).build(), "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    snVar.b = parcelFileDescriptorOpenFileDescriptor;
                }
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return new OpenMicrophoneResponse(snVar);
            } catch (FileNotFoundException e) {
                throw new IllegalStateException(e);
            }
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    @Override // defpackage.gdu
    public final void c() {
        GhMicrophoneContentProvider ghMicrophoneContentProvider = GhMicrophoneContentProvider.b;
        String str = ghMicrophoneContentProvider.c;
        if (str == null || !str.equals(this.d)) {
            return;
        }
        ghMicrophoneContentProvider.b();
    }
}
