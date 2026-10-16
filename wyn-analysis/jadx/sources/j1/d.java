package J1;

import E4.F;
import G9.e;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1457v;
import androidx.lifecycle.e0;
import java.io.PrintWriter;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import x.C4430w;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5540a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5541b;

    public d(InterfaceC1457v interfaceC1457v, e0 store) {
        this.f5540a = interfaceC1457v;
        x4.d dVar = c.f5537d;
        AbstractC3340k.e(store, "store");
        H1.a defaultCreationExtras = H1.a.f4870b;
        AbstractC3340k.e(defaultCreationExtras, "defaultCreationExtras");
        e eVar = new e(store, dVar, defaultCreationExtras);
        KClass modelClass = Fe.b.B(c.class);
        AbstractC3340k.e(modelClass, "modelClass");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f5541b = (c) eVar.v("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass);
    }

    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.f5541b;
        if (cVar.f5538b.f47566c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i5 = 0;
        while (true) {
            C4430w c4430w = cVar.f5538b;
            if (i5 >= c4430w.f47566c) {
                return;
            }
            b bVar = (b) c4430w.f47565b[i5];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f5538b.f47564a[i5]);
            printWriter.print(": ");
            printWriter.println(bVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(bVar.f5534l);
            b7.d dVar = bVar.f5534l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.f19376a);
            if (dVar.f19378c || dVar.f19381f) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.f19378c);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.f19381f);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.f19379d || dVar.f19380e) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.f19379d);
                printWriter.print(" mReset=");
                printWriter.println(dVar.f19380e);
            }
            if (dVar.f19383h != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.f19383h);
                printWriter.print(" waiting=");
                dVar.f19383h.getClass();
                printWriter.println(false);
            }
            if (dVar.f19384i != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.f19384i);
                printWriter.print(" waiting=");
                dVar.f19384i.getClass();
                printWriter.println(false);
            }
            if (bVar.f5536n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(bVar.f5536n);
                F f10 = bVar.f5536n;
                f10.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(f10.f2853b);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            b7.d dVar2 = bVar.f5534l;
            Object obj = bVar.f18583e;
            Object obj2 = obj != D.k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            if (obj2 == null) {
                sb2.append("null");
            } else {
                Class<?> cls = obj2.getClass();
                sb2.append(cls.getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(cls)));
                sb2.append("}");
            }
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(bVar.f18581c > 0);
            i5++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f5540a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
