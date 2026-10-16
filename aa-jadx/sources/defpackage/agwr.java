package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agwr {
    public static org.chromium.net.UploadDataProvider a(byte[] bArr, int i, int i2) {
        return new defpackage.akcp(java.nio.ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static defpackage.erh b(android.content.Context context) {
        boolean z = false;
        try {
            java.lang.Class.forName("org.chromium.net.impl.NativeCronetEngineBuilderImpl", false, org.chromium.net.impl.CronetManifest.class.getClassLoader());
            z = true;
        } catch (java.lang.ClassNotFoundException unused) {
        }
        return defpackage.akcw.a(context, true, org.chromium.net.impl.CronetManifest.a(context).getBoolean("android.net.http.EnableTelemetry", !z));
    }

    public static final defpackage.aggk resolveAnnotations(defpackage.agwu agwuVar, defpackage.ahah ahahVar) {
        agwuVar.getClass();
        ahahVar.getClass();
        return new defpackage.agwq(agwuVar, ahahVar, false, 4, null);
    }
}
