package qf;

import E5.Q;
import ff.AbstractC2647b;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class f extends AbstractC2647b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f44273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Af.j f44274b;

    public f(Af.j jVar) {
        this.f44274b = jVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f44273a = arrayDeque;
        if (((File) jVar.f1311b).isDirectory()) {
            arrayDeque.push(a((File) jVar.f1311b));
        } else {
            if (!((File) jVar.f1311b).isFile()) {
                done();
                return;
            }
            File rootFile = (File) jVar.f1311b;
            AbstractC3340k.e(rootFile, "rootFile");
            arrayDeque.push(new d(rootFile));
        }
    }

    public final b a(File file) {
        int iOrdinal = ((h) this.f44274b.f1312c).ordinal();
        if (iOrdinal == 0) {
            return new e(this, file);
        }
        if (iOrdinal == 1) {
            return new c(this, file);
        }
        throw new Q((byte) 0, 9);
    }

    @Override // ff.AbstractC2647b
    public final void computeNext() {
        Object obj;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.f44273a;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                obj = null;
                break;
            }
            fileA = gVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(gVar.f44275a) || !fileA.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                this.f44274b.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(a(fileA));
                }
            }
        }
        obj = fileA;
        if (obj != null) {
            setNext(obj);
        } else {
            done();
        }
    }
}
