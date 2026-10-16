package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hyx implements defpackage.hzr, defpackage.hyz {
    private final android.content.Context a;
    private final /* synthetic */ int b;

    public hyx(android.content.Context context, int i) {
        this.b = i;
        this.a = context;
    }

    @Override // defpackage.hyz
    public final java.lang.Class a() {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? java.io.InputStream.class : android.content.res.AssetFileDescriptor.class;
        }
        return android.graphics.drawable.Drawable.class;
    }

    @Override // defpackage.hzr
    public final defpackage.hzq b(defpackage.hzv hzvVar) {
        int i = this.b;
        if (i != 0) {
            return i != 1 ? new defpackage.hza(this.a, (defpackage.hyz) this, 0) : new defpackage.hza(this.a, (defpackage.hyz) this, 0);
        }
        return new defpackage.hza(this.a, (defpackage.hyz) this, 0);
    }

    @Override // defpackage.hyz
    public final /* synthetic */ java.lang.Object c(android.content.res.Resources.Theme theme, android.content.res.Resources resources, int i) {
        int i2 = this.b;
        if (i2 != 0) {
            return i2 != 1 ? resources.openRawResource(i) : resources.openRawResourceFd(i);
        }
        android.content.Context context = this.a;
        return defpackage.icn.a(context, context, i, theme);
    }

    @Override // defpackage.hyz
    public final /* synthetic */ void d(java.lang.Object obj) throws java.io.IOException {
        int i = this.b;
        if (i == 0) {
        } else if (i != 1) {
            ((java.io.InputStream) obj).close();
        } else {
            ((android.content.res.AssetFileDescriptor) obj).close();
        }
    }
}
