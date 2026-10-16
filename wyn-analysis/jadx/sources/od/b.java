package Od;

import Ba.c;
import Fe.e;
import ef.C2515C;
import io.ktor.utils.io.InterfaceC2886t;
import io.ktor.utils.io.N;
import io.ktor.utils.io.Z;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes5.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public RandomAccessFile f8959a;

    /* renamed from: b, reason: collision with root package name */
    public int f8960b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8961c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f8962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(File file, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f8962d = file;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        b bVar = new b(this.f8962d, interfaceC3103c);
        bVar.f8961c = obj;
        return bVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((Z) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        RandomAccessFile randomAccessFile;
        kf.a aVar = kf.a.f39711a;
        ?? r12 = this.f8960b;
        try {
            if (r12 == 0) {
                e.U(obj);
                Z z2 = (Z) this.f8961c;
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f8962d, "rw");
                InterfaceC2886t interfaceC2886t = z2.f37381a;
                FileChannel channel = randomAccessFile2.getChannel();
                AbstractC3340k.d(channel, "getChannel(...)");
                this.f8961c = randomAccessFile2;
                this.f8959a = randomAccessFile2;
                this.f8960b = 1;
                obj = N.f(interfaceC2886t, channel, Long.MAX_VALUE, this);
                if (obj == aVar) {
                    return aVar;
                }
                randomAccessFile = randomAccessFile2;
                r12 = randomAccessFile2;
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                randomAccessFile = this.f8959a;
                Closeable closeable = (Closeable) this.f8961c;
                e.U(obj);
                r12 = closeable;
            }
            randomAccessFile.setLength(((Number) obj).longValue());
            c.n(r12, null);
            return C2515C.f34653a;
        } finally {
        }
    }
}
