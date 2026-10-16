package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bhh extends defpackage.affy implements defpackage.affc {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhh(java.lang.Object obj, int i) {
        super(1, obj, defpackage.bhk.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0);
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:38:0x010e A[DONT_INVERT, PHI: r7
  0x010e: PHI (r7v3 int) = (r7v2 int), (r7v4 int) binds: [B:28:0x00d8, B:37:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x0110 A[LOOP:0: B:27:0x00ca->B:39:0x0110, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0113 A[EDGE_INSN: B:52:0x0113->B:40:0x0113 BREAK  A[LOOP:0: B:27:0x00ca->B:39:0x0110], SYNTHETIC] */
    @Override // defpackage.affc
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        int i;
        int i2 = this.a;
        int i3 = 3;
        byte[] bArr = null;
        if (i2 == 0) {
            long j = ((defpackage.cji) obj).a;
            defpackage.bhk bhkVar = (defpackage.bhk) this.receiver;
            defpackage.bht bhtVar = (defpackage.bht) defpackage.cjv.y(bhkVar, defpackage.bhu.a);
            if (bhtVar != null) {
                ahoc.d(bhkVar.N(), (defpackage.afdo) null, 0, new defpackage.bhj(bhkVar, j, bhtVar, new defpackage.bhi(bhkVar, j), null), 3);
            }
            return defpackage.afbk.a;
        }
        int i4 = 5;
        int i5 = 8;
        if (i2 != 1) {
            java.util.List list = (java.util.List) obj;
            list.getClass();
            defpackage.nnf nnfVar = (defpackage.nnf) this.receiver;
            com.google.android.apps.auto.components.telecom.PhoneCall phoneCall = (com.google.android.apps.auto.components.telecom.PhoneCall) defpackage.afga.aB(list);
            j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(defpackage.omf.w().k()).filter(new defpackage.mpw(new defpackage.njt(phoneCall, 20), i4)).findFirst();
            optionalFindFirst.getClass();
            com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) optionalFindFirst.orElse((java.lang.Object) null);
            if (carCall == null || phoneCall == null) {
                nnfVar.m(null);
            } else {
                if (defpackage.oek.a.contains(phoneCall.b)) {
                    nnfVar.m(null);
                } else {
                    defpackage.gjv gjvVar = defpackage.gjv.a;
                    android.net.Uri uriB = defpackage.oeh.a().b(defpackage.mkp.a.c, carCall);
                    uriB.getClass();
                    defpackage.gjv gjvVar2 = new defpackage.gjv(uriB, null, null);
                    defpackage.oej oejVarR = defpackage.mkc.R();
                    android.content.Context context = defpackage.mkp.a.c;
                    android.content.ComponentName componentName = phoneCall.f;
                    android.content.ComponentName componentNameA = oejVarR.a(context, componentName.getPackageName());
                    if (componentNameA == null) {
                        componentNameA = defpackage.mkt.b;
                        componentNameA.getClass();
                    }
                    android.content.ComponentName componentName2 = componentNameA;
                    nnfVar.m(new defpackage.nne(new com.google.android.apps.auto.components.graphics.icon.GhIcon(8), componentName2, com.google.android.apps.auto.components.graphics.icon.GhIcon.j(componentName), gjvVar2, false, new defpackage.nma(phoneCall, componentName2, i3, bArr)));
                }
            }
            return defpackage.afbk.a;
        }
        boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        defpackage.aiw aiwVar = (defpackage.aiw) this.receiver;
        if (zBooleanValue) {
            aiwVar.m();
        } else {
            if (aiwVar.a != null) {
                defpackage.zv zvVar = aiwVar.h;
                java.lang.Object[] objArr = zvVar.c;
                long[] jArr = zvVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr[i6];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i6 != length) {
                                break;
                                break;
                            }
                            i6++;
                        } else {
                            int i7 = (~(i6 - length)) >>> 31;
                            int i8 = 0;
                            while (true) {
                                i = 8 - i7;
                                if (i8 >= i) {
                                    break;
                                }
                                if ((255 & j2) < 128) {
                                    ahoc.d(aiwVar.N(), (defpackage.afdo) null, 0, new defpackage.ais(aiwVar, (defpackage.asn) objArr[(i6 << 3) + i8], (defpackage.afdk) null, 5), 3);
                                }
                                j2 >>= i5;
                                i8++;
                                i5 = i5;
                            }
                            if (i != i5) {
                                break;
                            }
                            if (i6 != length) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
                defpackage.asn asnVar = aiwVar.g;
                if (asnVar != null) {
                    ahoc.d(aiwVar.N(), (defpackage.afdo) null, 0, new defpackage.ais(aiwVar, asnVar, (defpackage.afdk) null, 6, (byte[]) null), 3);
                }
            }
            aiwVar.h.d();
            aiwVar.g = null;
            aiwVar.n();
        }
        return defpackage.afbk.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhh(java.lang.Object obj, int i, byte[] bArr) {
        super(1, obj, defpackage.aiw.class, "onFocusChange", "onFocusChange(Z)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bhh(java.lang.Object obj, int i, char[] cArr) {
        super(1, obj, defpackage.nnf.class, "onActiveCallsChanged", "onActiveCallsChanged(Ljava/util/List;)V", 0);
        this.a = i;
    }
}
