package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.io.FileNotFoundException;

/* loaded from: classes2.dex */
public abstract class mqz implements Comparable {
    public final mqc c;
    public final GhIcon d;
    public final String e;
    public final GhIcon f;

    public mqz(mqc mqcVar, GhIcon ghIcon, String str, int i, GhIcon ghIcon2) {
        this.c = mqcVar;
        this.d = ghIcon;
        this.e = str;
        this.f = ghIcon2 == null ? i == 0 ? null : GhIcon.q(mki.a.c.getResources(), i) : ghIcon2;
    }

    protected int a() {
        return -1;
    }

    public abstract void c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mqz) {
            return this.c.equals(((mqz) obj).c);
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mqz mqzVar) {
        return this.e.compareToIgnoreCase(mqzVar.e);
    }

    public Drawable g(Context context, int i) throws PackageManager.NameNotFoundException, FileNotFoundException {
        GhIcon ghIcon = this.d;
        if (ghIcon.b == 2) {
            return new BitmapDrawable(context.getResources(), lfs.e(context).d(context, ghIcon.a(), a(), ghIcon.d(context), ghIcon.e));
        }
        Drawable drawableF = ghIcon.f(context, i);
        drawableF.getClass();
        return drawableF;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.car.app.model.CarIcon h(android.content.Context r12, int r13, boolean r14) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqz.h(android.content.Context, int, boolean):androidx.car.app.model.CarIcon");
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public String i() {
        return this.e;
    }

    public final String toString() {
        return String.format("{AppKey: %s}", this.c.toString());
    }
}
