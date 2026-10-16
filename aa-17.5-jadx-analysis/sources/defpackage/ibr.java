package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes2.dex */
public final class ibr implements huo {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public ibr(Context context, int i) {
        this.a = i;
        this.b = new iaf();
        this.c = context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [hxe, java.lang.Object] */
    @Override // defpackage.huo
    public final /* synthetic */ hwx a(Object obj, int i, int i2, hum humVar) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        ibp ibpVar;
        boolean z;
        ifo ifoVar;
        int i3 = this.a;
        if (i3 != 0) {
            if (i3 == 1) {
                hwx hwxVarC = ((ici) this.b).c((Uri) obj, humVar);
                if (hwxVarC == null) {
                    return null;
                }
                return ibb.a(this.c, ((icf) hwxVarC).c(), i, i2);
            }
            Uri uri = (Uri) obj;
            Context context = (Context) this.c;
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(context.getContentResolver(), uri);
            if (Log.isLoggable("UriBitmapDecoder", 2)) {
                String type = context.getContentResolver().getType(uri);
                Log.v("UriBitmapDecoder", "decoding " + String.valueOf(uri) + ", mimeType: " + type + ", [" + i + ", " + i2 + "]");
            }
            return ((iaf) this.b).c(sourceCreateSource, i, i2, humVar);
        }
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof ibp) {
            ibpVar = (ibp) inputStream;
            z = false;
        } else {
            ibpVar = new ibp(inputStream, (hxl) this.c);
            z = true;
        }
        Queue queue = ifo.a;
        synchronized (queue) {
            ifoVar = (ifo) queue.poll();
        }
        if (ifoVar == null) {
            ifoVar = new ifo();
        }
        ifo ifoVar2 = ifoVar;
        ifoVar2.b = ibpVar;
        ifv ifvVar = new ifv(ifoVar2);
        ibq ibqVar = new ibq(ibpVar, ifoVar2);
        try {
            Object obj2 = this.b;
            hwx hwxVarA = ((iaz) obj2).a(new ibk(ifvVar, ((iaz) obj2).g, ((iaz) obj2).h, 1), i, i2, humVar, ibqVar);
            ifoVar2.a();
            if (z) {
                ibpVar.b();
            }
            return hwxVarA;
        } finally {
        }
    }

    @Override // defpackage.huo
    public final /* synthetic */ boolean b(Object obj, hum humVar) throws IOException {
        int i = this.a;
        if (i == 0) {
            return true;
        }
        if (i == 1) {
            return "android.resource".equals(((Uri) obj).getScheme());
        }
        Uri uri = (Uri) obj;
        String scheme = uri.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme) && !"android.resource".equals(scheme)) {
            return false;
        }
        String type = ((Context) this.c).getContentResolver().getType(uri);
        return type == null || !type.equals("image/gif");
    }

    public ibr(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
