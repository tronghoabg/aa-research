package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Duration;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class omm {
    static final Duration a;
    public static final /* synthetic */ int h = 0;
    private static final GhIcon i;
    public final tfj b;
    public final oml c;
    public Bitmap d;
    public Uri e;
    private final Handler j = new Handler(Looper.getMainLooper());
    private boolean k = false;
    final iev f = new omi(this);
    public final iev g = new omj();

    static {
        yph.c("GH.MediaAsyncImageLdr");
        i = new GhIcon(8);
        a = Duration.ofMillis(200L);
    }

    public omm(tfj tfjVar, oml omlVar) {
        this.b = tfjVar;
        this.c = omlVar;
    }

    public static boolean c(omk omkVar) {
        GhIcon ghIcon = omkVar.a;
        return ghIcon == null || ghIcon.b != 8 || omkVar.b;
    }

    @ResultIgnorabilityUnspecified
    public final omk a(Context context, Uri uri) {
        if (Objects.equals(uri, this.e)) {
            Bitmap bitmap = this.d;
            return new omk(bitmap == null ? i : GhIcon.l(bitmap), this.k);
        }
        b(context);
        this.e = uri;
        this.c.b();
        tfk.a.b(this.b);
        this.k = true;
        hrt.c(context).b().f(uri).q(this.f);
        this.j.postDelayed(new oey((Object) this, (Object) uri, (Object) context, 8, (byte[]) null), a.toMillis());
        return new omk(i, this.k);
    }

    public final void b(Context context) {
        hrt.c(context).i(this.f);
        this.j.postDelayed(new ojl(this, context, 2), a.toMillis());
        this.d = null;
        this.e = null;
        this.k = false;
    }
}
