package defpackage;

import android.content.Context;
import android.media.session.MediaController;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final class lmb extends llu {
    private static final yph c = yph.c("GH.AaMediaController");
    public final List a = new CopyOnWriteArrayList();
    private dl d;

    public lmb(MediaController mediaController, Context context) {
        this.b = new dq(context, MediaSessionCompat.Token.b(mediaController.getSessionToken(), null));
    }

    public static void S(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (SecurityException e) {
            ((ype) ((ype) ((ype) c.h()).p(e)).ai((char) 4000)).y("Failed to %s", str);
        }
    }

    private final String Y() {
        try {
            return ((dq) this.b).c();
        } catch (SecurityException unused) {
            return null;
        }
    }

    private final void Z(Runnable runnable, String str) {
        try {
            runnable.run();
        } catch (SecurityException e) {
            ((ype) ((ype) ((ype) c.h()).p(e)).ai(3999)).M("Failed to %s for package=%s", str, Y());
        }
    }

    @Override // defpackage.llu
    public final llu L() {
        return new llu(((dq) this.b).a);
    }

    public final lmd O() {
        return (lmd) T(new llv(this, 2), "get metadata");
    }

    public final AaPlaybackState P() {
        return (AaPlaybackState) T(new llv(this, 0), "get playback state");
    }

    public final Object Q(Supplier supplier, Object obj, String str) {
        try {
            Object obj2 = supplier.get();
            return obj2 != null ? obj2 : obj;
        } catch (SecurityException e) {
            ((ype) ((ype) ((ype) c.h()).p(e)).ai(3998)).M("Failed to %s for package=%s", str, this.Y());
            return obj;
        }
    }

    public final String R() {
        return (String) T(new llv(this, 7), "get package name");
    }

    public final Object T(Supplier supplier, String str) {
        try {
            return supplier.get();
        } catch (SecurityException e) {
            ((ype) ((ype) ((ype) c.h()).p(e)).ai(3997)).M("Failed to %s for package=%s", str, this.Y());
            return null;
        }
    }

    public final llu U() {
        return (llu) T(new llv(this, 4), "get playback info");
    }

    public final llu V() {
        return new llu(((dq) this.b).b());
    }

    public final void W(llu lluVar) {
        wer.c();
        List list = this.a;
        if (list.contains(lluVar)) {
            ((ype) ((ype) c.h()).ai((char) 3996)).y("Ignoring already added callback %s", lluVar);
            return;
        }
        boolean zIsEmpty = list.isEmpty();
        list.add(lluVar);
        if (zIsEmpty) {
            lly llyVar = new lly(this);
            this.d = llyVar;
            Z(new kzu(this, llyVar, 7), "register callback");
        }
    }

    public final void X(llu lluVar) {
        List list = this.a;
        if (!list.contains(lluVar)) {
            ((ype) ((ype) c.h()).ai((char) 4001)).y("Ignoring already removed callback %s", lluVar);
            return;
        }
        list.remove(lluVar);
        if (list.isEmpty()) {
            dl dlVar = this.d;
            dlVar.getClass();
            Z(new kzu(this, dlVar, 6), "unregister callback");
            this.d = null;
        }
    }

    @Override // defpackage.llu
    public final Bundle n() {
        return (Bundle) Q(new llv(this, 5), Bundle.EMPTY, "get extras");
    }

    public lmb(Context context, llu lluVar) {
        this.b = new dq(context, (MediaSessionCompat.Token) lluVar.b);
    }
}
