package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ser extends defpackage.rxk implements defpackage.sed {
    public boolean e;
    public defpackage.rxi f;
    public final java.util.concurrent.CopyOnWriteArraySet a = new java.util.concurrent.CopyOnWriteArraySet();
    public final java.lang.Object b = new java.lang.Object();
    private final android.os.Handler g = new defpackage.stq(android.os.Looper.getMainLooper());
    public final defpackage.sed c = new defpackage.sew();
    public int d = 31;

    @Override // defpackage.rxl
    public final void a(int i, byte[] bArr) {
        xli xliVarB;
        if (i == 13) {
            defpackage.xoz xozVarB = defpackage.xoz.b(13);
            int i2 = defpackage.rvu.b;
            if (bArr == null) {
                xliVarB = null;
            } else {
                xozVarB.getClass();
                try {
                    switch (xozVarB.ordinal()) {
                        case defpackage.abnt.b /* 0 */:
                            xliVarB = defpackage.abox.B(xli.a, bArr, defpackage.abol.a());
                            break;
                        case 1:
                            xliVarB = (xju) defpackage.abox.B(xju.a, bArr, defpackage.abol.a());
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            xliVarB = (xph) defpackage.abox.B(xph.a, bArr, defpackage.abol.a());
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            xliVarB = (xor) defpackage.abox.B(xor.a, bArr, defpackage.abol.a());
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            xliVarB = (xmv) defpackage.abox.B(xmv.a, bArr, defpackage.abol.a());
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            xliVarB = (xkk) defpackage.abox.B(xkk.a, bArr, defpackage.abol.a());
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            xliVarB = (xmz) defpackage.abox.B(xmz.a, bArr, defpackage.abol.a());
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            xliVarB = (xkm) defpackage.abox.x(xkm.a, bArr);
                            break;
                        case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                            xliVarB = (xkc) defpackage.abox.B(xkc.a, bArr, defpackage.abol.a());
                            break;
                        case 9:
                            xliVarB = (xmu) defpackage.abox.B(xmu.a, bArr, defpackage.abol.a());
                            break;
                        case 10:
                            xliVarB = (xkh) defpackage.abox.B(xkh.a, bArr, defpackage.abol.a());
                            break;
                        case 11:
                            xliVarB = (xks) defpackage.abox.B(xks.a, bArr, defpackage.abol.a());
                            break;
                        case 12:
                            xliVarB = (xkg) defpackage.abox.B(xkg.a, bArr, defpackage.abol.a());
                            break;
                        case 13:
                            xliVarB = (xkb) defpackage.abox.B(xkb.a, bArr, defpackage.abol.a());
                            break;
                        case 14:
                            xliVarB = (xna) defpackage.abox.B(xna.a, bArr, defpackage.abol.a());
                            break;
                        case 15:
                            xliVarB = (xke) defpackage.abox.B(xke.a, bArr, defpackage.abol.a());
                            break;
                        case 16:
                            xliVarB = (xlh) defpackage.abox.x(xlh.a, bArr);
                            break;
                        case 17:
                            xliVarB = (xpk) defpackage.abox.B(xpk.a, bArr, defpackage.abol.a());
                            break;
                        case 18:
                            xliVarB = (xhz) defpackage.abox.B(xhz.a, bArr, defpackage.abol.a());
                            break;
                        case 19:
                            xliVarB = (xkq) defpackage.abox.B(xkq.a, bArr, defpackage.abol.a());
                            break;
                        case 20:
                            xliVarB = (xkp) defpackage.abox.x(xkp.a, bArr);
                            break;
                        case 21:
                            xliVarB = (xpl) defpackage.abox.B(xpl.a, bArr, defpackage.abol.a());
                            break;
                        default:
                            throw new java.lang.IllegalArgumentException("Invalid type " + xozVarB.name());
                    }
                } catch (defpackage.abpp e) {
                    throw new java.lang.RuntimeException("Invalid bytes", e);
                }
            }
            xkg xkgVar = (xkg) xliVarB;
            if (xkgVar != null) {
                synchronized (this.b) {
                    int i3 = xkgVar.b;
                    this.d = i3;
                    java.util.Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        this.g.post(new defpackage.rhh((defpackage.sec) it.next(), i3, 8, null));
                    }
                }
            }
        }
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final void d(defpackage.rxi rxiVar) {
        synchronized (this.b) {
            if (rxiVar != null) {
                try {
                    this.f = rxiVar;
                    rxiVar.f(this);
                    this.e = true;
                } catch (android.os.RemoteException unused) {
                    this.e = false;
                }
            }
        }
    }

    @Override // defpackage.rxl
    public final void b() {
    }

    @Override // defpackage.rxl
    public final void c() {
    }
}
