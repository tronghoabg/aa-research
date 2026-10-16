package defpackage;

import android.util.Base64;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class jng implements jnd {
    private final jne a;

    public jng(jne jneVar) {
        this.a = jneVar;
    }

    @Override // defpackage.jnd
    public final ByteBuffer c(ByteBuffer byteBuffer) {
        Object next;
        if (byteBuffer.remaining() < 2) {
            ((ype) jnf.a.f()).u("Received message without type header.");
            return byteBuffer;
        }
        if (byteBuffer.getShort() == 6) {
            try {
                yph yphVar = jnf.a;
                yphVar.l().u("Munging SDR");
                xob xobVar = (xob) abnv.A(xob.a, byteBuffer, abnj.a());
                xobVar.getClass();
                aboh abohVar = xobVar.c;
                abohVar.getClass();
                if (!abohVar.isEmpty()) {
                    Iterator<E> it = abohVar.iterator();
                    while (it.hasNext()) {
                        if ((((xnz) it.next()).b & 16384) != 0) {
                            yphVar.l().u("CarControlService already found, skipping munging");
                            this.a.d(jnc.b);
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(woy.bp(abohVar, 10));
                Iterator<E> it2 = abohVar.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(((xnz) it2.next()).c));
                }
                List listCh = woy.ch(woy.cb(arrayList));
                Iterator it3 = woy.bD(listCh).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                    afbh afbhVar = (afbh) next;
                    if (afbhVar.a + 1 < ((Number) afbhVar.b).intValue()) {
                        break;
                    }
                }
                afbh afbhVar2 = (afbh) next;
                int iBh = afbhVar2 != null ? afbhVar2.a : woy.bh(listCh) + 1;
                int i = iBh + 1;
                listCh.add(iBh, Integer.valueOf(i));
                abnp abnpVarK = xobVar.K();
                abnpVarK.getClass();
                DesugarCollections.unmodifiableList(((xob) abnpVarK.b).c).getClass();
                abnp abnpVarN = xnz.a.n();
                abnpVarN.getClass();
                abnpVarN.t();
                xnz xnzVar = (xnz) abnpVarN.b;
                xnzVar.b |= 1;
                xnzVar.c = i;
                xif xifVar = jna.a;
                xif xifVar2 = jna.a;
                xifVar2.getClass();
                abnpVarN.t();
                xnz xnzVar2 = (xnz) abnpVarN.b;
                xnzVar2.m = xifVar2;
                xnzVar2.b |= 16384;
                abnv abnvVarQ = abnpVarN.q();
                abnvVarQ.getClass();
                abnpVarK.K((xnz) abnvVarQ);
                abnv abnvVarQ2 = abnpVarK.q();
                abnvVarQ2.getClass();
                jne jneVar = this.a;
                jneVar.d(new jmy(i, jneVar));
                return jnf.b((xob) abnvVarQ2, (short) 6);
            } catch (abon e) {
                String strEncodeToString = Base64.encodeToString(byteBuffer.array(), byteBuffer.arrayOffset() + 2, byteBuffer.limit() - 2, 0);
                String str = strEncodeToString.length() <= 100 ? strEncodeToString : null;
                ype ypeVar = (ype) ((ype) jnf.a.h()).p(e);
                if (str == null) {
                    str = "<encoded message too long to log>";
                }
                ypeVar.y("Received invalid ServiceDiscoveryResponse, Message: %s", str);
            }
        }
        return byteBuffer;
    }

    @Override // defpackage.jnd
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.jnd
    public final /* synthetic */ jcn a(int i, jcn jcnVar, boolean z) {
        return jcnVar;
    }
}
