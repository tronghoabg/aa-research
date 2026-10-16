package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ntb implements defpackage.lhn {
    public final boolean B;
    public boolean C;
    public boolean D;
    final defpackage.row E;
    private int J;
    private final android.content.Context K;
    private final int L;
    public defpackage.nsw m;
    public android.view.ViewGroup n;
    public final com.google.android.gms.car.display.CarDisplayId o;
    public java.util.UUID p;
    public final defpackage.rke q;
    final com.google.android.gms.car.CarInfo r;
    public final defpackage.sax s;
    public com.google.android.gms.car.display.CarDisplay t;
    public final boolean u;
    public boolean w;
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DisplayLayout");
    public static final java.lang.String b = java.lang.String.valueOf(defpackage.ntb.class.getCanonicalName()).concat(".systemLayoutRegionType");
    public static final java.lang.String c = java.lang.String.valueOf(defpackage.ntb.class.getCanonicalName()).concat(".displayId");
    public static final java.lang.String d = java.lang.String.valueOf(defpackage.ntb.class.getCanonicalName()).concat(".arguments");
    public static final defpackage.yhx e = defpackage.ysr.o(defpackage.nta.a, defpackage.nta.s, defpackage.nta.t, defpackage.nta.u, defpackage.nta.d, defpackage.nta.b, defpackage.nta.r, defpackage.nta.c, defpackage.nta.o, defpackage.nta.p, defpackage.nta.w, defpackage.nta.x, defpackage.nta.y);
    public static final defpackage.yhx f = defpackage.ysr.o(defpackage.nta.c, defpackage.nta.w, defpackage.nta.x);
    private static final defpackage.yhx H = defpackage.ysr.o(defpackage.nta.m, defpackage.nta.k);
    public final java.util.Map g = new java.util.EnumMap(defpackage.nta.class);
    public final defpackage.ydi h = new defpackage.yge();
    public final java.util.Map i = new android.util.ArrayMap();
    public final defpackage.ylx j = new defpackage.ygf(null);
    public final defpackage.ynk k = new defpackage.ygf(null);
    public final java.util.List l = new java.util.ArrayList();
    private final int I = (int) defpackage.acqe.a.fF().j();
    public defpackage.nsv v = defpackage.nsv.a;
    public final java.util.Set x = new defpackage.zf(0);
    public final java.util.Set y = new defpackage.zf(0);
    public final defpackage.ylx z = new defpackage.ygf(null);
    public final defpackage.eqs A = new defpackage.eqs();
    public final defpackage.wyz F = new defpackage.wyz(this, null);
    public final defpackage.wyz G = new defpackage.wyz(this);

    public ntb(android.content.Context context, com.google.android.gms.car.CarInfo carInfo, defpackage.row rowVar, defpackage.sax saxVar, com.google.android.gms.car.display.CarDisplayId carDisplayId, defpackage.rke rkeVar, boolean z, boolean z2, defpackage.qsh qshVar) {
        this.w = false;
        this.K = context;
        this.s = saxVar;
        this.r = carInfo;
        this.o = carDisplayId;
        this.q = rkeVar;
        this.E = rowVar;
        this.L = carInfo.h;
        this.u = z;
        this.w = z2;
        this.B = defpackage.lee.a.a().c(qshVar);
    }

    private static int N(boolean z, boolean z2, int i) {
        if (i == 1) {
            return true != z2 ? true != z ? 2131624639 : 2131624643 : true != z ? 2131624640 : 2131624644;
        }
        return true != z2 ? true != z ? 2131624637 : 2131624641 : true != z ? 2131624638 : 2131624642;
    }

    private static int O(boolean z, boolean z2, int i) {
        if (i == 1) {
            return true != z2 ? true != z ? 2131624616 : 2131624620 : true != z ? 2131624617 : 2131624621;
        }
        return true != z2 ? true != z ? 2131624614 : 2131624618 : true != z ? 2131624615 : 2131624619;
    }

    private final int P(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, boolean z, android.graphics.Rect rect) {
        android.content.res.Resources resources = constraintLayout.getContext().getResources();
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resources.getValue(z ? 2131166005 : 2131165813, typedValue, true);
        float f2 = typedValue.getFloat();
        int dimension = (int) resources.getDimension(2131165736);
        int dimension2 = (int) resources.getDimension(2131165785);
        float f3 = constraintLayout.getContext().getResources().getConfiguration().screenWidthDp * resources.getDisplayMetrics().density;
        defpackage.nsw nswVar = this.m;
        if (nswVar.g && nswVar.e) {
            f3 -= dimension2 + dimension2;
        }
        float fWidth = f3 - (rect != null ? rect.width() : 0.0f);
        int i = ((int) (fWidth / f2)) + dimension + dimension;
        if (z) {
            i += dimension2 - dimension;
        }
        return java.lang.Math.min((int) (((fWidth - dimension2) - dimension) - ((int) resources.getDimension(2131165547))), i);
    }

    private final int Q(defpackage.nta ntaVar) {
        return ((java.lang.Integer) t(ntaVar, new defpackage.mmf(3), 1)).intValue();
    }

    private static android.graphics.Rect R(android.view.View view, android.graphics.Rect rect) {
        return new android.graphics.Rect(view.getLeft() + rect.left, view.getTop() + rect.top, view.getRight() + rect.left, view.getBottom() + rect.top);
    }

    private final defpackage.nta S(int i) {
        if (i == -1) {
            return null;
        }
        if (i == 2131427455) {
            return defpackage.nta.a;
        }
        if (i == 2131427989) {
            return defpackage.nta.b;
        }
        if (i == 2131427990) {
            return defpackage.nta.c;
        }
        if (i == 2131427535) {
            return defpackage.nta.w;
        }
        if (i == 2131427536) {
            return defpackage.nta.x;
        }
        if (i == 2131429051) {
            return defpackage.nta.i;
        }
        if (i == 2131429056) {
            return defpackage.nta.j;
        }
        if (i == 2131429583) {
            return defpackage.nta.m;
        }
        if (i == 2131428404) {
            return defpackage.nta.g;
        }
        if (i == 2131428803) {
            return defpackage.nta.h;
        }
        if (i == 2131429264) {
            return defpackage.nta.k;
        }
        if (i == 2131427800) {
            return defpackage.nta.n;
        }
        if (i == 2131429525) {
            return defpackage.nta.l;
        }
        if (i == 2131428284) {
            return defpackage.nta.o;
        }
        if (i == 2131428282) {
            return defpackage.nta.p;
        }
        if (i == 2131427908) {
            return defpackage.nta.q;
        }
        if (i == 2131427779) {
            return defpackage.nta.r;
        }
        if (i == 2131428797) {
            return defpackage.nta.s;
        }
        if (i == 2131428799) {
            return defpackage.nta.t;
        }
        if (i == 2131427457) {
            return defpackage.nta.u;
        }
        if (i == 2131428406) {
            return defpackage.nta.d;
        }
        if (i == 2131428408) {
            return defpackage.nta.e;
        }
        if (i == 2131428409) {
            return defpackage.nta.f;
        }
        if (i == 2131428434) {
            return defpackage.nta.y;
        }
        if (i == 2131429139) {
            return defpackage.nta.z;
        }
        if (i == 2131428070) {
            return defpackage.nta.B;
        }
        if (i == 2131429840) {
            return defpackage.nta.A;
        }
        if (i == 2131429321) {
            return defpackage.nta.C;
        }
        android.content.Context context = this.K;
        if (context == null) {
            return null;
        }
        ((defpackage.yqj) a.l().ai((char) 5398)).y("No window type for %s", context.getResources().getResourceName(i));
        return null;
    }

    private final com.google.android.gms.car.display.CarDisplayNativeUiElement T(com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig, int i, int i2, boolean z) {
        defpackage.ygw ygwVar;
        boolean zJ = J();
        java.util.List list = carDisplayBlendedUiConfig.b;
        if (list == null) {
            ((defpackage.yqj) a.l().ai((char) 5394)).u("Native UI elements are null, no native rails provided");
            int i3 = defpackage.ygw.d;
            ygwVar = defpackage.ymx.a;
        } else {
            j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list).filter(new mrx(6));
            int i4 = defpackage.ygw.d;
            ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
        }
        return (com.google.android.gms.car.display.CarDisplayNativeUiElement) j$.util.Collection.-EL.stream(ygwVar).filter(new nso(z, zJ, i, i2)).findFirst().orElse((java.lang.Object) null);
    }

    private static void U(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, android.graphics.Rect rect) {
        defpackage.dsf dsfVar = new defpackage.dsf();
        dsfVar.e(constraintLayout);
        ag(dsfVar, 2131427840, rect.left, constraintLayout.getLayoutDirection() == 0);
        int i = rect.top;
        dsfVar.j(2131427842, 0);
        dsfVar.o(2131427842, i);
        ag(dsfVar, 2131427841, rect.right, constraintLayout.getLayoutDirection() != 0);
        int i2 = rect.bottom;
        dsfVar.j(2131427839, 0);
        dsfVar.p(2131427839, i2);
        dsfVar.c(constraintLayout);
    }

    private final void V(android.view.View view, com.google.android.gms.car.display.CarRegionId carRegionId, int i) {
        Z(view, carRegionId, i, new defpackage.wao(this, carRegionId, 1));
    }

    private final void W(android.view.View view, com.google.android.gms.car.display.CarRegionId carRegionId, int i) {
        Z(view, carRegionId, i, new defpackage.kpc(this, 3));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    private final void X(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, android.graphics.Rect rect, int i, android.graphics.Rect rect2) {
        boolean z;
        boolean z2;
        defpackage.dsf dsfVar = new defpackage.dsf();
        dsfVar.e(constraintLayout);
        defpackage.mmi.c();
        boolean zH = defpackage.mmi.h();
        int i2 = this.L;
        if (i2 != 1) {
            if (i2 == 0) {
                z = zH;
            } else if (zH) {
                z2 = true;
            } else {
                z = false;
            }
            if (i2 == 2 || !zH) {
                z2 = false;
            } else {
                z2 = true;
            }
            zH = z;
        } else if (zH) {
            i2 = 1;
            if (i2 == 0) {
                z = zH;
            } else if (zH) {
                z = false;
            } else {
                z2 = true;
            }
            if (i2 == 2) {
                z2 = false;
            } else {
                z2 = false;
            }
            zH = z;
        } else {
            z2 = true;
        }
        int iWidth = z2 ? rect.left : rect.right;
        defpackage.nsw nswVar = this.m;
        if (nswVar.g && nswVar.e) {
            i += (int) (this.B ? constraintLayout.getResources().getDimension(2131166048) : constraintLayout.getResources().getDimension(2131165785));
        }
        if (rect2 != null) {
            if ((rect2.left == 0) == z2) {
                iWidth += rect2.width();
            }
        }
        ag(dsfVar, 2131427916, i + iWidth, z2);
        if (zH) {
            dsfVar.b(2131427919).d.ad = ((int) constraintLayout.getContext().getResources().getDimension(2131165811)) + ((int) constraintLayout.getContext().getResources().getDimension(2131165736));
        }
        dsfVar.c(constraintLayout);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0448  */
    /* JADX WARN: Code duplicated, block: B:130:0x044b  */
    /* JADX WARN: Code duplicated, block: B:133:0x045a  */
    /* JADX WARN: Code duplicated, block: B:134:0x045e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0467  */
    /* JADX WARN: Code duplicated, block: B:142:0x047a  */
    /* JADX WARN: Code duplicated, block: B:144:0x0486  */
    /* JADX WARN: Code duplicated, block: B:145:0x0488  */
    /* JADX WARN: Code duplicated, block: B:147:0x0494  */
    /* JADX WARN: Code duplicated, block: B:148:0x0496  */
    /* JADX WARN: Code duplicated, block: B:153:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:155:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:156:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:158:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:159:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:161:0x04db  */
    /* JADX WARN: Code duplicated, block: B:162:0x04de  */
    /* JADX WARN: Code duplicated, block: B:164:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:165:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:16:0x008b  */
    /* JADX WARN: Code duplicated, block: B:183:0x0586  */
    /* JADX WARN: Code duplicated, block: B:186:0x0591  */
    /* JADX WARN: Code duplicated, block: B:189:0x059b  */
    /* JADX WARN: Code duplicated, block: B:192:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:195:0x05af  */
    /* JADX WARN: Code duplicated, block: B:198:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:201:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:220:0x036b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0341 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0220  */
    /* JADX WARN: Code duplicated, block: B:72:0x0222  */
    /* JADX WARN: Code duplicated, block: B:76:0x025f  */
    /* JADX WARN: Code duplicated, block: B:91:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e9  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void Y(android.view.View view, java.util.List list, java.util.Set set, android.graphics.Rect rect) {
        defpackage.nta ntaVarS;
        android.graphics.Rect rect2;
        com.google.android.gms.car.display.CarRegionId carRegionId;
        com.google.android.gms.car.display.CarRegionId carRegionId2;
        com.google.android.gms.car.display.CarRegionId carRegionId3;
        int i;
        int i2;
        defpackage.nsy nsyVar;
        android.graphics.Rect rect3;
        java.util.Iterator it;
        defpackage.nsy nsyVar2;
        int i3;
        int i4;
        int i5;
        com.google.android.gms.car.DropShadowParams dropShadowParams;
        java.lang.Object tag;
        int i6;
        boolean z;
        java.lang.Object tag2;
        java.lang.String str;
        boolean z2;
        java.lang.Integer numAe;
        java.lang.Integer numAe2;
        float f2;
        int iRound;
        int iRound2;
        int i7;
        java.lang.StringBuilder sb;
        android.graphics.Rect rect4;
        android.graphics.Rect rect5;
        android.graphics.Rect rect6;
        defpackage.ze zeVar;
        android.graphics.Rect rectH;
        int id = view.getId();
        int i8 = 1;
        if (view.getTag(2131427777) != null) {
            defpackage.ysr.aY(S(view.getId()) == null, "Chrome window must not have region id");
            ntaVarS = defpackage.nta.v;
        } else {
            ntaVarS = S(view.getId());
        }
        if (ntaVarS != null) {
            android.graphics.Rect rectR = R(view, rect);
            int i9 = 16;
            if (ntaVarS == defpackage.nta.e) {
                com.google.android.gms.car.CarInfo carInfo = this.r;
                defpackage.absx absxVarH = defpackage.acqh.a.fF().h();
                defpackage.yqm yqmVar = defpackage.kjl.a;
                j$.util.stream.Stream streamD = defpackage.tht.d(new defpackage.ilz(i9), absxVarH);
                int i10 = defpackage.ygw.d;
                if (defpackage.kjl.h(carInfo, (defpackage.ygw) streamD.collect(defpackage.yds.a))) {
                    int i11 = rectR.top;
                    android.view.ViewGroup viewGroup = this.n;
                    viewGroup.getClass();
                    rect2 = new android.graphics.Rect(rectR.left, rectR.top, rectR.right, i11 + viewGroup.getContext().getResources().getDimensionPixelSize(2131166722));
                } else {
                    rect2 = rectR;
                }
            } else {
                rect2 = rectR;
            }
            defpackage.yqm yqmVar2 = a;
            ((defpackage.yqj) yqmVar2.l().ai(5386)).M("Type: %s has bounds of: %s", ntaVarS, rect2);
            if (ntaVarS == defpackage.nta.v) {
                int i12 = this.J;
                java.lang.Object tag3 = view.getTag(2131427777);
                tag3.getClass();
                int identifier = view.getResources().getIdentifier((java.lang.String) tag3, "layout", view.getContext().getPackageName());
                defpackage.qts qtsVar = new defpackage.qts(rect2.width(), rect2.height(), v());
                qtsVar.b = rect2.top;
                qtsVar.a = rect2.left;
                qtsVar.g = i12;
                qtsVar.l = true;
                qtsVar.n = 2132149945;
                qtsVar.m = 64;
                this.l.add(new nss(identifier, qtsVar.a()));
            }
            if (id != 2131427455) {
                if (id == 2131428406) {
                    com.google.android.gms.car.display.CarDisplayId carDisplayId = this.o;
                    defpackage.ysr.bk(com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId), "Immersive region is currently only supported on the primary display");
                    carRegionId = new com.google.android.gms.car.display.CarRegionId(2131428406, carDisplayId);
                } else if (id == 2131428282) {
                    defpackage.ysr.bk(com.google.android.gms.car.display.CarDisplayId.a.equals(this.o), "Frx region is currently only supported on the primary display");
                    carRegionId2 = com.google.android.gms.car.display.CarRegionId.d;
                } else if (id == 2131427989) {
                    defpackage.ysr.bk(com.google.android.gms.car.display.CarDisplayId.a.equals(this.o), "Demand region is currently only supported on the primary display");
                    carRegionId2 = com.google.android.gms.car.display.CarRegionId.b;
                } else if (id == 2131427990) {
                    defpackage.ysr.bk(com.google.android.gms.car.display.CarDisplayId.a.equals(this.o), "Demand rail region is currently only supported on the primary display");
                    carRegionId2 = com.google.android.gms.car.display.CarRegionId.c;
                } else if (id == 2131427535) {
                    defpackage.ysr.bk(com.google.android.gms.car.display.CarDisplayId.a.equals(this.o), "Demand immersive region is currently only supported on the primary display");
                    carRegionId2 = com.google.android.gms.car.display.CarRegionId.f;
                } else if (id == 2131427536) {
                    defpackage.ysr.bk(com.google.android.gms.car.display.CarDisplayId.a.equals(this.o), "Demand immersive region is currently only supported on the primary display");
                    carRegionId2 = com.google.android.gms.car.display.CarRegionId.e;
                } else if (id == 2131428284) {
                    carRegionId2 = new com.google.android.gms.car.display.CarRegionId(3, this.o);
                } else if (id == 2131428797 || id == 2131428799) {
                    com.google.android.gms.car.display.CarDisplayId carDisplayId2 = this.o;
                    defpackage.ysr.bk(com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId2), "Map regions are currently only supported on the primary display");
                    carRegionId = new com.google.android.gms.car.display.CarRegionId(id, carDisplayId2);
                } else {
                    com.google.android.gms.car.display.CarDisplayId carDisplayId3 = this.o;
                    if (id == 2131428434) {
                        carRegionId2 = new com.google.android.gms.car.display.CarRegionId(2131428434, carDisplayId3);
                    } else {
                        carRegionId = new com.google.android.gms.car.display.CarRegionId(id, carDisplayId3);
                    }
                }
                carRegionId3 = carRegionId;
                i = 4;
                if (view.getTag(2131427350) != null) {
                    int i13 = defpackage.ygw.d;
                    defpackage.ygr ygrVar = new defpackage.ygr(4);
                    zeVar = new defpackage.ze((defpackage.zf) set);
                    while (zeVar.hasNext()) {
                        com.google.android.gms.car.display.CarRegionId carRegionId4 = (com.google.android.gms.car.display.CarRegionId) zeVar.next();
                        defpackage.nta ntaVarK = k(carRegionId4);
                        rectH = h(ntaVarK);
                        rectH.getClass();
                        if (!android.graphics.Rect.intersects(rect2, rectH) && (ntaVarS != defpackage.nta.d || H.contains(ntaVarK))) {
                            ygrVar.i(carRegionId4);
                        }
                    }
                    this.k.D(ntaVarS, ygrVar.g());
                }
                if (view.getTag(2131427754) != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                java.lang.Object tag4 = view.getTag(2131427753);
                nsyVar = new defpackage.nsy();
                nsyVar.b = new android.graphics.Rect();
                nsyVar.d(1);
                nsyVar.c(false);
                nsyVar.e = new android.graphics.Rect();
                nsyVar.a(0);
                nsyVar.b(1);
                nsyVar.j = null;
                nsyVar.g = null;
                nsyVar.a = rect2;
                rect3 = new android.graphics.Rect();
                it = list.iterator();
                while (it.hasNext()) {
                    rect6 = (android.graphics.Rect) it.next();
                    if (android.graphics.Rect.intersects(rect2, rect6)) {
                        int i14 = i8;
                        int i15 = i9;
                        int i16 = i;
                        defpackage.nsy nsyVar3 = nsyVar;
                        if (rect6.top <= rect2.top || rect6.bottom < rect2.bottom) {
                            if (rect6.left <= rect2.left || rect6.right < rect2.right) {
                                throw new java.lang.IllegalStateException("Persistent window overlaps another window without fully covering one side. No way to calculate insets. Window type: " + ntaVarS.name() + ", window bounds: + " + rect2.toShortString() + ", persistent bounds: " + rect6.toShortString());
                            }
                            if (rect6.top <= rect2.top) {
                                rect3.top = java.lang.Math.max(rect6.bottom - rect2.top, rect3.top);
                            } else {
                                if (rect6.bottom < rect2.bottom) {
                                    throw new java.lang.IllegalStateException("Persistent window overlaps another window without fully covering one side. No way to calculate insets. Window type: " + ntaVarS.name() + ", window bounds: + " + rect2.toShortString() + ", persistent bounds: " + rect6.toShortString());
                                }
                                rect3.bottom = java.lang.Math.max(rect2.bottom - rect6.top, rect3.bottom);
                            }
                        } else if (rect6.left <= rect2.left) {
                            rect3.left = java.lang.Math.max(rect6.right - rect2.left, rect3.left);
                        } else {
                            if (rect6.right < rect2.right) {
                                throw new java.lang.IllegalStateException("Persistent window overlaps another window without fully covering one side. No way to calculate insets. Window type: " + ntaVarS.name() + ", window bounds: + " + rect2.toShortString() + ", persistent bounds: " + rect6.toShortString());
                            }
                            rect3.right = java.lang.Math.max(rect2.right - rect6.left, rect3.right);
                        }
                        i8 = i14;
                        i9 = i15;
                        i = i16;
                        nsyVar = nsyVar3;
                    }
                }
                nsyVar2 = nsyVar;
                i3 = i8;
                i4 = i9;
                i5 = i;
                if (ntaVarS.equals(defpackage.nta.b) && m() == defpackage.nti.e) {
                    android.content.res.Resources resources = view.getContext().getResources();
                    rect3.left = java.lang.Math.max((int) resources.getDimension(2131165736), rect3.left);
                    rect3.right = java.lang.Math.max((int) resources.getDimension(2131165736), rect3.right);
                    float dimension = resources.getDimension(2131165736);
                    rect3.bottom = java.lang.Math.max((int) (dimension + dimension), rect3.bottom);
                    ((defpackage.yqj) yqmVar2.l().ai((char) 5391)).y("Adding insets for assistant on widescreen, insets: %s", rect3);
                }
                defpackage.nta ntaVar = ntaVarS;
                dropShadowParams = null;
                ((defpackage.yqj) yqmVar2.l().ai(5389)).S("Recording insets for %s, insets: %s, bounds: %s, persistentViewBounds: %s", ntaVar, rect3, rect2, list);
                tag = view.getTag(2131427750);
                if ((tag instanceof java.lang.String) && java.lang.Boolean.parseBoolean((java.lang.String) tag)) {
                    ((defpackage.yqj) yqmVar2.l().ai((char) 5390)).y("Adding persistent bound: %s", rect2);
                    list.add(rect2);
                }
                nsyVar2.e = rect3;
                nsyVar2.f = this.J;
                nsyVar2.k = (byte) (nsyVar2.k | 4);
                i6 = 30;
                if (view.getTag(2131429322) == null && (!this.B || view.getTag(2131429323) == null || H())) {
                    i6 = i3;
                }
                nsyVar2.d(i6);
                nsyVar2.b = new android.graphics.Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
                if (view.getTag(2131429512) != null) {
                    z = i3;
                } else {
                    z = 0;
                }
                nsyVar2.c(z);
                tag2 = view.getTag(2131427524);
                if (tag2 instanceof java.lang.String) {
                    str = (java.lang.String) tag2;
                } else {
                    str = null;
                }
                nsyVar2.g = str;
                z2 = this.B;
                if (z2) {
                    numAe = ae(view, 2131428074);
                    numAe2 = ae(view, 2131428075);
                    if (numAe == null || numAe2 != null) {
                        android.content.res.Resources resources2 = view.getResources();
                        f2 = resources2.getDisplayMetrics().density;
                        if (numAe == null) {
                            iRound = 0;
                        } else {
                            iRound = java.lang.Math.round(numAe.intValue() * f2);
                        }
                        if (numAe2 == null) {
                            iRound2 = 0;
                        } else {
                            iRound2 = java.lang.Math.round(numAe2.intValue() * f2);
                        }
                        dropShadowParams = new com.google.android.gms.car.DropShadowParams(iRound, iRound2, resources2.getDimensionPixelSize(2131166110), resources2.getColor(2131100463, null));
                    }
                }
                nsyVar2.j = dropShadowParams;
                if (i2 == 0 || tag4 != null) {
                    nsyVar2.a(i2 ^ 1);
                    if (!z2) {
                        i7 = i3;
                    } else if (view.getTag(2131427749) != null) {
                        i7 = 2;
                    } else if (view.getTag(2131427751) != null) {
                        i7 = i5;
                    } else if (view.getTag(2131427752) != null) {
                        i7 = 8;
                    } else if (view.getTag(2131427748) != null) {
                        i7 = i4;
                    } else {
                        i7 = i3;
                    }
                    nsyVar2.b(i7);
                    set.add(carRegionId3);
                }
                java.util.Map map = this.g;
                if (nsyVar2.k != 31 && (rect4 = nsyVar2.b) != null && (rect5 = nsyVar2.e) != null) {
                    map.put(ntaVar, new defpackage.nsz(nsyVar2.a, rect4, nsyVar2.c, nsyVar2.d, rect5, nsyVar2.f, nsyVar2.g, nsyVar2.h, nsyVar2.i, nsyVar2.j));
                    ((defpackage.yge) this.h).j(carRegionId3, ntaVar);
                    V(view, carRegionId3, 2131428319);
                    W(view, carRegionId3, 2131428320);
                    if (!this.m.h) {
                        V(view, carRegionId3, 2131428322);
                        W(view, carRegionId3, 2131428321);
                    }
                    ((defpackage.yqj) yqmVar2.l().ai(5408)).R("%s z: %d, region: %s", ntaVar, java.lang.Integer.valueOf(this.J), carRegionId3);
                    this.J -= 3;
                    return;
                }
                sb = new java.lang.StringBuilder();
                if (nsyVar2.b == null) {
                    sb.append(" padding");
                }
                if ((nsyVar2.k & 1) == 0) {
                    sb.append(" roundedCorners");
                }
                if ((nsyVar2.k & 2) == 0) {
                    sb.append(" onlyShowOutlinesWhenInset");
                }
                if (nsyVar2.e == null) {
                    sb.append(" insets");
                }
                if ((nsyVar2.k & 4) == 0) {
                    sb.append(" z");
                }
                if ((nsyVar2.k & 8) == 0) {
                    sb.append(" insetBehavior");
                }
                if ((nsyVar2.k & 16) == 0) {
                    sb.append(" insetDirection");
                }
                throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            carRegionId2 = new com.google.android.gms.car.display.CarRegionId(0, this.o);
            carRegionId3 = carRegionId2;
            i = 4;
            if (view.getTag(2131427350) != null) {
                int i17 = defpackage.ygw.d;
                defpackage.ygr ygrVar2 = new defpackage.ygr(4);
                zeVar = new defpackage.ze((defpackage.zf) set);
                while (zeVar.hasNext()) {
                    com.google.android.gms.car.display.CarRegionId carRegionId5 = (com.google.android.gms.car.display.CarRegionId) zeVar.next();
                    defpackage.nta ntaVarK2 = k(carRegionId5);
                    rectH = h(ntaVarK2);
                    rectH.getClass();
                    if (!android.graphics.Rect.intersects(rect2, rectH)) {
                    }
                }
                this.k.D(ntaVarS, ygrVar2.g());
            }
            if (view.getTag(2131427754) != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            java.lang.Object tag5 = view.getTag(2131427753);
            nsyVar = new defpackage.nsy();
            nsyVar.b = new android.graphics.Rect();
            nsyVar.d(1);
            nsyVar.c(false);
            nsyVar.e = new android.graphics.Rect();
            nsyVar.a(0);
            nsyVar.b(1);
            nsyVar.j = null;
            nsyVar.g = null;
            nsyVar.a = rect2;
            rect3 = new android.graphics.Rect();
            it = list.iterator();
            while (it.hasNext()) {
                rect6 = (android.graphics.Rect) it.next();
                if (android.graphics.Rect.intersects(rect2, rect6)) {
                    int i18 = i8;
                    int i19 = i9;
                    int i110 = i;
                    defpackage.nsy nsyVar4 = nsyVar;
                    if (rect6.top <= rect2.top) {
                        if (rect6.left <= rect2.left) {
                        }
                        throw new java.lang.IllegalStateException("Persistent window overlaps another window without fully covering one side. No way to calculate insets. Window type: " + ntaVarS.name() + ", window bounds: + " + rect2.toShortString() + ", persistent bounds: " + rect6.toShortString());
                    }
                    if (rect6.left <= rect2.left) {
                    }
                    throw new java.lang.IllegalStateException("Persistent window overlaps another window without fully covering one side. No way to calculate insets. Window type: " + ntaVarS.name() + ", window bounds: + " + rect2.toShortString() + ", persistent bounds: " + rect6.toShortString());
                    i8 = i18;
                    i9 = i19;
                    i = i110;
                    nsyVar = nsyVar4;
                }
            }
            nsyVar2 = nsyVar;
            i3 = i8;
            i4 = i9;
            i5 = i;
            if (ntaVarS.equals(defpackage.nta.b)) {
                android.content.res.Resources resources3 = view.getContext().getResources();
                rect3.left = java.lang.Math.max((int) resources3.getDimension(2131165736), rect3.left);
                rect3.right = java.lang.Math.max((int) resources3.getDimension(2131165736), rect3.right);
                float dimension2 = resources3.getDimension(2131165736);
                rect3.bottom = java.lang.Math.max((int) (dimension2 + dimension2), rect3.bottom);
                ((defpackage.yqj) yqmVar2.l().ai((char) 5391)).y("Adding insets for assistant on widescreen, insets: %s", rect3);
            }
            defpackage.nta ntaVar2 = ntaVarS;
            dropShadowParams = null;
            ((defpackage.yqj) yqmVar2.l().ai(5389)).S("Recording insets for %s, insets: %s, bounds: %s, persistentViewBounds: %s", ntaVar2, rect3, rect2, list);
            tag = view.getTag(2131427750);
            if (tag instanceof java.lang.String) {
                ((defpackage.yqj) yqmVar2.l().ai((char) 5390)).y("Adding persistent bound: %s", rect2);
                list.add(rect2);
            }
            nsyVar2.e = rect3;
            nsyVar2.f = this.J;
            nsyVar2.k = (byte) (nsyVar2.k | 4);
            i6 = 30;
            if (view.getTag(2131429322) == null) {
                i6 = i3;
            }
            nsyVar2.d(i6);
            nsyVar2.b = new android.graphics.Rect(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            if (view.getTag(2131429512) != null) {
                z = i3;
            } else {
                z = 0;
            }
            nsyVar2.c(z);
            tag2 = view.getTag(2131427524);
            if (tag2 instanceof java.lang.String) {
                str = (java.lang.String) tag2;
            } else {
                str = null;
            }
            nsyVar2.g = str;
            z2 = this.B;
            if (z2) {
                numAe = ae(view, 2131428074);
                numAe2 = ae(view, 2131428075);
                if (numAe == null) {
                    android.content.res.Resources resources4 = view.getResources();
                    f2 = resources4.getDisplayMetrics().density;
                    if (numAe == null) {
                        iRound = 0;
                    } else {
                        iRound = java.lang.Math.round(numAe.intValue() * f2);
                    }
                    if (numAe2 == null) {
                        iRound2 = 0;
                    } else {
                        iRound2 = java.lang.Math.round(numAe2.intValue() * f2);
                    }
                    dropShadowParams = new com.google.android.gms.car.DropShadowParams(iRound, iRound2, resources4.getDimensionPixelSize(2131166110), resources4.getColor(2131100463, null));
                } else {
                    android.content.res.Resources resources5 = view.getResources();
                    f2 = resources5.getDisplayMetrics().density;
                    if (numAe == null) {
                        iRound = 0;
                    } else {
                        iRound = java.lang.Math.round(numAe.intValue() * f2);
                    }
                    if (numAe2 == null) {
                        iRound2 = 0;
                    } else {
                        iRound2 = java.lang.Math.round(numAe2.intValue() * f2);
                    }
                    dropShadowParams = new com.google.android.gms.car.DropShadowParams(iRound, iRound2, resources5.getDimensionPixelSize(2131166110), resources5.getColor(2131100463, null));
                }
            }
            nsyVar2.j = dropShadowParams;
            if (i2 == 0) {
                nsyVar2.a(i2 ^ 1);
                if (!z2) {
                    i7 = i3;
                } else if (view.getTag(2131427749) != null) {
                    i7 = 2;
                } else if (view.getTag(2131427751) != null) {
                    i7 = i5;
                } else if (view.getTag(2131427752) != null) {
                    i7 = 8;
                } else if (view.getTag(2131427748) != null) {
                    i7 = i4;
                } else {
                    i7 = i3;
                }
                nsyVar2.b(i7);
                set.add(carRegionId3);
            } else {
                nsyVar2.a(i2 ^ 1);
                if (!z2) {
                    i7 = i3;
                } else if (view.getTag(2131427749) != null) {
                    i7 = 2;
                } else if (view.getTag(2131427751) != null) {
                    i7 = i5;
                } else if (view.getTag(2131427752) != null) {
                    i7 = 8;
                } else if (view.getTag(2131427748) != null) {
                    i7 = i4;
                } else {
                    i7 = i3;
                }
                nsyVar2.b(i7);
                set.add(carRegionId3);
            }
            java.util.Map map2 = this.g;
            if (nsyVar2.k != 31) {
            }
            sb = new java.lang.StringBuilder();
            if (nsyVar2.b == null) {
                sb.append(" padding");
            }
            if ((nsyVar2.k & 1) == 0) {
                sb.append(" roundedCorners");
            }
            if ((nsyVar2.k & 2) == 0) {
                sb.append(" onlyShowOutlinesWhenInset");
            }
            if (nsyVar2.e == null) {
                sb.append(" insets");
            }
            if ((nsyVar2.k & 4) == 0) {
                sb.append(" z");
            }
            if ((nsyVar2.k & 8) == 0) {
                sb.append(" insetBehavior");
            }
            if ((nsyVar2.k & 16) == 0) {
                sb.append(" insetDirection");
            }
            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view;
        int childCount = viewGroup2.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            } else {
                Y(viewGroup2.getChildAt(childCount), list, set, R(view, rect));
            }
        }
    }

    private final void Z(android.view.View view, com.google.android.gms.car.display.CarRegionId carRegionId, int i, java.util.function.Function function) {
        java.lang.Object tag = view.getTag(i);
        if (tag instanceof java.lang.String) {
            com.google.android.gms.car.display.CarRegionGroup carRegionGroup = (com.google.android.gms.car.display.CarRegionGroup) a$.ExternalSyntheticApiModelOutline2.m(function, new com.google.android.gms.car.display.CarRegionGroup(java.lang.Integer.parseInt((java.lang.String) tag), this.o, carRegionId));
            this.j.t(carRegionGroup, carRegionId);
            this.i.put(carRegionId, carRegionGroup);
        }
    }

    public static int a(float f2, float f3) {
        return (int) (f2 * (160.0f / f3));
    }

    private static boolean aa(android.content.Context context) {
        int i = context.getResources().getConfiguration().screenWidthDp;
        defpackage.acyc acycVar = defpackage.acyc.a;
        int iS = (int) acycVar.fF().s();
        return (context.getResources().getConfiguration().screenWidthDp / context.getResources().getConfiguration().screenHeightDp >= acycVar.fF().a()) & (i >= iS);
    }

    private static boolean ab(android.content.Context context) {
        int i = context.getResources().getConfiguration().screenHeightDp;
        defpackage.acyc acycVar = defpackage.acyc.a;
        int iR = (int) acycVar.fF().r();
        boolean zBd = acycVar.fF().bd();
        boolean z = i >= iR;
        if (zBd) {
            return z && ((double) context.getResources().getConfiguration().screenWidthDp) / ((double) context.getResources().getConfiguration().screenHeightDp) < acycVar.fF().b();
        }
        return z;
    }

    private static boolean ac(android.content.Context context) {
        return context.getResources().getConfiguration().screenHeightDp >= ((int) defpackage.acyc.a.fF().t());
    }

    private static final com.google.android.gms.car.display.CarDisplayBlendedUiConfig ad(com.google.android.gms.car.display.CarDisplay carDisplay) {
        if (!defpackage.actb.a.fF().d()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5385)).u("Cutouts are not enabled, skipping blended UI config");
            return null;
        }
        com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig = carDisplay.i;
        if (carDisplayBlendedUiConfig != null) {
            ((defpackage.yqj) a.l().ai((char) 5384)).y("Blended UI config: %s", carDisplayBlendedUiConfig);
        }
        return carDisplayBlendedUiConfig;
    }

    private static final java.lang.Integer ae(android.view.View view, int i) {
        java.lang.Object tag = view.getTag(i);
        if (tag instanceof java.lang.Integer) {
            return (java.lang.Integer) tag;
        }
        if (!(tag instanceof java.lang.String)) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) tag));
        } catch (java.lang.NumberFormatException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).p(e2)).ai((char) 5392)).y("Failed to parse integer tag: %s", tag);
            return null;
        }
    }

    private static final boolean af(defpackage.nta ntaVar) {
        if (ntaVar != defpackage.nta.i) {
            return false;
        }
        int i = defpackage.nqx.a;
        int i2 = defpackage.nqz.a;
        defpackage.nqz nqzVar = defpackage.nqy.a;
        return nqzVar.h() && !nqzVar.g();
    }

    private static void ag(defpackage.dsf dsfVar, int i, int i2, boolean z) {
        dsfVar.j(i, 1);
        if (z) {
            dsfVar.o(i, i2);
        } else {
            dsfVar.p(i, i2);
        }
    }

    private static boolean ah(int i, defpackage.row rowVar) {
        if (defpackage.acyc.X() && i < ((int) defpackage.acyc.a.fF().f())) {
            return true;
        }
        int i2 = defpackage.nqx.a;
        int i3 = defpackage.nqz.a;
        return defpackage.nqy.a.g() || rowVar.b();
    }

    public final void A(defpackage.nst nstVar) {
        this.x.remove(nstVar);
    }

    public final void B(defpackage.nta ntaVar, defpackage.nsx nsxVar) {
        this.z.C(ntaVar, nsxVar);
    }

    public final void C(defpackage.nsv nsvVar) {
        this.v = nsvVar;
        defpackage.ze zeVar = new defpackage.ze((defpackage.zf) this.y);
        while (zeVar.hasNext()) {
            ((ajnd) zeVar.next()).j(nsvVar);
        }
    }

    public final boolean D() {
        defpackage.nsw nswVar = this.m;
        nswVar.getClass();
        return nswVar.g;
    }

    public final boolean E() {
        if (!com.google.android.gms.car.display.CarDisplayId.b(this.o)) {
            throw new java.lang.UnsupportedOperationException("This method can only be called on the primary DisplayLayout");
        }
        int i = this.m.i - 1;
        return i == 10 || i == 11 || i == 16;
    }

    public final boolean F() {
        if (com.google.android.gms.car.display.CarDisplayId.a.equals(this.o)) {
            return this.m.e;
        }
        throw new java.lang.UnsupportedOperationException("This method can only be called on the primary DisplayLayout");
    }

    public final boolean G(defpackage.nta ntaVar) {
        return h(ntaVar) != null;
    }

    public final boolean H() {
        if (!this.B) {
            return false;
        }
        defpackage.nsw nswVar = this.m;
        nswVar.getClass();
        return nswVar.h;
    }

    public final boolean I() {
        int i = this.m.i - 1;
        return i == 12 || i == 13 || i == 17 || i == 18;
    }

    public final boolean J() {
        return this.L == 1;
    }

    public final boolean K() {
        if (m() != defpackage.nti.a) {
            return true;
        }
        defpackage.nsw nswVar = this.m;
        return nswVar.b >= (nswVar.i == 2 ? 730 : 800);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028  */
    public final boolean L() {
        boolean z;
        if (this.q != defpackage.rke.a) {
            return false;
        }
        if (defpackage.acyc.bd()) {
            return true;
        }
        defpackage.nti ntiVarM = m();
        if (defpackage.acyc.bc()) {
            z = true;
        } else {
            com.google.android.gms.car.display.CarDisplay carDisplay = this.t;
            carDisplay.getClass();
            if (ad(carDisplay) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        switch (ntiVarM.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                defpackage.nsw nswVar = this.m;
                if (!ah(nswVar.c, nswVar.j)) {
                    return true;
                }
            case 1:
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return false;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return z;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return true;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public final void M() {
        defpackage.sax saxVar = this.s;
        saxVar.getClass();
        defpackage.kgu.d(new defpackage.kyo(saxVar, 12), "GH.DisplayLayout", defpackage.zbe.DISPLAY_LAYOUT, defpackage.zbd.rQ, "Car not connected during relayout", new java.lang.Object[0]);
    }

    public final int b(defpackage.nta ntaVar) {
        if (this.B) {
            return ((java.lang.Integer) t(ntaVar, new defpackage.mmf(7), 1)).intValue();
        }
        return 1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        if (this.C && defpackage.kit.b().q()) {
            defpackage.mkp.a.g();
            defpackage.qsh qshVarE = defpackage.kit.b().e();
            defpackage.wyz wyzVar = this.G;
            defpackage.rei reiVarD = ((defpackage.qtv) qshVarE).d();
            int i = 3;
            if (defpackage.omv.c("CAR.CLIENT", 3)) {
                defpackage.rrx.a("CAR.CLIENT", null, "Multi-region client enabled. UnregisterCarDisplayLayoutUpdateCompleteListener");
            }
            reiVarD.k.F(new defpackage.rdn(wyzVar, i));
            this.C = false;
        }
        defpackage.wyz wyzVar2 = this.F;
        defpackage.mib mibVarA = defpackage.mib.a();
        defpackage.wfp.c();
        mibVarA.f.remove(wyzVar2);
    }

    public final int e(defpackage.nta ntaVar) {
        if (Q(ntaVar) == 1) {
            return 0;
        }
        return this.K.getResources().getInteger(2131492897);
    }

    public final int f(defpackage.nta ntaVar) {
        defpackage.nti ntiVarM = m();
        defpackage.nti ntiVar = defpackage.nti.f;
        if (ntiVarM == ntiVar && ntaVar == defpackage.nta.h) {
            return f(defpackage.nta.g);
        }
        return (m() == ntiVar && ntaVar == defpackage.nta.d) ? f(defpackage.nta.a) : ((java.lang.Integer) t(ntaVar, new defpackage.mmf(4), 0)).intValue();
    }

    public final android.graphics.Rect g(defpackage.nta ntaVar) {
        return new android.graphics.Rect((android.graphics.Rect) t(ntaVar, new defpackage.mmf(9), new android.graphics.Rect()));
    }

    public final android.graphics.Rect h(defpackage.nta ntaVar) {
        android.graphics.Rect rect;
        defpackage.nsz nszVar = (defpackage.nsz) this.g.get(ntaVar);
        if (nszVar == null || (rect = nszVar.a) == null) {
            return null;
        }
        return new android.graphics.Rect(rect);
    }

    public final android.graphics.Rect i(defpackage.nta ntaVar) {
        return new android.graphics.Rect((android.graphics.Rect) t(ntaVar, new defpackage.mmf(10), new android.graphics.Rect()));
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e7  */
    public final defpackage.dzp j(defpackage.nta ntaVar) {
        defpackage.dzp dzpVar = new defpackage.dzp(new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(0, false, null, 0));
        defpackage.nti ntiVarM = m();
        defpackage.nsw nswVar = this.m;
        boolean z = nswVar.d;
        boolean z2 = nswVar.f;
        int i = 2130772047;
        int i2 = 2130772052;
        if (ntaVar != defpackage.nta.q && ntaVar != defpackage.nta.r) {
            boolean z3 = true;
            if (ntaVar == defpackage.nta.x) {
                defpackage.nti ntiVarM2 = m();
                defpackage.nsw nswVar2 = this.m;
                boolean z4 = nswVar2.e;
                if ((z4 || nswVar2.d == nswVar2.f) && (nswVar2.d || !z4)) {
                    z3 = false;
                }
                if (ntiVarM2 == defpackage.nti.a || ntiVarM2 == defpackage.nti.e) {
                    if (z3) {
                        i = 2130772050;
                        i2 = 2130772048;
                    } else {
                        i = 2130772051;
                        i2 = 2130772049;
                    }
                }
            } else {
                if (ntaVar != defpackage.nta.k) {
                    if (ntaVar == defpackage.nta.j || ntaVar == defpackage.nta.a || ntaVar == defpackage.nta.u || ntaVar == defpackage.nta.d || ntaVar == defpackage.nta.w) {
                        int iOrdinal = m().ordinal();
                        if (iOrdinal == 4) {
                            defpackage.nsw nswVar3 = this.m;
                            boolean z5 = nswVar3.d;
                            int i3 = true != z5 ? 2130772032 : 2130772035;
                            int i4 = true != z5 ? 2130772033 : 2130772036;
                            int i5 = true != z5 ? 2130772034 : 2130772037;
                            com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(i3, true, null, 0);
                            if (true == nswVar3.f) {
                                i4 = i5;
                            }
                            return new defpackage.dzp(projectionWindowAnimationParams, new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(i4, true, null, 0));
                        }
                        if (iOrdinal == 5) {
                            return new defpackage.dzp(new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772028, true, null, 0), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(2130772029, true, null, 0));
                        }
                    }
                    return dzpVar;
                }
                if (nswVar.e) {
                    if (z) {
                        i = 2130772051;
                        i2 = 2130772049;
                    } else {
                        i = 2130772050;
                        i2 = 2130772048;
                    }
                }
            }
        } else if (ntiVarM == defpackage.nti.a || ntiVarM == defpackage.nti.e) {
            if (z != z2) {
                i = 2130772050;
                i2 = 2130772048;
            } else {
                i = 2130772051;
                i2 = 2130772049;
            }
        }
        return new defpackage.dzp(new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(i2, false, null, 0), new com.google.android.gms.car.animation.ProjectionWindowAnimationParams(i, false, null, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.nta k(com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.ydi ydiVar = this.h;
        defpackage.ysr.bc(ydiVar.containsKey(carRegionId), "Trying to find the SystemLayoutRegionType for region %s that does not exist", carRegionId);
        defpackage.nta ntaVar = (defpackage.nta) ydiVar.get(carRegionId);
        ntaVar.getClass();
        return ntaVar;
    }

    public final defpackage.nth l() {
        android.graphics.Rect rectH = h(defpackage.nta.r);
        android.graphics.Rect rectH2 = h(defpackage.nta.q);
        if (rectH == null || rectH2 == null || rectH.width() <= 0 || rectH.height() <= 0 || rectH2.width() <= 0 || rectH2.height() <= 0) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 5399)).u("Invalid widget shade layout state");
            return null;
        }
        defpackage.nsw nswVar = this.m;
        int i = nswVar.i;
        boolean z = nswVar.d;
        boolean z2 = nswVar.f;
        com.google.android.gms.car.display.CarDisplay carDisplay = this.t;
        carDisplay.getClass();
        return new defpackage.nth(i, z, z2, rectH, rectH2, carDisplay.c / 160.0f);
    }

    public final defpackage.nti m() {
        switch (this.m.i - 1) {
            case 1:
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
            case 12:
            case 13:
            case 14:
            case 15:
            case 17:
            case 18:
                return defpackage.nti.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.nti.e;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.nti.b;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.nti.c;
            case 9:
                return defpackage.nti.d;
            case 10:
                return defpackage.nti.f;
            case 11:
                return defpackage.nti.g;
            case 16:
                return defpackage.nti.h;
            default:
                throw new java.lang.IllegalStateException("UNKNOWN_LAYOUT is not supported as a type for display ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.o))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final defpackage.qts n(defpackage.nta ntaVar) {
        android.graphics.Rect rectH = af(ntaVar) ? h(defpackage.nta.d) : h(ntaVar);
        if (rectH == null) {
            return null;
        }
        boolean z = this.B;
        if (z && ntaVar == defpackage.nta.i && af(ntaVar) && this.m.e) {
            android.graphics.Rect rect = new android.graphics.Rect(rectH);
            android.view.ViewGroup viewGroup = this.n;
            viewGroup.getClass();
            int dimension = (int) viewGroup.getContext().getResources().getDimension(2131166048);
            if (this.m.d) {
                rect.right -= dimension;
            } else {
                rect.left += dimension;
            }
            rectH = rect;
        }
        defpackage.dzp dzpVarJ = j(ntaVar);
        android.graphics.Rect rectI = i(ntaVar);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(b, ntaVar.ordinal());
        bundle.putParcelable(c, this.o);
        java.lang.String str = (java.lang.String) t(ntaVar, new defpackage.mmf(6), null);
        if (str != null) {
            bundle.putString(d, str);
        }
        int integer = rectH.top;
        int iHeight = rectH.height();
        if (z && H() && ntaVar == defpackage.nta.i) {
            android.view.ViewGroup viewGroup2 = this.n;
            viewGroup2.getClass();
            integer = viewGroup2.getContext().getResources().getInteger(2131492961);
            if (rectH.top <= integer) {
                integer = 0;
            }
            int i = rectH.top - integer;
            iHeight += i;
            rectI.top += i;
        }
        defpackage.qts qtsVar = new defpackage.qts(rectH.width(), iHeight, v());
        qtsVar.a = rectH.left;
        qtsVar.b = integer;
        qtsVar.o = rectI;
        qtsVar.p.putAll(bundle);
        qtsVar.q = (com.google.android.gms.car.display.CarRegionId) this.h.a().get(ntaVar);
        qtsVar.r = u(ntaVar);
        qtsVar.s = b(ntaVar);
        qtsVar.u = ((java.lang.Integer) t(ntaVar, new defpackage.mmf(12), 0)).intValue();
        qtsVar.t = p(ntaVar);
        qtsVar.j = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) dzpVarJ.a;
        qtsVar.k = (com.google.android.gms.car.animation.ProjectionWindowAnimationParams) dzpVarJ.b;
        qtsVar.g = f(ntaVar);
        return qtsVar;
    }

    public final defpackage.qts o(com.google.android.gms.car.display.CarRegionId carRegionId) {
        defpackage.nta ntaVarK = k(carRegionId);
        return (ntaVarK == defpackage.nta.s || ntaVarK == defpackage.nta.t) ? n(defpackage.nta.h) : n(defpackage.nta.g);
    }

    public final com.google.android.gms.car.ProjectionWindowDecorationParams p(defpackage.nta ntaVar) {
        com.google.android.gms.car.ProjectionWindowDragParams projectionWindowDragParams;
        int i;
        android.graphics.Rect rectG = g(ntaVar);
        int iQ = Q(ntaVar);
        com.google.android.gms.car.DropShadowParams dropShadowParams = (com.google.android.gms.car.DropShadowParams) t(ntaVar, new defpackage.mmf(8), null);
        if (this.B && ntaVar.equals(defpackage.nta.r) && this.q == defpackage.rke.a) {
            defpackage.nth nthVarL = l();
            if (nthVarL == null) {
                int i2 = defpackage.ygw.d;
                defpackage.ygw ygwVar = defpackage.ymx.a;
                projectionWindowDragParams = new com.google.android.gms.car.ProjectionWindowDragParams(0, ygwVar, null, ygwVar, ygwVar);
            } else {
                int i3 = true != nthVarL.a() ? 1 : 2;
                new java.util.ArrayList();
                new java.util.ArrayList();
                int i4 = defpackage.ygw.d;
                defpackage.ygw ygwVar2 = defpackage.ymx.a;
                defpackage.ygw ygwVar3 = nthVarL.e;
                java.lang.Object[] objArr = {java.lang.Integer.valueOf(((defpackage.ymx) ygwVar3).c - 1)};
                defpackage.ysr.B(objArr, 1);
                projectionWindowDragParams = new com.google.android.gms.car.ProjectionWindowDragParams(i3, ygwVar3, null, nthVarL.f, new defpackage.ymx(objArr, 1));
            }
        } else {
            int i5 = defpackage.ygw.d;
            defpackage.ygw ygwVar4 = defpackage.ymx.a;
            projectionWindowDragParams = new com.google.android.gms.car.ProjectionWindowDragParams(0, ygwVar4, null, ygwVar4, ygwVar4);
        }
        if (!rectG.equals(new android.graphics.Rect()) || iQ != 1) {
            i = iQ;
        } else {
            if (dropShadowParams == null && projectionWindowDragParams.a == 0) {
                return com.google.android.gms.car.ProjectionWindowDecorationParams.a();
            }
            i = 1;
        }
        return new com.google.android.gms.car.ProjectionWindowDecorationParams(rectG.left, rectG.top, rectG.right, rectG.bottom, i, e(ntaVar), (Q(ntaVar) != 1 && (ntaVar == defpackage.nta.j || ntaVar == defpackage.nta.w || ntaVar == defpackage.nta.x || ntaVar == defpackage.nta.g || ntaVar == defpackage.nta.h)) ? 2 : 1, ((java.lang.Boolean) t(ntaVar, new defpackage.mmf(5), java.lang.Boolean.FALSE)).booleanValue(), false, (defpackage.lem.a.a().b() && (ntaVar == defpackage.nta.s || ntaVar == defpackage.nta.t)) ? this.I : 0, dropShadowParams, projectionWindowDragParams);
    }

    public final com.google.android.gms.car.display.CarRegionGroup q(com.google.android.gms.car.display.CarRegionId carRegionId) {
        return (com.google.android.gms.car.display.CarRegionGroup) this.i.get(carRegionId);
    }

    public final com.google.android.gms.car.display.CarRegionId r(defpackage.nta ntaVar) {
        com.google.android.gms.car.display.CarRegionId carRegionId;
        defpackage.ygc ygcVar = new defpackage.ygc((defpackage.ygd) this.h.entrySet());
        while (ygcVar.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) ygcVar.next();
            if (entry.getValue() == ntaVar) {
                carRegionId = (com.google.android.gms.car.display.CarRegionId) entry.getKey();
                ntaVar.name();
                carRegionId.getClass();
                return carRegionId;
            }
        }
        carRegionId = null;
        ntaVar.name();
        carRegionId.getClass();
        return carRegionId;
    }

    public final defpackage.ygw s() {
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(this.h.entrySet()).filter(new defpackage.iux(3)).filter(new defpackage.iux(4)).map(new defpackage.mmf(11));
        int i = defpackage.ygw.d;
        return (defpackage.ygw) map.collect(defpackage.yds.a);
    }

    public final java.lang.Object t(defpackage.nta ntaVar, java.util.function.Function function, java.lang.Object obj) {
        defpackage.nsz nszVar = (defpackage.nsz) this.g.get(ntaVar);
        return nszVar == null ? obj : a$.ExternalSyntheticApiModelOutline2.m(function, nszVar);
    }

    public final java.util.List u(defpackage.nta ntaVar) {
        return defpackage.ygw.o(this.k.c(ntaVar));
    }

    public final java.util.UUID v() {
        java.util.UUID uuid = this.p;
        uuid.getClass();
        return uuid;
    }

    public final void w(defpackage.nst nstVar) {
        this.x.add(nstVar);
    }

    public final void x(defpackage.nta ntaVar, defpackage.nsx nsxVar) {
        this.z.t(ntaVar, nsxVar);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x045d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0460 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0462  */
    /* JADX WARN: Code duplicated, block: B:105:0x0464  */
    /* JADX WARN: Code duplicated, block: B:108:0x0477  */
    /* JADX WARN: Code duplicated, block: B:110:0x048b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x048d  */
    /* JADX WARN: Code duplicated, block: B:112:0x048f  */
    /* JADX WARN: Code duplicated, block: B:117:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:118:0x04b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:120:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:123:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:124:0x04cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:127:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:132:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:134:0x04e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x04e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:137:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:139:0x04f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:141:0x0500  */
    /* JADX WARN: Code duplicated, block: B:143:0x0508  */
    /* JADX WARN: Code duplicated, block: B:145:0x050f  */
    /* JADX WARN: Code duplicated, block: B:146:0x0512  */
    /* JADX WARN: Code duplicated, block: B:149:0x0525 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x0527 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0529  */
    /* JADX WARN: Code duplicated, block: B:152:0x052d  */
    /* JADX WARN: Code duplicated, block: B:154:0x0532 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0534  */
    /* JADX WARN: Code duplicated, block: B:156:0x0538  */
    /* JADX WARN: Code duplicated, block: B:159:0x053f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0541 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x0543  */
    /* JADX WARN: Code duplicated, block: B:162:0x0549  */
    /* JADX WARN: Code duplicated, block: B:164:0x0551 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0553  */
    /* JADX WARN: Code duplicated, block: B:166:0x0559  */
    /* JADX WARN: Code duplicated, block: B:170:0x0571  */
    /* JADX WARN: Code duplicated, block: B:212:0x063f  */
    /* JADX WARN: Code duplicated, block: B:215:0x064b  */
    /* JADX WARN: Code duplicated, block: B:222:0x067a  */
    /* JADX WARN: Code duplicated, block: B:223:0x067e  */
    /* JADX WARN: Code duplicated, block: B:227:0x068e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0690  */
    /* JADX WARN: Code duplicated, block: B:229:0x0694  */
    /* JADX WARN: Code duplicated, block: B:233:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:262:0x0721  */
    /* JADX WARN: Code duplicated, block: B:264:0x0738  */
    /* JADX WARN: Code duplicated, block: B:268:0x074b  */
    /* JADX WARN: Code duplicated, block: B:270:0x074e  */
    /* JADX WARN: Code duplicated, block: B:271:0x0753  */
    /* JADX WARN: Code duplicated, block: B:274:0x075b  */
    /* JADX WARN: Code duplicated, block: B:275:0x0760  */
    /* JADX WARN: Code duplicated, block: B:279:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:280:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:283:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:291:0x07c5  */
    /* JADX WARN: Code duplicated, block: B:294:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:295:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:298:0x0832  */
    /* JADX WARN: Code duplicated, block: B:300:0x0837  */
    /* JADX WARN: Code duplicated, block: B:305:0x084a  */
    /* JADX WARN: Code duplicated, block: B:308:0x0854 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x0856  */
    /* JADX WARN: Code duplicated, block: B:310:0x085d  */
    /* JADX WARN: Code duplicated, block: B:313:0x087e  */
    /* JADX WARN: Code duplicated, block: B:316:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:318:0x08a6  */
    /* JADX WARN: Code duplicated, block: B:319:0x08b2  */
    /* JADX WARN: Code duplicated, block: B:321:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:322:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:324:0x08d2  */
    /* JADX WARN: Code duplicated, block: B:329:0x08f9  */
    /* JADX WARN: Code duplicated, block: B:330:0x0906  */
    /* JADX WARN: Code duplicated, block: B:332:0x090f  */
    /* JADX WARN: Code duplicated, block: B:356:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:359:0x09da  */
    /* JADX WARN: Code duplicated, block: B:361:0x09f1  */
    /* JADX WARN: Code duplicated, block: B:363:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:365:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:366:0x0a21  */
    /* JADX WARN: Code duplicated, block: B:368:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:369:0x0a27  */
    /* JADX WARN: Code duplicated, block: B:371:0x0a2b  */
    /* JADX WARN: Code duplicated, block: B:373:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:374:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a34  */
    /* JADX WARN: Code duplicated, block: B:380:0x0a46  */
    /* JADX WARN: Code duplicated, block: B:382:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:383:0x0a58  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:386:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:388:0x0a62  */
    /* JADX WARN: Code duplicated, block: B:390:0x0a66  */
    /* JADX WARN: Code duplicated, block: B:391:0x0a68  */
    /* JADX WARN: Code duplicated, block: B:393:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:395:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:397:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:400:0x0a94 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:401:0x0a96  */
    /* JADX WARN: Code duplicated, block: B:406:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:417:0x0b3f  */
    /* JADX WARN: Code duplicated, block: B:4:0x0029  */
    /* JADX WARN: Code duplicated, block: B:96:0x0451  */
    /* JADX WARN: Code duplicated, block: B:99:0x045a  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void y(com.google.android.gms.car.display.CarDisplay carDisplay, android.graphics.Rect rect) {
        android.graphics.Rect rect2;
        android.graphics.Rect rect3;
        android.graphics.Point point;
        boolean z;
        boolean z2;
        boolean z3;
        defpackage.rke rkeVar;
        boolean z4;
        boolean z5;
        int iOrdinal;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        int i;
        defpackage.acyc acycVar;
        defpackage.yqm yqmVar;
        int i2;
        int iO;
        int i3;
        boolean z10;
        boolean z11;
        boolean z12;
        int iN;
        int i4;
        int i5;
        boolean z13;
        boolean zG;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z15;
        int i18;
        boolean z16;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z17;
        int i27;
        int i28;
        int i29;
        java.lang.String str;
        boolean z18;
        boolean z19;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout;
        defpackage.nti ntiVarM;
        boolean z20;
        android.content.res.Resources resources;
        float fMin;
        int iP;
        boolean z21;
        int iWidth;
        boolean z22;
        boolean z23;
        int iWidth2;
        boolean z24;
        com.google.android.gms.car.display.CarDisplayNativeUiElement carDisplayNativeUiElementT;
        android.graphics.Rect rect4;
        defpackage.nsw nswVar;
        com.google.android.gms.car.display.CarDisplayNativeUiElement carDisplayNativeUiElementT2;
        android.graphics.Rect rect5;
        defpackage.yqm yqmVar2;
        defpackage.ygw ygwVar;
        android.graphics.Rect rect6;
        android.graphics.Rect rect7;
        defpackage.dsf dsfVar;
        this.t = carDisplay;
        C(defpackage.nsv.c);
        android.graphics.Point point2 = carDisplay.d;
        point2.getClass();
        int i30 = carDisplay.c;
        com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfigAd = ad(carDisplay);
        defpackage.leo.a.a();
        defpackage.actb actbVar = defpackage.actb.a;
        if (actbVar.fF().h()) {
            java.util.List listB = carDisplay.b();
            if (listB != null && !listB.isEmpty()) {
                int size = listB.size();
                if (size > 1) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(1, java.util.concurrent.TimeUnit.MINUTES)).ai(5388)).B("Received %d cutouts, auto only supports at most %d cutouts.", size, 1);
                }
                rect2 = (android.graphics.Rect) listB.get(0);
            } else if (actbVar.fF().i()) {
                java.util.concurrent.TimeUnit.MINUTES.getClass();
                rect2 = new android.graphics.Rect(0, 0, 0, 0);
            } else {
                rect3 = null;
            }
            rect3 = rect2;
        } else {
            rect3 = null;
        }
        android.graphics.Rect rect8 = new android.graphics.Rect(carDisplay.a());
        android.graphics.Rect rect9 = new android.graphics.Rect(rect);
        android.graphics.Rect rect10 = rect3;
        int i31 = 2;
        if (!this.w || carDisplayBlendedUiConfigAd == null) {
            point = point2;
        } else {
            android.graphics.Rect rect11 = new android.graphics.Rect();
            java.util.List list = carDisplayBlendedUiConfigAd.b;
            if (list == null) {
                point = point2;
            } else {
                int i32 = point2.x;
                int i33 = point2.y;
                j$.util.stream.Stream streamSorted = j$.util.Collection.-EL.stream(list).filter(new mrx(3)).map(new defpackage.ngh(i31)).filter(new nsq(i32, i33, 1)).sorted(new aiq(14));
                int i34 = defpackage.ygw.d;
                j$.util.stream.Collector collector = defpackage.yds.a;
                defpackage.ygw ygwVar2 = (defpackage.ygw) streamSorted.collect(collector);
                int size2 = ygwVar2.size();
                int iMax = 0;
                int i35 = 0;
                while (true) {
                    if (i35 >= size2) {
                        point = point2;
                        break;
                    }
                    int i36 = size2;
                    android.graphics.Rect rect12 = (android.graphics.Rect) ygwVar2.get(i35);
                    point = point2;
                    if (rect12.left > iMax) {
                        break;
                    }
                    iMax = java.lang.Math.max(iMax, rect12.right);
                    i35++;
                    point2 = point;
                    size2 = i36;
                }
                rect11.left = iMax;
                defpackage.ygw ygwVar3 = (defpackage.ygw) j$.util.Collection.-EL.stream(list).filter(new mrx(4)).map(new defpackage.ngh(3)).filter(new nsp(i33, 0)).sorted(new aiq(15)).collect(collector);
                int size3 = ygwVar3.size();
                int iMax2 = 0;
                int i37 = 0;
                while (i37 < size3) {
                    android.graphics.Rect rect13 = (android.graphics.Rect) ygwVar3.get(i37);
                    defpackage.ygw ygwVar4 = ygwVar3;
                    int i38 = size3;
                    if (rect13.right < i32 - iMax2) {
                        break;
                    }
                    iMax2 = java.lang.Math.max(iMax2, i32 - rect13.left);
                    i37++;
                    ygwVar3 = ygwVar4;
                    size3 = i38;
                }
                rect11.right = iMax2;
                defpackage.ygw ygwVar5 = (defpackage.ygw) j$.util.Collection.-EL.stream(list).filter(new mrx(5)).map(new defpackage.ngh(4)).filter(new nsq(i33, i32, 0)).sorted(new aiq(16)).collect(collector);
                int size4 = ygwVar5.size();
                int iMax3 = 0;
                int i39 = 0;
                while (i39 < size4) {
                    android.graphics.Rect rect14 = (android.graphics.Rect) ygwVar5.get(i39);
                    defpackage.ygw ygwVar6 = ygwVar5;
                    if (rect14.top > iMax3) {
                        break;
                    }
                    iMax3 = java.lang.Math.max(iMax3, rect14.bottom);
                    i39++;
                    ygwVar5 = ygwVar6;
                }
                rect11.top = iMax3;
                defpackage.ygw ygwVar7 = (defpackage.ygw) j$.util.Collection.-EL.stream(list).filter(new mrx(9)).map(new defpackage.ngh(5)).filter(new nsp(i32, 2)).sorted(new aiq(17)).collect(collector);
                int size5 = ygwVar7.size();
                int iMax4 = 0;
                for (int i40 = 0; i40 < size5; i40++) {
                    android.graphics.Rect rect15 = (android.graphics.Rect) ygwVar7.get(i40);
                    if (rect15.bottom < i33 - iMax4) {
                        break;
                    }
                    iMax4 = java.lang.Math.max(iMax4, i33 - rect15.top);
                }
                rect11.bottom = iMax4;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 5371)).y("Extra insets from blended UI in compat mode: %s", rect11);
            rect8.left = java.lang.Math.max(rect8.left, rect11.left);
            rect8.top = java.lang.Math.max(rect8.top, rect11.top);
            rect8.right = java.lang.Math.max(rect8.right, rect11.right);
            rect8.bottom = java.lang.Math.max(rect8.bottom, rect11.bottom);
            rect9.left = java.lang.Math.max(rect9.left, rect11.left);
            rect9.top = java.lang.Math.max(rect9.top, rect11.top);
            rect9.right = java.lang.Math.max(rect9.right, rect11.right);
            rect9.bottom = java.lang.Math.max(rect9.bottom, rect11.bottom);
        }
        defpackage.yqm yqmVar3 = a;
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(5376);
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i30);
        android.graphics.Point point3 = point;
        yqjVar.S("displayDimensions %s, dpi %s, contentInsets: %s, displayInsets: %s", point3, numValueOf, rect8, rect9);
        android.content.Context context = this.K;
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        displayManager.getClass();
        com.google.android.gms.car.display.CarDisplayId carDisplayId = this.o;
        int i41 = 15;
        android.hardware.display.VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay(com.google.android.gms.car.display.CarDisplayId.a.equals(carDisplayId) ? "LayoutDisplay" : "LayoutDisplay".concat(carDisplayId.a()), point3.x, point3.y, i30, null, 0);
        android.content.Context contextCreateDisplayContext = context.createDisplayContext(virtualDisplayCreateVirtualDisplay.getDisplay());
        if (contextCreateDisplayContext.getResources().getConfiguration().densityDpi != i30) {
            ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.DISPLAY_LAYOUT, defpackage.zbd.rO).l());
            ((defpackage.yqj) ((defpackage.yqj) yqmVar3.g()).ai(5382)).B("Virtual display does not have the correct DPI (expected: %s, got %s), UI will not be accurate.", i30, contextCreateDisplayContext.getResources().getConfiguration().densityDpi);
        }
        android.graphics.Rect rect16 = new android.graphics.Rect(rect8.left, rect8.top, point3.x - rect8.right, point3.y - rect8.bottom);
        android.content.res.Configuration configuration = contextCreateDisplayContext.getResources().getConfiguration();
        ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai(5377)).R("contentArea: %s, DisplayDimensions: %s, VD Config: %s", rect16, point3, configuration);
        float f2 = 160.0f / i30;
        configuration.screenHeightDp = (int) (rect16.height() * f2);
        configuration.screenWidthDp = (int) (rect16.width() * f2);
        configuration.smallestScreenWidthDp = (int) (rect16.width() * f2);
        android.content.Context contextCreateConfigurationContext = contextCreateDisplayContext.createConfigurationContext(configuration);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 5378)).y("ProjectionContext: %s", contextCreateConfigurationContext.getResources().getConfiguration());
        android.graphics.Point point4 = new android.graphics.Point(rect16.width(), rect16.height());
        boolean z25 = (this.u || rect10 != null || actbVar.fF().j()) && !this.w;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 5379)).y("heroLayoutEnabled: %s", java.lang.Boolean.valueOf(z25));
        if (rect10 != null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 5381)).y("Cutout: %s", rect10);
        }
        defpackage.row rowVar = this.E;
        int i42 = this.L;
        defpackage.rke rkeVar2 = this.q;
        boolean z26 = this.D;
        boolean z27 = this.B;
        boolean zA = rowVar.a();
        defpackage.mmi.c();
        boolean zH = defpackage.mmi.h();
        if (z27) {
            z25 = z25;
            z = z25;
            z2 = true;
            z3 = true;
        } else if (z25) {
            if (defpackage.acyc.ap()) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
                z3 = false;
            }
            z = true;
        } else {
            z25 = z25;
            z2 = false;
            z3 = false;
            z = false;
        }
        boolean z28 = ac(contextCreateConfigurationContext) && !ab(contextCreateConfigurationContext);
        if (aa(contextCreateConfigurationContext) || z28) {
            rkeVar = rkeVar2;
            z4 = z26;
            boolean z29 = contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp >= 800;
            if (z3 || !z29) {
                z5 = false;
            } else {
                z5 = true;
            }
            iOrdinal = rkeVar.ordinal();
            z6 = z5;
            if (iOrdinal != 0) {
                if (rect10 == null) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                z8 = !z25;
                if (z4) {
                    if (z) {
                        i17 = point4.y;
                        if (defpackage.actb.m() && rect10 != null) {
                            z15 = z7;
                            if (rect10.bottom != i17) {
                                if (z6) {
                                    i18 = 2131624649;
                                    z16 = zH;
                                    i42 = i42;
                                } else if (zH) {
                                    if (i42 == 1) {
                                        i22 = 2131624653;
                                        i23 = 1;
                                        i42 = 1;
                                    } else {
                                        i22 = 2131624651;
                                        i23 = i42;
                                    }
                                    i18 = i22;
                                    i42 = i23;
                                    z16 = true;
                                } else {
                                    if (i42 == 1) {
                                        i20 = 2131624652;
                                        i21 = 1;
                                        i42 = 1;
                                    } else {
                                        i20 = 2131624650;
                                        i21 = i42;
                                    }
                                    i18 = i20;
                                    i42 = i21;
                                    z16 = false;
                                }
                                if (i42 == 1) {
                                    i19 = 19;
                                } else {
                                    i19 = 18;
                                }
                                iO = i18;
                                z11 = z8;
                                zH = z16;
                                yqmVar = yqmVar3;
                                i3 = i19;
                                z10 = z15;
                            }
                        } else {
                            z15 = z7;
                        }
                        if (z2) {
                            if (zH) {
                                if (i42 == 1) {
                                    i29 = 2131624625;
                                } else {
                                    i29 = 2131624623;
                                }
                                z17 = true;
                            } else {
                                if (i42 == 1) {
                                    i29 = 2131624624;
                                } else {
                                    i29 = 2131624622;
                                }
                                z17 = false;
                            }
                            i26 = i29;
                            i42 = i42;
                        } else if (zH) {
                            if (i42 == 1) {
                                i27 = 2131624648;
                                i28 = 1;
                                i42 = 1;
                            } else {
                                i27 = 2131624646;
                                i28 = i42;
                            }
                            i26 = i27;
                            i42 = i28;
                            z17 = true;
                        } else {
                            if (i42 == 1) {
                                i24 = 2131624647;
                                i25 = 1;
                                i42 = 1;
                            } else {
                                i24 = 2131624645;
                                i25 = i42;
                            }
                            i26 = i24;
                            i42 = i25;
                            z17 = false;
                        }
                        iO = i26;
                        z11 = z8;
                        zH = z17;
                        yqmVar = yqmVar3;
                        z10 = z15;
                        i3 = 5;
                        z13 = true;
                    } else {
                        z9 = z7;
                        i = contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp;
                        acycVar = defpackage.acyc.a;
                        if (i >= ((int) acycVar.fF().F()) || (zA && !defpackage.jrj.a())) {
                            yqmVar = yqmVar3;
                        } else {
                            yqmVar = yqmVar3;
                            if ((contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp > contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp) & (((double) contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp) / ((double) contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp) >= acycVar.fF().a() || !ab(contextCreateConfigurationContext))) {
                                if (z2) {
                                    if (zH) {
                                        i16 = i42 == 1 ? 2131624632 : 2131624630;
                                        z14 = true;
                                    } else {
                                        i16 = i42 == 1 ? 2131624631 : 2131624629;
                                        z14 = false;
                                    }
                                    iO = i16;
                                    i42 = i42;
                                } else if (zH) {
                                    if (i42 == 1) {
                                        i14 = 2131624661;
                                        i15 = 1;
                                        i42 = 1;
                                    } else {
                                        i14 = 2131624659;
                                        i15 = i42;
                                    }
                                    iO = i14;
                                    i42 = i42;
                                    i42 = i15;
                                    z14 = true;
                                } else {
                                    if (i42 == 1) {
                                        i12 = 2131624660;
                                        i13 = 1;
                                        i42 = 1;
                                    } else {
                                        i12 = 2131624658;
                                        i13 = i42;
                                    }
                                    iO = i12;
                                    i42 = i42;
                                    i42 = i13;
                                    z14 = false;
                                }
                                zH = z14;
                                i3 = i42 == 1 ? 6 : 5;
                                z10 = z9;
                                z11 = z8;
                                z13 = true;
                            }
                        }
                        if (!acycVar.fF().at() && contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp <= ((int) acycVar.fF().n()) && contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp >= ((int) acycVar.fF().t())) {
                            if (true != z2) {
                                i2 = 2131624654;
                            } else {
                                i2 = 2131624626;
                            }
                            iO = i2;
                            i3 = 17;
                        } else {
                            if (ab(contextCreateConfigurationContext)) {
                                if (true != z2) {
                                    i11 = 2131624655;
                                } else {
                                    i11 = 2131624627;
                                }
                                iO = i11;
                                i10 = 11;
                            } else if (!z6 || aa(contextCreateConfigurationContext)) {
                                if (((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a().g("key_settings_show_rail_widget", false) || ah(contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp, rowVar)) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z2) {
                                    iN = O(z12, zH, i42);
                                } else {
                                    iN = N(z12, zH, i42);
                                }
                                iO = iN;
                                if (i42 == 1) {
                                    i4 = 14;
                                    i5 = 1;
                                    i42 = 1;
                                } else {
                                    i4 = 13;
                                    i5 = i42;
                                }
                                zH = zH;
                                z13 = z12;
                                i42 = i42;
                                i3 = i4;
                                z11 = z8;
                                i42 = i5;
                                z10 = z9;
                            } else if (ac(contextCreateConfigurationContext)) {
                                iO = true != z2 ? 2131624657 : 2131624628;
                                i10 = 12;
                            } else {
                                if (contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp < ((int) acycVar.fF().f())) {
                                    if (i42 == 1) {
                                        i9 = 1;
                                        i42 = 1;
                                        i41 = 16;
                                    } else {
                                        i9 = i42;
                                    }
                                    i6 = i9;
                                    zG = true;
                                } else if (rowVar.b()) {
                                    if (i42 == 1) {
                                        i8 = 4;
                                        i7 = 1;
                                        i42 = 1;
                                    } else {
                                        i7 = i42;
                                        i8 = 3;
                                    }
                                    i41 = i8;
                                    i6 = i7;
                                    zG = true;
                                } else {
                                    int i43 = defpackage.nqx.a;
                                    int i44 = defpackage.nqz.a;
                                    zG = defpackage.nqy.a.g();
                                    i6 = i42;
                                    i41 = 2;
                                }
                                iO = z2 ? O(zG, zH, i42) : N(zG, zH, i42);
                                zH = zH;
                                z13 = zG;
                                i42 = i6;
                                z10 = z9;
                                i3 = i41;
                                z11 = z8;
                            }
                            i3 = i10;
                        }
                        z10 = z9;
                        z11 = z8;
                    }
                    defpackage.yqj yqjVar2 = (defpackage.yqj) yqmVar.l().ai(5393);
                    java.lang.String resourceEntryName = contextCreateConfigurationContext.getResources().getResourceEntryName(iO);
                    java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp);
                    java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp);
                    if (i42 == 1) {
                        str = "Right";
                    } else {
                        str = "Left or Center";
                    }
                    yqjVar2.T("Will use layout: %s for display with (w=%d,h=%d), %d dpi, driver on %s", resourceEntryName, numValueOf2, numValueOf3, numValueOf, str);
                    if (rect8.left <= 0 || rect8.right > 0 || rect8.top > 0 || rect8.bottom > 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    int i45 = contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp;
                    int i46 = contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp;
                    if (i42 == 1) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    defpackage.nsw nswVar2 = new defpackage.nsw(iO, i45, i46, i3, z19, z13, rowVar, zH, z, z18);
                    ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).v(nswVar2.b, nswVar2.c, i3);
                    this.m = nswVar2;
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5380)).y("LayoutInfo: %s", this.m);
                    constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(contextCreateConfigurationContext).inflate(this.m.a, (android.view.ViewGroup) null);
                    ntiVarM = m();
                    z20 = true;
                    if (true != z10) {
                        U(constraintLayout, rect8);
                        if (!z27 && ntiVarM == defpackage.nti.f) {
                            U((androidx.constraintlayout.widget.ConstraintLayout) constraintLayout.findViewById(2131428792), rect8);
                        }
                        z20 = true;
                    }
                    if (z20 != z11) {
                        if (constraintLayout.findViewById(2131427896) != null) {
                            if (z20 != z10) {
                                rect7 = new android.graphics.Rect(0, 0, 0, 0);
                            } else {
                                rect7 = rect10;
                            }
                            dsfVar = new defpackage.dsf();
                            dsfVar.e(constraintLayout);
                            dsfVar.i(2131427896, rect7.width());
                            dsfVar.h(2131427896, rect7.height());
                            dsfVar.r(2131427896, 3, 3, rect7.top);
                            if (rect7.left != 0) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5365)).u("Moving cutout to right side for RHD");
                                dsfVar.d(2131427896, 1);
                                dsfVar.g(2131427896, 2, 0, 2);
                                dsfVar.g(2131427897, 2, 2131427896, 1);
                                dsfVar.g(2131427897, 1, 0, 1);
                            }
                            dsfVar.c(constraintLayout);
                        }
                        if (carDisplayBlendedUiConfigAd != null) {
                            if (!this.m.e) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5374)).u("No vertical rail, cannot adjust passenger rail width");
                            } else if (constraintLayout.findViewById(2131429139) == null) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5373)).u("Passenger rail is null, cannot adjust passenger rail width");
                            } else {
                                carDisplayNativeUiElementT = T(carDisplayBlendedUiConfigAd, i30, this.m.b, false);
                                if (carDisplayNativeUiElementT != null && (rect4 = carDisplayNativeUiElementT.a) != null) {
                                    int iWidth3 = rect4.width();
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5372)).w("Adjusting passenger rail width to %d based on blended UI", iWidth3);
                                    defpackage.dsf dsfVar2 = new defpackage.dsf();
                                    dsfVar2.e(constraintLayout);
                                    dsfVar2.i(2131429139, iWidth3);
                                    dsfVar2.c(constraintLayout);
                                }
                            }
                            nswVar = this.m;
                            if (nswVar.e) {
                                carDisplayNativeUiElementT2 = T(carDisplayBlendedUiConfigAd, i30, nswVar.b, true);
                                if (carDisplayNativeUiElementT2 != null || (rect5 = carDisplayNativeUiElementT2.a) == null) {
                                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5366)).u("Native driver rail is null or has no position, cannot adjust driver side rails width");
                                } else {
                                    java.util.List list2 = carDisplayBlendedUiConfigAd.b;
                                    if (list2 == null) {
                                        yqmVar2 = yqmVar;
                                        ((defpackage.yqj) yqmVar2.l().ai((char) 5396)).u("Native UI elements are null, no native status bars provided");
                                        int i47 = defpackage.ygw.d;
                                        ygwVar = defpackage.ymx.a;
                                    } else {
                                        yqmVar2 = yqmVar;
                                        j$.util.stream.Stream streamFilter = j$.util.Collection.-EL.stream(list2).filter(new mrx(8));
                                        int i48 = defpackage.ygw.d;
                                        ygwVar = (defpackage.ygw) streamFilter.collect(defpackage.yds.a);
                                    }
                                    com.google.android.gms.car.display.CarDisplayNativeUiElement carDisplayNativeUiElement = (com.google.android.gms.car.display.CarDisplayNativeUiElement) j$.util.Collection.-EL.stream(ygwVar).findFirst().orElse((java.lang.Object) null);
                                    int iWidth4 = (carDisplayNativeUiElement == null || (rect6 = carDisplayNativeUiElement.a) == null) ? 0 : rect6.width();
                                    defpackage.dsf dsfVar3 = new defpackage.dsf();
                                    dsfVar3.e(constraintLayout);
                                    if (iWidth4 == 0) {
                                        int iWidth5 = rect5.width();
                                        ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai((char) 5368)).w("Adjusting driver rail width to %d based on blended UI (no status bar)", iWidth5);
                                        if (constraintLayout.findViewById(2131428070) != null) {
                                            dsfVar3.i(2131428070, iWidth5);
                                        }
                                    } else {
                                        int iWidth6 = (rect5.width() + iWidth4) / 2;
                                        ((defpackage.yqj) ((defpackage.yqj) yqmVar2.f()).ai(5367)).R("Adjusting driver and system rail width to %d based on blended UI (rail: %d, status bar: %d)", java.lang.Integer.valueOf(iWidth6), java.lang.Integer.valueOf(rect5.width()), java.lang.Integer.valueOf(iWidth4));
                                        if (constraintLayout.findViewById(2131428070) != null) {
                                            dsfVar3.i(2131428070, iWidth6);
                                        }
                                        if (constraintLayout.findViewById(2131429264) != null) {
                                            dsfVar3.i(2131429264, iWidth6);
                                        }
                                    }
                                    dsfVar3.c(constraintLayout);
                                }
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5369)).u("No vertical rail, cannot adjust driver side rails width");
                            }
                        }
                    }
                    if (ntiVarM == defpackage.nti.e) {
                        defpackage.mmi.c();
                        iP = P(constraintLayout, defpackage.mmi.h(), rect10);
                        X(constraintLayout, rect8, iP, rect10);
                        if (constraintLayout.findViewById(2131428407) != null) {
                            defpackage.mmi.c();
                            if (!defpackage.mmi.h()) {
                                android.content.res.Resources resources2 = constraintLayout.getContext().getResources();
                                defpackage.dsf dsfVar4 = new defpackage.dsf();
                                dsfVar4.e(constraintLayout);
                                int iMin = java.lang.Math.min(resources2.getDimensionPixelOffset(2131165376), iP) + resources2.getDimensionPixelOffset(2131165785);
                                if (i42 == 0) {
                                    z23 = true;
                                } else {
                                    z23 = false;
                                }
                                if (z23) {
                                    iWidth2 = rect8.left;
                                } else {
                                    iWidth2 = rect8.right;
                                }
                                if (rect10 != null) {
                                    if (rect10.left != 0) {
                                        z24 = false;
                                    } else {
                                        z24 = true;
                                    }
                                    if (z24 == z23) {
                                        iWidth2 += rect10.width();
                                    }
                                }
                                ag(dsfVar4, 2131428407, iMin + iWidth2, z23);
                                dsfVar4.c(constraintLayout);
                            }
                        }
                        if (this.m.f) {
                            defpackage.dsf dsfVar5 = new defpackage.dsf();
                            dsfVar5.e(constraintLayout);
                            int iP2 = P(constraintLayout, false, rect10);
                            if (i42 == 1) {
                                z21 = true;
                            } else {
                                z21 = false;
                            }
                            if (z21) {
                                iWidth = rect8.left;
                            } else {
                                iWidth = rect8.right;
                            }
                            if (rect10 != null) {
                                if (rect10.left != 0) {
                                    z22 = false;
                                } else {
                                    z22 = true;
                                }
                                if (z22 == z21) {
                                    iWidth += rect10.width();
                                }
                            }
                            ag(dsfVar5, 2131427458, iP2 + iWidth, z21);
                            dsfVar5.c(constraintLayout);
                        }
                    } else if (!this.m.g && ntiVarM == defpackage.nti.a) {
                        defpackage.mmi.c();
                        X(constraintLayout, rect8, P(constraintLayout, defpackage.mmi.h(), rect10), rect10);
                    } else if (z27 && ntiVarM == defpackage.nti.f) {
                        defpackage.dsf dsfVar6 = new defpackage.dsf();
                        dsfVar6.e(constraintLayout);
                        int dimensionPixelSize = rect16.top + (((rect16.bottom - rect16.top) - constraintLayout.getContext().getResources().getDimensionPixelSize(2131166047)) / 2);
                        dsfVar6.j(2131427460, 0);
                        dsfVar6.o(2131427460, dimensionPixelSize);
                        dsfVar6.c(constraintLayout);
                    }
                    defpackage.leq.a.a();
                    if (defpackage.acyc.a.fF().aB() && ((ntiVarM == defpackage.nti.f || ntiVarM == defpackage.nti.h || ntiVarM == defpackage.nti.g) && constraintLayout.findViewById(2131427919) != null)) {
                        resources = contextCreateConfigurationContext.getResources();
                        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                        float fApplyDimension = android.util.TypedValue.applyDimension(1, contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp, displayMetrics);
                        fMin = java.lang.Math.min(resources.getDimension(2131168112) + (java.lang.Math.max(defpackage.dvi.a(resources, 2131168114), fApplyDimension - resources.getDimension(2131168115)) * defpackage.dvi.a(resources, 2131168113)), fApplyDimension - android.util.TypedValue.applyDimension(1, defpackage.acyc.F(), displayMetrics));
                        if (z27) {
                            float dimension = resources.getDimension(2131165571);
                            fMin += dimension + dimension;
                        }
                        int iRound = java.lang.Math.round(fMin);
                        defpackage.dsf dsfVar7 = new defpackage.dsf();
                        dsfVar7.e(constraintLayout);
                        dsfVar7.h(2131427919, iRound);
                        dsfVar7.c(constraintLayout);
                    }
                    constraintLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(point3.x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(point3.y, 1073741824));
                    constraintLayout.layout(0, 0, point3.x, point3.y);
                    this.n = constraintLayout;
                    this.p = java.util.UUID.fromString(carDisplay.g);
                    z(rect9);
                    this.A.m(ntiVarM);
                    virtualDisplayCreateVirtualDisplay.release();
                }
                iO = 2131624656;
                z11 = z8;
                zH = zH;
                i42 = i42;
                z10 = z7;
                yqmVar = yqmVar3;
                i3 = 15;
            } else if (iOrdinal != 1) {
                if (rect10 == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z11 = !z25;
                iO = 2131624633;
                if (defpackage.acvb.j() || !zA) {
                    zH = zH;
                    i42 = i42;
                    yqmVar = yqmVar3;
                    i3 = 8;
                } else {
                    iO = 2131624634;
                    zH = zH;
                    i42 = i42;
                    yqmVar = yqmVar3;
                    i3 = 9;
                }
            } else {
                if (iOrdinal == 2) {
                    throw new java.lang.IllegalStateException("Can't get layout info for CarDisplayType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rkeVar))));
                }
                if (rect10 == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                z11 = !z25;
                iO = 2131624613;
                zH = zH;
                i42 = i42;
                i3 = 10;
                yqmVar = yqmVar3;
            }
            z13 = false;
            defpackage.yqj yqjVar3 = (defpackage.yqj) yqmVar.l().ai(5393);
            java.lang.String resourceEntryName2 = contextCreateConfigurationContext.getResources().getResourceEntryName(iO);
            java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp);
            java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp);
            if (i42 == 1) {
                str = "Right";
            } else {
                str = "Left or Center";
            }
            yqjVar3.T("Will use layout: %s for display with (w=%d,h=%d), %d dpi, driver on %s", resourceEntryName2, numValueOf4, numValueOf5, numValueOf, str);
            if (rect8.left <= 0) {
                z18 = true;
            } else {
                z18 = true;
            }
            int i49 = contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp;
            int i410 = contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp;
            if (i42 == 1) {
                z19 = true;
            } else {
                z19 = false;
            }
            defpackage.nsw nswVar3 = new defpackage.nsw(iO, i49, i410, i3, z19, z13, rowVar, zH, z, z18);
            ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).v(nswVar3.b, nswVar3.c, i3);
            this.m = nswVar3;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5380)).y("LayoutInfo: %s", this.m);
            constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(contextCreateConfigurationContext).inflate(this.m.a, (android.view.ViewGroup) null);
            ntiVarM = m();
            z20 = true;
            if (true != z10) {
                U(constraintLayout, rect8);
                if (!z27) {
                    U((androidx.constraintlayout.widget.ConstraintLayout) constraintLayout.findViewById(2131428792), rect8);
                }
                z20 = true;
            }
            if (z20 != z11) {
                if (constraintLayout.findViewById(2131427896) != null) {
                    if (z20 != z10) {
                        rect7 = new android.graphics.Rect(0, 0, 0, 0);
                    } else {
                        rect7 = rect10;
                    }
                    dsfVar = new defpackage.dsf();
                    dsfVar.e(constraintLayout);
                    dsfVar.i(2131427896, rect7.width());
                    dsfVar.h(2131427896, rect7.height());
                    dsfVar.r(2131427896, 3, 3, rect7.top);
                    if (rect7.left != 0) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5365)).u("Moving cutout to right side for RHD");
                        dsfVar.d(2131427896, 1);
                        dsfVar.g(2131427896, 2, 0, 2);
                        dsfVar.g(2131427897, 2, 2131427896, 1);
                        dsfVar.g(2131427897, 1, 0, 1);
                    }
                    dsfVar.c(constraintLayout);
                }
                if (carDisplayBlendedUiConfigAd != null) {
                    if (!this.m.e) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5374)).u("No vertical rail, cannot adjust passenger rail width");
                    } else if (constraintLayout.findViewById(2131429139) == null) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5373)).u("Passenger rail is null, cannot adjust passenger rail width");
                    } else {
                        carDisplayNativeUiElementT = T(carDisplayBlendedUiConfigAd, i30, this.m.b, false);
                        if (carDisplayNativeUiElementT != null) {
                            int iWidth7 = rect4.width();
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5372)).w("Adjusting passenger rail width to %d based on blended UI", iWidth7);
                            defpackage.dsf dsfVar8 = new defpackage.dsf();
                            dsfVar8.e(constraintLayout);
                            dsfVar8.i(2131429139, iWidth7);
                            dsfVar8.c(constraintLayout);
                        }
                    }
                    nswVar = this.m;
                    if (nswVar.e) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5369)).u("No vertical rail, cannot adjust driver side rails width");
                    } else {
                        carDisplayNativeUiElementT2 = T(carDisplayBlendedUiConfigAd, i30, nswVar.b, true);
                        if (carDisplayNativeUiElementT2 != null) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5366)).u("Native driver rail is null or has no position, cannot adjust driver side rails width");
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5366)).u("Native driver rail is null or has no position, cannot adjust driver side rails width");
                        }
                    }
                }
            }
            if (ntiVarM == defpackage.nti.e) {
                defpackage.mmi.c();
                iP = P(constraintLayout, defpackage.mmi.h(), rect10);
                X(constraintLayout, rect8, iP, rect10);
                if (constraintLayout.findViewById(2131428407) != null) {
                    defpackage.mmi.c();
                    if (!defpackage.mmi.h()) {
                        android.content.res.Resources resources3 = constraintLayout.getContext().getResources();
                        defpackage.dsf dsfVar9 = new defpackage.dsf();
                        dsfVar9.e(constraintLayout);
                        int iMin2 = java.lang.Math.min(resources3.getDimensionPixelOffset(2131165376), iP) + resources3.getDimensionPixelOffset(2131165785);
                        if (i42 == 0) {
                            z23 = true;
                        } else {
                            z23 = false;
                        }
                        if (z23) {
                            iWidth2 = rect8.left;
                        } else {
                            iWidth2 = rect8.right;
                        }
                        if (rect10 != null) {
                            if (rect10.left != 0) {
                                z24 = false;
                            } else {
                                z24 = true;
                            }
                            if (z24 == z23) {
                                iWidth2 += rect10.width();
                            }
                        }
                        ag(dsfVar9, 2131428407, iMin2 + iWidth2, z23);
                        dsfVar9.c(constraintLayout);
                    }
                }
                if (this.m.f) {
                    defpackage.dsf dsfVar10 = new defpackage.dsf();
                    dsfVar10.e(constraintLayout);
                    int iP3 = P(constraintLayout, false, rect10);
                    if (i42 == 1) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (z21) {
                        iWidth = rect8.left;
                    } else {
                        iWidth = rect8.right;
                    }
                    if (rect10 != null) {
                        if (rect10.left != 0) {
                            z22 = false;
                        } else {
                            z22 = true;
                        }
                        if (z22 == z21) {
                            iWidth += rect10.width();
                        }
                    }
                    ag(dsfVar10, 2131427458, iP3 + iWidth, z21);
                    dsfVar10.c(constraintLayout);
                }
            } else if (!this.m.g) {
                if (z27) {
                    defpackage.dsf dsfVar11 = new defpackage.dsf();
                    dsfVar11.e(constraintLayout);
                    int dimensionPixelSize2 = rect16.top + (((rect16.bottom - rect16.top) - constraintLayout.getContext().getResources().getDimensionPixelSize(2131166047)) / 2);
                    dsfVar11.j(2131427460, 0);
                    dsfVar11.o(2131427460, dimensionPixelSize2);
                    dsfVar11.c(constraintLayout);
                }
            } else if (z27) {
                defpackage.dsf dsfVar12 = new defpackage.dsf();
                dsfVar12.e(constraintLayout);
                int dimensionPixelSize3 = rect16.top + (((rect16.bottom - rect16.top) - constraintLayout.getContext().getResources().getDimensionPixelSize(2131166047)) / 2);
                dsfVar12.j(2131427460, 0);
                dsfVar12.o(2131427460, dimensionPixelSize3);
                dsfVar12.c(constraintLayout);
            }
            defpackage.leq.a.a();
            if (defpackage.acyc.a.fF().aB()) {
                resources = contextCreateConfigurationContext.getResources();
                android.util.DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
                float fApplyDimension2 = android.util.TypedValue.applyDimension(1, contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp, displayMetrics2);
                fMin = java.lang.Math.min(resources.getDimension(2131168112) + (java.lang.Math.max(defpackage.dvi.a(resources, 2131168114), fApplyDimension2 - resources.getDimension(2131168115)) * defpackage.dvi.a(resources, 2131168113)), fApplyDimension2 - android.util.TypedValue.applyDimension(1, defpackage.acyc.F(), displayMetrics2));
                if (z27) {
                    float dimension2 = resources.getDimension(2131165571);
                    fMin += dimension2 + dimension2;
                }
                int iRound2 = java.lang.Math.round(fMin);
                defpackage.dsf dsfVar13 = new defpackage.dsf();
                dsfVar13.e(constraintLayout);
                dsfVar13.h(2131427919, iRound2);
                dsfVar13.c(constraintLayout);
            }
            constraintLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(point3.x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(point3.y, 1073741824));
            constraintLayout.layout(0, 0, point3.x, point3.y);
            this.n = constraintLayout;
            this.p = java.util.UUID.fromString(carDisplay.g);
            z(rect9);
            this.A.m(ntiVarM);
            virtualDisplayCreateVirtualDisplay.release();
        }
        rkeVar = rkeVar2;
        z4 = z26;
        if (z3) {
            z5 = false;
        } else {
            z5 = false;
        }
        iOrdinal = rkeVar.ordinal();
        z6 = z5;
        if (iOrdinal != 0) {
            if (rect10 == null) {
                z7 = false;
            } else {
                z7 = true;
            }
            z8 = !z25;
            if (z4) {
                if (z) {
                    i17 = point4.y;
                    if (defpackage.actb.m()) {
                        z15 = z7;
                    } else {
                        z15 = z7;
                        if (rect10.bottom != i17) {
                            if (z6) {
                                i18 = 2131624649;
                                z16 = zH;
                                i42 = i42;
                            } else if (zH) {
                                if (i42 == 1) {
                                    i22 = 2131624653;
                                    i23 = 1;
                                    i42 = 1;
                                } else {
                                    i22 = 2131624651;
                                    i23 = i42;
                                }
                                i18 = i22;
                                i42 = i23;
                                z16 = true;
                            } else {
                                if (i42 == 1) {
                                    i20 = 2131624652;
                                    i21 = 1;
                                    i42 = 1;
                                } else {
                                    i20 = 2131624650;
                                    i21 = i42;
                                }
                                i18 = i20;
                                i42 = i21;
                                z16 = false;
                            }
                            if (i42 == 1) {
                                i19 = 19;
                            } else {
                                i19 = 18;
                            }
                            iO = i18;
                            z11 = z8;
                            zH = z16;
                            yqmVar = yqmVar3;
                            i3 = i19;
                            z10 = z15;
                        }
                    }
                    if (z2) {
                        if (zH) {
                            if (i42 == 1) {
                                i29 = 2131624625;
                            } else {
                                i29 = 2131624623;
                            }
                            z17 = true;
                        } else {
                            if (i42 == 1) {
                                i29 = 2131624624;
                            } else {
                                i29 = 2131624622;
                            }
                            z17 = false;
                        }
                        i26 = i29;
                        i42 = i42;
                    } else if (zH) {
                        if (i42 == 1) {
                            i27 = 2131624648;
                            i28 = 1;
                            i42 = 1;
                        } else {
                            i27 = 2131624646;
                            i28 = i42;
                        }
                        i26 = i27;
                        i42 = i28;
                        z17 = true;
                    } else {
                        if (i42 == 1) {
                            i24 = 2131624647;
                            i25 = 1;
                            i42 = 1;
                        } else {
                            i24 = 2131624645;
                            i25 = i42;
                        }
                        i26 = i24;
                        i42 = i25;
                        z17 = false;
                    }
                    iO = i26;
                    z11 = z8;
                    zH = z17;
                    yqmVar = yqmVar3;
                    z10 = z15;
                    i3 = 5;
                    z13 = true;
                } else {
                    z9 = z7;
                    i = contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp;
                    acycVar = defpackage.acyc.a;
                    if (i >= ((int) acycVar.fF().F())) {
                        yqmVar = yqmVar3;
                    } else {
                        yqmVar = yqmVar3;
                    }
                    if (acycVar.fF().at()) {
                        if (ab(contextCreateConfigurationContext)) {
                            if (true != z2) {
                                i11 = 2131624655;
                            } else {
                                i11 = 2131624627;
                            }
                            iO = i11;
                            i10 = 11;
                        } else if (z6) {
                            if (((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a().g("key_settings_show_rail_widget", false)) {
                                z12 = true;
                            } else {
                                z12 = true;
                            }
                            if (z2) {
                                iN = O(z12, zH, i42);
                            } else {
                                iN = N(z12, zH, i42);
                            }
                            iO = iN;
                            if (i42 == 1) {
                                i4 = 14;
                                i5 = 1;
                                i42 = 1;
                            } else {
                                i4 = 13;
                                i5 = i42;
                            }
                            zH = zH;
                            z13 = z12;
                            i42 = i42;
                            i3 = i4;
                            z11 = z8;
                            i42 = i5;
                            z10 = z9;
                        } else {
                            if (((defpackage.mkw) defpackage.mkp.a.i(defpackage.mkw.class)).a().g("key_settings_show_rail_widget", false)) {
                                z12 = true;
                            } else {
                                z12 = true;
                            }
                            if (z2) {
                                iN = O(z12, zH, i42);
                            } else {
                                iN = N(z12, zH, i42);
                            }
                            iO = iN;
                            if (i42 == 1) {
                                i4 = 14;
                                i5 = 1;
                                i42 = 1;
                            } else {
                                i4 = 13;
                                i5 = i42;
                            }
                            zH = zH;
                            z13 = z12;
                            i42 = i42;
                            i3 = i4;
                            z11 = z8;
                            i42 = i5;
                            z10 = z9;
                        }
                        i3 = i10;
                        z10 = z9;
                        z11 = z8;
                    } else {
                        if (true != z2) {
                            i2 = 2131624654;
                        } else {
                            i2 = 2131624626;
                        }
                        iO = i2;
                        i3 = 17;
                        z10 = z9;
                        z11 = z8;
                    }
                }
                defpackage.yqj yqjVar4 = (defpackage.yqj) yqmVar.l().ai(5393);
                java.lang.String resourceEntryName3 = contextCreateConfigurationContext.getResources().getResourceEntryName(iO);
                java.lang.Integer numValueOf6 = java.lang.Integer.valueOf(contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp);
                java.lang.Integer numValueOf7 = java.lang.Integer.valueOf(contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp);
                if (i42 == 1) {
                    str = "Right";
                } else {
                    str = "Left or Center";
                }
                yqjVar4.T("Will use layout: %s for display with (w=%d,h=%d), %d dpi, driver on %s", resourceEntryName3, numValueOf6, numValueOf7, numValueOf, str);
                if (rect8.left <= 0) {
                    z18 = true;
                } else {
                    z18 = true;
                }
                int i411 = contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp;
                int i412 = contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp;
                if (i42 == 1) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                defpackage.nsw nswVar4 = new defpackage.nsw(iO, i411, i412, i3, z19, z13, rowVar, zH, z, z18);
                ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).v(nswVar4.b, nswVar4.c, i3);
                this.m = nswVar4;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5380)).y("LayoutInfo: %s", this.m);
                constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(contextCreateConfigurationContext).inflate(this.m.a, (android.view.ViewGroup) null);
                ntiVarM = m();
                z20 = true;
                if (true != z10) {
                    U(constraintLayout, rect8);
                    if (!z27) {
                        U((androidx.constraintlayout.widget.ConstraintLayout) constraintLayout.findViewById(2131428792), rect8);
                    }
                    z20 = true;
                }
                if (z20 != z11) {
                    if (constraintLayout.findViewById(2131427896) != null) {
                        if (z20 != z10) {
                            rect7 = new android.graphics.Rect(0, 0, 0, 0);
                        } else {
                            rect7 = rect10;
                        }
                        dsfVar = new defpackage.dsf();
                        dsfVar.e(constraintLayout);
                        dsfVar.i(2131427896, rect7.width());
                        dsfVar.h(2131427896, rect7.height());
                        dsfVar.r(2131427896, 3, 3, rect7.top);
                        if (rect7.left != 0) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5365)).u("Moving cutout to right side for RHD");
                            dsfVar.d(2131427896, 1);
                            dsfVar.g(2131427896, 2, 0, 2);
                            dsfVar.g(2131427897, 2, 2131427896, 1);
                            dsfVar.g(2131427897, 1, 0, 1);
                        }
                        dsfVar.c(constraintLayout);
                    }
                    if (carDisplayBlendedUiConfigAd != null) {
                        if (!this.m.e) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5374)).u("No vertical rail, cannot adjust passenger rail width");
                        } else if (constraintLayout.findViewById(2131429139) == null) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5373)).u("Passenger rail is null, cannot adjust passenger rail width");
                        } else {
                            carDisplayNativeUiElementT = T(carDisplayBlendedUiConfigAd, i30, this.m.b, false);
                            if (carDisplayNativeUiElementT != null) {
                                int iWidth8 = rect4.width();
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5372)).w("Adjusting passenger rail width to %d based on blended UI", iWidth8);
                                defpackage.dsf dsfVar14 = new defpackage.dsf();
                                dsfVar14.e(constraintLayout);
                                dsfVar14.i(2131429139, iWidth8);
                                dsfVar14.c(constraintLayout);
                            }
                        }
                        nswVar = this.m;
                        if (nswVar.e) {
                            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5369)).u("No vertical rail, cannot adjust driver side rails width");
                        } else {
                            carDisplayNativeUiElementT2 = T(carDisplayBlendedUiConfigAd, i30, nswVar.b, true);
                            if (carDisplayNativeUiElementT2 != null) {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5366)).u("Native driver rail is null or has no position, cannot adjust driver side rails width");
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5366)).u("Native driver rail is null or has no position, cannot adjust driver side rails width");
                            }
                        }
                    }
                }
                if (ntiVarM == defpackage.nti.e) {
                    defpackage.mmi.c();
                    iP = P(constraintLayout, defpackage.mmi.h(), rect10);
                    X(constraintLayout, rect8, iP, rect10);
                    if (constraintLayout.findViewById(2131428407) != null) {
                        defpackage.mmi.c();
                        if (!defpackage.mmi.h()) {
                            android.content.res.Resources resources4 = constraintLayout.getContext().getResources();
                            defpackage.dsf dsfVar15 = new defpackage.dsf();
                            dsfVar15.e(constraintLayout);
                            int iMin3 = java.lang.Math.min(resources4.getDimensionPixelOffset(2131165376), iP) + resources4.getDimensionPixelOffset(2131165785);
                            if (i42 == 0) {
                                z23 = true;
                            } else {
                                z23 = false;
                            }
                            if (z23) {
                                iWidth2 = rect8.left;
                            } else {
                                iWidth2 = rect8.right;
                            }
                            if (rect10 != null) {
                                if (rect10.left != 0) {
                                    z24 = false;
                                } else {
                                    z24 = true;
                                }
                                if (z24 == z23) {
                                    iWidth2 += rect10.width();
                                }
                            }
                            ag(dsfVar15, 2131428407, iMin3 + iWidth2, z23);
                            dsfVar15.c(constraintLayout);
                        }
                    }
                    if (this.m.f) {
                        defpackage.dsf dsfVar16 = new defpackage.dsf();
                        dsfVar16.e(constraintLayout);
                        int iP4 = P(constraintLayout, false, rect10);
                        if (i42 == 1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (z21) {
                            iWidth = rect8.left;
                        } else {
                            iWidth = rect8.right;
                        }
                        if (rect10 != null) {
                            if (rect10.left != 0) {
                                z22 = false;
                            } else {
                                z22 = true;
                            }
                            if (z22 == z21) {
                                iWidth += rect10.width();
                            }
                        }
                        ag(dsfVar16, 2131427458, iP4 + iWidth, z21);
                        dsfVar16.c(constraintLayout);
                    }
                } else if (!this.m.g) {
                    if (z27) {
                        defpackage.dsf dsfVar17 = new defpackage.dsf();
                        dsfVar17.e(constraintLayout);
                        int dimensionPixelSize4 = rect16.top + (((rect16.bottom - rect16.top) - constraintLayout.getContext().getResources().getDimensionPixelSize(2131166047)) / 2);
                        dsfVar17.j(2131427460, 0);
                        dsfVar17.o(2131427460, dimensionPixelSize4);
                        dsfVar17.c(constraintLayout);
                    }
                } else if (z27) {
                    defpackage.dsf dsfVar18 = new defpackage.dsf();
                    dsfVar18.e(constraintLayout);
                    int dimensionPixelSize5 = rect16.top + (((rect16.bottom - rect16.top) - constraintLayout.getContext().getResources().getDimensionPixelSize(2131166047)) / 2);
                    dsfVar18.j(2131427460, 0);
                    dsfVar18.o(2131427460, dimensionPixelSize5);
                    dsfVar18.c(constraintLayout);
                }
                defpackage.leq.a.a();
                if (defpackage.acyc.a.fF().aB()) {
                    resources = contextCreateConfigurationContext.getResources();
                    android.util.DisplayMetrics displayMetrics3 = resources.getDisplayMetrics();
                    float fApplyDimension3 = android.util.TypedValue.applyDimension(1, contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp, displayMetrics3);
                    fMin = java.lang.Math.min(resources.getDimension(2131168112) + (java.lang.Math.max(defpackage.dvi.a(resources, 2131168114), fApplyDimension3 - resources.getDimension(2131168115)) * defpackage.dvi.a(resources, 2131168113)), fApplyDimension3 - android.util.TypedValue.applyDimension(1, defpackage.acyc.F(), displayMetrics3));
                    if (z27) {
                        float dimension3 = resources.getDimension(2131165571);
                        fMin += dimension3 + dimension3;
                    }
                    int iRound3 = java.lang.Math.round(fMin);
                    defpackage.dsf dsfVar19 = new defpackage.dsf();
                    dsfVar19.e(constraintLayout);
                    dsfVar19.h(2131427919, iRound3);
                    dsfVar19.c(constraintLayout);
                }
                constraintLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(point3.x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(point3.y, 1073741824));
                constraintLayout.layout(0, 0, point3.x, point3.y);
                this.n = constraintLayout;
                this.p = java.util.UUID.fromString(carDisplay.g);
                z(rect9);
                this.A.m(ntiVarM);
                virtualDisplayCreateVirtualDisplay.release();
            }
            iO = 2131624656;
            z11 = z8;
            zH = zH;
            i42 = i42;
            z10 = z7;
            yqmVar = yqmVar3;
            i3 = 15;
        } else if (iOrdinal != 1) {
            if (rect10 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            z11 = !z25;
            iO = 2131624633;
            if (defpackage.acvb.j()) {
                zH = zH;
                i42 = i42;
                yqmVar = yqmVar3;
                i3 = 8;
            } else {
                zH = zH;
                i42 = i42;
                yqmVar = yqmVar3;
                i3 = 8;
            }
        } else {
            if (iOrdinal == 2) {
                throw new java.lang.IllegalStateException("Can't get layout info for CarDisplayType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(rkeVar))));
            }
            if (rect10 == null) {
                z10 = false;
            } else {
                z10 = true;
            }
            z11 = !z25;
            iO = 2131624613;
            zH = zH;
            i42 = i42;
            i3 = 10;
            yqmVar = yqmVar3;
        }
        z13 = false;
        defpackage.yqj yqjVar5 = (defpackage.yqj) yqmVar.l().ai(5393);
        java.lang.String resourceEntryName4 = contextCreateConfigurationContext.getResources().getResourceEntryName(iO);
        java.lang.Integer numValueOf8 = java.lang.Integer.valueOf(contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp);
        java.lang.Integer numValueOf9 = java.lang.Integer.valueOf(contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp);
        if (i42 == 1) {
            str = "Right";
        } else {
            str = "Left or Center";
        }
        yqjVar5.T("Will use layout: %s for display with (w=%d,h=%d), %d dpi, driver on %s", resourceEntryName4, numValueOf8, numValueOf9, numValueOf, str);
        if (rect8.left <= 0) {
            z18 = true;
        } else {
            z18 = true;
        }
        int i413 = contextCreateConfigurationContext.getResources().getConfiguration().screenWidthDp;
        int i414 = contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp;
        if (i42 == 1) {
            z19 = true;
        } else {
            z19 = false;
        }
        defpackage.nsw nswVar5 = new defpackage.nsw(iO, i413, i414, i3, z19, z13, rowVar, zH, z, z18);
        ((defpackage.oim) defpackage.mkp.a.i(defpackage.oim.class)).v(nswVar5.b, nswVar5.c, i3);
        this.m = nswVar5;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(5380)).y("LayoutInfo: %s", this.m);
        constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) android.view.LayoutInflater.from(contextCreateConfigurationContext).inflate(this.m.a, (android.view.ViewGroup) null);
        ntiVarM = m();
        z20 = true;
        if (true != z10) {
            U(constraintLayout, rect8);
            if (!z27) {
                U((androidx.constraintlayout.widget.ConstraintLayout) constraintLayout.findViewById(2131428792), rect8);
            }
            z20 = true;
        }
        if (z20 != z11) {
            if (constraintLayout.findViewById(2131427896) != null) {
                if (z20 != z10) {
                    rect7 = new android.graphics.Rect(0, 0, 0, 0);
                } else {
                    rect7 = rect10;
                }
                dsfVar = new defpackage.dsf();
                dsfVar.e(constraintLayout);
                dsfVar.i(2131427896, rect7.width());
                dsfVar.h(2131427896, rect7.height());
                dsfVar.r(2131427896, 3, 3, rect7.top);
                if (rect7.left != 0) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5365)).u("Moving cutout to right side for RHD");
                    dsfVar.d(2131427896, 1);
                    dsfVar.g(2131427896, 2, 0, 2);
                    dsfVar.g(2131427897, 2, 2131427896, 1);
                    dsfVar.g(2131427897, 1, 0, 1);
                }
                dsfVar.c(constraintLayout);
            }
            if (carDisplayBlendedUiConfigAd != null) {
                if (!this.m.e) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5374)).u("No vertical rail, cannot adjust passenger rail width");
                } else if (constraintLayout.findViewById(2131429139) == null) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5373)).u("Passenger rail is null, cannot adjust passenger rail width");
                } else {
                    carDisplayNativeUiElementT = T(carDisplayBlendedUiConfigAd, i30, this.m.b, false);
                    if (carDisplayNativeUiElementT != null) {
                        int iWidth9 = rect4.width();
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5372)).w("Adjusting passenger rail width to %d based on blended UI", iWidth9);
                        defpackage.dsf dsfVar110 = new defpackage.dsf();
                        dsfVar110.e(constraintLayout);
                        dsfVar110.i(2131429139, iWidth9);
                        dsfVar110.c(constraintLayout);
                    }
                }
                nswVar = this.m;
                if (nswVar.e) {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5369)).u("No vertical rail, cannot adjust driver side rails width");
                } else {
                    carDisplayNativeUiElementT2 = T(carDisplayBlendedUiConfigAd, i30, nswVar.b, true);
                    if (carDisplayNativeUiElementT2 != null) {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5366)).u("Native driver rail is null or has no position, cannot adjust driver side rails width");
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 5366)).u("Native driver rail is null or has no position, cannot adjust driver side rails width");
                    }
                }
            }
        }
        if (ntiVarM == defpackage.nti.e) {
            defpackage.mmi.c();
            iP = P(constraintLayout, defpackage.mmi.h(), rect10);
            X(constraintLayout, rect8, iP, rect10);
            if (constraintLayout.findViewById(2131428407) != null) {
                defpackage.mmi.c();
                if (!defpackage.mmi.h()) {
                    android.content.res.Resources resources5 = constraintLayout.getContext().getResources();
                    defpackage.dsf dsfVar111 = new defpackage.dsf();
                    dsfVar111.e(constraintLayout);
                    int iMin4 = java.lang.Math.min(resources5.getDimensionPixelOffset(2131165376), iP) + resources5.getDimensionPixelOffset(2131165785);
                    if (i42 == 0) {
                        z23 = true;
                    } else {
                        z23 = false;
                    }
                    if (z23) {
                        iWidth2 = rect8.left;
                    } else {
                        iWidth2 = rect8.right;
                    }
                    if (rect10 != null) {
                        if (rect10.left != 0) {
                            z24 = false;
                        } else {
                            z24 = true;
                        }
                        if (z24 == z23) {
                            iWidth2 += rect10.width();
                        }
                    }
                    ag(dsfVar111, 2131428407, iMin4 + iWidth2, z23);
                    dsfVar111.c(constraintLayout);
                }
            }
            if (this.m.f) {
                defpackage.dsf dsfVar112 = new defpackage.dsf();
                dsfVar112.e(constraintLayout);
                int iP5 = P(constraintLayout, false, rect10);
                if (i42 == 1) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                if (z21) {
                    iWidth = rect8.left;
                } else {
                    iWidth = rect8.right;
                }
                if (rect10 != null) {
                    if (rect10.left != 0) {
                        z22 = false;
                    } else {
                        z22 = true;
                    }
                    if (z22 == z21) {
                        iWidth += rect10.width();
                    }
                }
                ag(dsfVar112, 2131427458, iP5 + iWidth, z21);
                dsfVar112.c(constraintLayout);
            }
        } else if (!this.m.g) {
            if (z27) {
                defpackage.dsf dsfVar113 = new defpackage.dsf();
                dsfVar113.e(constraintLayout);
                int dimensionPixelSize6 = rect16.top + (((rect16.bottom - rect16.top) - constraintLayout.getContext().getResources().getDimensionPixelSize(2131166047)) / 2);
                dsfVar113.j(2131427460, 0);
                dsfVar113.o(2131427460, dimensionPixelSize6);
                dsfVar113.c(constraintLayout);
            }
        } else if (z27) {
            defpackage.dsf dsfVar114 = new defpackage.dsf();
            dsfVar114.e(constraintLayout);
            int dimensionPixelSize7 = rect16.top + (((rect16.bottom - rect16.top) - constraintLayout.getContext().getResources().getDimensionPixelSize(2131166047)) / 2);
            dsfVar114.j(2131427460, 0);
            dsfVar114.o(2131427460, dimensionPixelSize7);
            dsfVar114.c(constraintLayout);
        }
        defpackage.leq.a.a();
        if (defpackage.acyc.a.fF().aB()) {
            resources = contextCreateConfigurationContext.getResources();
            android.util.DisplayMetrics displayMetrics4 = resources.getDisplayMetrics();
            float fApplyDimension4 = android.util.TypedValue.applyDimension(1, contextCreateConfigurationContext.getResources().getConfiguration().screenHeightDp, displayMetrics4);
            fMin = java.lang.Math.min(resources.getDimension(2131168112) + (java.lang.Math.max(defpackage.dvi.a(resources, 2131168114), fApplyDimension4 - resources.getDimension(2131168115)) * defpackage.dvi.a(resources, 2131168113)), fApplyDimension4 - android.util.TypedValue.applyDimension(1, defpackage.acyc.F(), displayMetrics4));
            if (z27) {
                float dimension4 = resources.getDimension(2131165571);
                fMin += dimension4 + dimension4;
            }
            int iRound4 = java.lang.Math.round(fMin);
            defpackage.dsf dsfVar115 = new defpackage.dsf();
            dsfVar115.e(constraintLayout);
            dsfVar115.h(2131427919, iRound4);
            dsfVar115.c(constraintLayout);
        }
        constraintLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(point3.x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(point3.y, 1073741824));
        constraintLayout.layout(0, 0, point3.x, point3.y);
        this.n = constraintLayout;
        this.p = java.util.UUID.fromString(carDisplay.g);
        z(rect9);
        this.A.m(ntiVarM);
        virtualDisplayCreateVirtualDisplay.release();
    }

    public final void z(android.graphics.Rect rect) {
        this.n.getClass();
        this.J = 489;
        this.g.clear();
        this.h.clear();
        this.i.clear();
        this.j.q();
        this.l.clear();
        this.k.q();
        android.view.ViewGroup viewGroup = this.n;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rect.left != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, rect.left, viewGroup.getHeight()));
        }
        if (rect.top != 0) {
            arrayList.add(new android.graphics.Rect(0, 0, viewGroup.getWidth(), rect.top));
        }
        if (rect.right != 0) {
            arrayList.add(new android.graphics.Rect(viewGroup.getWidth() - rect.right, 0, viewGroup.getWidth(), viewGroup.getHeight()));
        }
        if (rect.bottom != 0) {
            arrayList.add(new android.graphics.Rect(0, viewGroup.getHeight() - rect.bottom, viewGroup.getWidth(), viewGroup.getHeight()));
        }
        Y(viewGroup, arrayList, new defpackage.zf(0), new android.graphics.Rect());
    }

    @Override // defpackage.lhn
    public final void eQ() {
    }
}
