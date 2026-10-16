package defpackage;

import android.os.SystemClock;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class sio {
    public static final sid a = new sig(1);
    static final sij b = new sij();
    public static final sij c = new sij();
    public final ReentrantReadWriteLock d;
    public boolean e;
    public volatile int f;
    public volatile Future g;
    public long h;
    public final Map i;
    public sij j;
    public final LinkedHashSet k;
    public final spk l;
    private final String m;
    private final shv n;
    private volatile sil o;

    private sio(sio sioVar) {
        Object sifVar;
        this(sioVar.n, sioVar.l);
        ReentrantReadWriteLock.WriteLock writeLock = sioVar.d.writeLock();
        writeLock.lock();
        try {
            this.j = sioVar.j;
            this.h = sioVar.h;
            for (Map.Entry entry : sioVar.i.entrySet()) {
                Map map = this.i;
                String str = (String) entry.getKey();
                sic sicVar = (sic) entry.getValue();
                if (sicVar instanceof sii) {
                    sifVar = new sii(this, (sii) sicVar);
                } else if (sicVar instanceof sin) {
                    sifVar = new sin(this, (sin) sicVar);
                } else if (sicVar instanceof sik) {
                    sifVar = new sik(this, (sik) sicVar);
                } else if (sicVar instanceof sim) {
                    sifVar = new sim(this, (sim) sicVar);
                } else {
                    if (!(sicVar instanceof sif)) {
                        throw new IllegalArgumentException("Unknown counter type: ".concat(String.valueOf(String.valueOf(sicVar))));
                    }
                    sifVar = new sif(this, (sif) sicVar);
                }
                map.put(str, sifVar);
            }
            this.k.addAll(sioVar.k);
            sioVar.k.clear();
            sioVar.h = SystemClock.elapsedRealtime();
        } finally {
            writeLock.unlock();
        }
    }

    public static long a(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public final sic b(String str, xyc xycVar) {
        this.d.writeLock().lock();
        try {
            sic sicVar = (sic) xycVar.gu();
            this.i.put(str, sicVar);
            return sicVar;
        } finally {
            this.d.writeLock().unlock();
        }
    }

    @ResultIgnorabilityUnspecified
    public final sii c(String str) {
        ReentrantReadWriteLock.WriteLock writeLock;
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Object obj = (sic) this.i.get(str);
            if (obj == null) {
                obj = (sii) b(str, new plm(this, str, 6));
                writeLock = this.d.writeLock();
            } else {
                writeLock = reentrantReadWriteLock.writeLock();
            }
            writeLock.unlock();
            return (sii) obj;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final sin d(String str, sid sidVar) {
        sie sieVar;
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            sic sicVar = (sic) this.i.get(str);
            if (sicVar == null) {
                sieVar = (sin) b(str, new qeq(this, str, sidVar, 2));
                reentrantReadWriteLock.writeLock().unlock();
            } else {
                try {
                    sie sieVar2 = (sie) sicVar;
                    if (!sidVar.equals(sieVar2.g)) {
                        throw new IllegalArgumentException(a.bz(str, "alias mismatch: "));
                    }
                    this.d.writeLock().unlock();
                    sieVar = sieVar2;
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException(a.bz(str, "another type of counter exists with name: "), e);
                }
            }
            return (sin) sieVar;
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ResultIgnorabilityUnspecified
    public final void e() {
        this.d.writeLock().lock();
        try {
            sio sioVar = new sio(this);
            this.d.writeLock().unlock();
            LinkedHashSet linkedHashSet = sioVar.k;
            int size = linkedHashSet.size();
            shr[] shrVarArr = new shr[size];
            Iterator it = linkedHashSet.iterator();
            int i = 0;
            while (it.hasNext()) {
                sij sijVar = (sij) it.next();
                shv shvVar = sioVar.n;
                spu.aw(sijVar);
                Map map = sioVar.i;
                ArrayList arrayList = new ArrayList(map.size());
                for (sic sicVar : map.values()) {
                    if (sicVar.c.containsKey(sijVar)) {
                        arrayList.add(sicVar);
                    }
                }
                abnp abnpVarN = acaq.a.n();
                long j = sioVar.h;
                abnpVarN.t();
                acaq acaqVar = (acaq) abnpVarN.b;
                int i2 = 1;
                acaqVar.b |= 1;
                acaqVar.c = j;
                spu.ar(!c.equals(sijVar));
                if (!b.equals(sijVar)) {
                    abow abowVar = sijVar.a;
                    spu.aw(abowVar);
                    abms abmsVarF = abowVar.f();
                    abnpVarN.t();
                    acaq acaqVar2 = (acaq) abnpVarN.b;
                    acaqVar2.b |= 4;
                    acaqVar2.e = abmsVarF;
                }
                int size2 = arrayList.size();
                int i3 = 0;
                while (i3 < size2) {
                    sic sicVar2 = (sic) arrayList.get(i3);
                    zs zsVar = (zs) sicVar2.c.get(sijVar);
                    spu.aw(zsVar);
                    abnp abnpVarN2 = acap.a.n();
                    long jA = a(sicVar2.a);
                    abnpVarN2.t();
                    acap acapVar = (acap) abnpVarN2.b;
                    acapVar.b = i2;
                    int i4 = i2;
                    acapVar.c = Long.valueOf(jA);
                    ArrayList arrayList2 = new ArrayList(zsVar.b());
                    int i5 = 0;
                    Iterator it2 = it;
                    while (i5 < zsVar.b()) {
                        abnp abnpVarN3 = acao.a.n();
                        int i6 = i;
                        sij sijVar2 = sijVar;
                        long j2 = ((long[]) zsVar.e(i5))[0];
                        abnpVarN3.t();
                        shr[] shrVarArr2 = shrVarArr;
                        acao acaoVar = (acao) abnpVarN3.b;
                        ArrayList arrayList3 = arrayList;
                        acaoVar.b |= 2;
                        acaoVar.d = j2;
                        long jC = zsVar.c(i5);
                        if (sicVar2 instanceof sii) {
                            spu.ar(jC == 0 ? i4 : 0);
                        } else {
                            abnpVarN3.t();
                            acao acaoVar2 = (acao) abnpVarN3.b;
                            acaoVar2.b |= 1;
                            acaoVar2.c = jC;
                        }
                        arrayList2.add((acao) abnpVarN3.q());
                        i5++;
                        shrVarArr = shrVarArr2;
                        i = i6;
                        sijVar = sijVar2;
                        arrayList = arrayList3;
                    }
                    shr[] shrVarArr3 = shrVarArr;
                    int i7 = i;
                    sij sijVar3 = sijVar;
                    ArrayList arrayList4 = arrayList;
                    Collections.sort(arrayList2, new tui(i4));
                    abnpVarN2.t();
                    acap acapVar2 = (acap) abnpVarN2.b;
                    aboh abohVar = acapVar2.d;
                    if (!abohVar.c()) {
                        acapVar2.d = abnv.I(abohVar);
                    }
                    abmc.i(arrayList2, acapVar2.d);
                    acap acapVar3 = (acap) abnpVarN2.q();
                    abnpVarN.t();
                    acaq acaqVar3 = (acaq) abnpVarN.b;
                    acapVar3.getClass();
                    aboh abohVar2 = acaqVar3.d;
                    if (!abohVar2.c()) {
                        acaqVar3.d = abnv.I(abohVar2);
                    }
                    acaqVar3.d.add(acapVar3);
                    i3++;
                    i2 = i4;
                    it = it2;
                    shrVarArr = shrVarArr3;
                    i = i7;
                    sijVar = sijVar3;
                    arrayList = arrayList4;
                }
                int i8 = i;
                i = i8 + 1;
                shrVarArr[i8] = shvVar.f((acaq) abnpVarN.q());
                it = it;
            }
            shr[] shrVarArr4 = shrVarArr;
            svz svzVarB = null;
            for (int i9 = 0; i9 < size; i9++) {
                shr shrVar = shrVarArr4[i9];
                shrVar.i = sioVar.m;
                svzVarB = shrVar.b();
            }
            if (svzVarB != null) {
                return;
            }
            spu.az(null);
        } catch (Throwable th) {
            this.d.writeLock().unlock();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        this.d.readLock().lock();
        try {
            sb.append("{");
            new xxd(", ").g(sb, this.k);
            sb.append("}\n");
            new xxd("\n").g(sb, this.i.values());
            this.d.readLock().unlock();
            return sb.toString();
        } catch (Throwable th) {
            this.d.readLock().unlock();
            throw th;
        }
    }

    public sio(shv shvVar, spk spkVar) {
        this.d = new ReentrantReadWriteLock();
        this.i = new TreeMap();
        this.j = b;
        this.k = new LinkedHashSet();
        this.o = null;
        this.n = shvVar;
        this.m = "GMM_REALTIME_COUNTERS";
        this.l = spkVar;
        this.h = SystemClock.elapsedRealtime();
    }
}
