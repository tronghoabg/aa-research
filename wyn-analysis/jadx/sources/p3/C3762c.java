package p3;

import ac.C1346a;
import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.InterfaceC3342m;
import kotlin.jvm.internal.M;
import kotlin.reflect.KClass;

/* renamed from: p3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3762c implements tf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f43208b;

    public /* synthetic */ C3762c(Object obj, int i5) {
        this.f43207a = i5;
        this.f43208b = obj;
    }

    @Override // tf.a
    public final Object invoke() {
        g gVar;
        switch (this.f43207a) {
            case 0:
                h hVar = (h) this.f43208b;
                String str = hVar.f43228b;
                Context context = hVar.f43227a;
                if (str == null || !hVar.f43230d) {
                    gVar = new g(context, hVar.f43228b, new C1346a(15), hVar.f43229c, hVar.f43231e);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    AbstractC3340k.d(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    gVar = new g(context, new File(noBackupFilesDir, hVar.f43228b).getAbsolutePath(), new C1346a(15), hVar.f43229c, hVar.f43231e);
                }
                gVar.setWriteAheadLoggingEnabled(hVar.f43233g);
                return gVar;
            default:
                KClass kClass = ((M) this.f43208b).f39744a;
                InterfaceC3342m interfaceC3342m = kClass instanceof InterfaceC3342m ? (InterfaceC3342m) kClass : null;
                if (interfaceC3342m != null) {
                    return interfaceC3342m.findJavaDeclaration();
                }
                return null;
        }
    }
}
