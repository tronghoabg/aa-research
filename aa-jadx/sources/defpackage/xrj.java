package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xrj {
    public final android.os.Bundle a;

    public xrj(android.os.Bundle bundle) {
        this.a = bundle;
    }

    public final int a() {
        return this.a.getInt(com.google.android.sidekick.shared.remoteapi.RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA);
    }

    public final android.graphics.Bitmap b() {
        android.os.Bundle bundle = this.a;
        if (bundle.containsKey("icon")) {
            return (android.graphics.Bitmap) bundle.getParcelable("icon");
        }
        return null;
    }

    public final java.lang.CharSequence c() {
        return this.a.getCharSequence("extra1");
    }

    public final java.lang.CharSequence d() {
        return this.a.getCharSequence("extra2");
    }

    public final java.lang.CharSequence e() {
        return this.a.getCharSequence("subtitle");
    }

    public final java.lang.CharSequence f() {
        return this.a.getCharSequence("title");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("type:" + a() + ", ");
        sb.append("icon:" + java.lang.String.valueOf(b()) + ", ");
        sb.append("title:" + java.lang.String.valueOf(f()) + ", ");
        sb.append("subtitle:" + java.lang.String.valueOf(e()) + ", ");
        sb.append("extra1:" + java.lang.String.valueOf(c()) + ", ");
        sb.append("extra2:" + java.lang.String.valueOf(d()) + ", ");
        return sb.toString();
    }
}
