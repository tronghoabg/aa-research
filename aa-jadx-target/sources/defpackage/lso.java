package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lso implements defpackage.eqt {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lso(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        int i = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                lsp lspVar = (lsp) obj;
                ((defpackage.lsq) this.a).a.add(new lsr(lspVar.a, (defpackage.lmk) lspVar.b.orElse((java.lang.Object) null)));
                return;
            case 1:
                lsp lspVar2 = (lsp) obj;
                ((defpackage.lsq) this.a).a.add(new lss(lspVar2.a, (com.google.android.apps.auto.components.media.compat.AaPlaybackState) lspVar2.b.orElse((java.lang.Object) null)));
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj2 = this.a;
                defpackage.yqm yqmVar = defpackage.lvx.a;
                if (!list.isEmpty()) {
                    ((lxg) obj2).p(lwy.b(list, defpackage.acul.b(), (int) defpackage.acul.d()));
                    defpackage.yqm yqmVar2 = defpackage.lvx.a;
                    if (yqmVar2.l().Z()) {
                        ((defpackage.yqj) yqmVar2.l().ai((char) 4324)).y("Added Smart Actions: %s", j$.util.Objects.toString(obj2));
                    }
                }
                defpackage.lvx.f((lxg) obj2);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj3 = this.a;
                lym lymVar = (lym) obj3;
                androidx.car.app.model.Action action = lymVar.b;
                defpackage.ygw ygwVar = (defpackage.ygw) obj;
                tmj tmjVar = (tmj) obj3;
                uo uoVarF = defpackage.tna.f(tmjVar.e);
                if (action != null) {
                    uoVarF.b(action);
                }
                ul ulVar = new ul();
                ulVar.c(lymVar.a.getString(2132084609));
                int size = ygwVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    lum lumVar = (lum) ygwVar.get(i2);
                    if (!lumVar.d.isEmpty()) {
                        ulVar.b(jxy.a(lymVar.c, lumVar));
                    }
                }
                androidx.car.app.model.ItemList itemListA = ulVar.a();
                uoVarF.f(itemListA);
                int size2 = itemListA.getItems().size();
                if (!lymVar.d) {
                    defpackage.oim oimVarU = defpackage.omf.u();
                    defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MESSAGING_APP, defpackage.zbd.mW);
                    rrvVarH.z(size2);
                    oimVarU.F(rrvVarH.l());
                    lymVar.d = true;
                }
                tmjVar.g.d(uoVarF.a());
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((defpackage.mci) this.a).f(((java.lang.Boolean) obj).booleanValue());
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar3 = mgq.a;
                android.widget.ImageView imageView = (android.widget.ImageView) this.a;
                imageView.setImageTintList(android.content.res.ColorStateList.valueOf(defpackage.kry.s.b(imageView.getContext(), (defpackage.ksh) obj)));
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.widget.ImageView imageView2 = (android.widget.ImageView) this.a;
                imageView2.setImageTintList(android.content.res.ColorStateList.valueOf(defpackage.kry.s.b(imageView2.getContext(), (defpackage.ksh) obj)));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj4 = this.a;
                mgx mgxVar = (mgx) obj4;
                ((android.widget.TextView) mgxVar.g.findViewById(2131428020)).setText(2132084821);
                if (iIntValue == 2) {
                    ((android.widget.TextView) mgxVar.g.findViewById(2131428010)).setText(2132084820);
                    ((android.widget.ImageView) mgxVar.g.findViewById(2131428019)).setImageDrawable(((android.support.v4.app.Fragment) obj4).requireContext().getDrawable(2131232992));
                    return;
                } else {
                    ((android.widget.TextView) mgxVar.g.findViewById(2131428010)).setText(2132084819);
                    ((android.widget.ImageView) mgxVar.g.findViewById(2131428019)).setImageDrawable(((android.support.v4.app.Fragment) obj4).requireContext().getDrawable(2131232991));
                    return;
                }
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((mis) this.a).c = (defpackage.yhe) obj;
                return;
            case 9:
                ((mis) this.a).e = (defpackage.yhe) obj;
                return;
            case 10:
                ((mis) this.a).d = (defpackage.yhe) obj;
                return;
            case 11:
                j$.lang.Iterable.-EL.forEach((defpackage.yhx) obj, new kcx(this.a, 12));
                return;
            case 12:
                android.support.v4.media.session.MediaSessionCompat mediaSessionCompat = ((mjt) this.a).b;
                android.support.v4.media.session.PlaybackStateCompat playbackStateCompat = (android.support.v4.media.session.PlaybackStateCompat) obj;
                mediaSessionCompat.i(playbackStateCompat);
                mediaSessionCompat.e(playbackStateCompat.a != 0);
                return;
            case 13:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    android.support.v4.media.session.MediaSessionCompat mediaSessionCompat2 = ((mjt) this.a).b;
                    if (mediaSessionCompat2.a.a() == null) {
                        defpackage.knb knbVar = new defpackage.knb();
                        knbVar.h("android.media.metadata.DISPLAY_ICON_URI", miy.a(0, "station_icon_fallback_play").toString());
                        android.support.v4.media.MediaMetadataCompat mediaMetadataCompatE = knbVar.e();
                        ((defpackage.yqj) ((defpackage.yqj) mjt.a.e()).ai((char) 5040)).u("Radio has a valid state, but not metadata, setting at least a default radio icon.");
                        mediaSessionCompat2.h(mediaMetadataCompatE);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                int iOrdinal = ((mjo) obj).ordinal();
                java.lang.Object obj5 = this.a;
                if (iOrdinal == 0) {
                    ((mjt) obj5).b.e(true);
                    return;
                } else {
                    if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        ((mjt) obj5).b.e(false);
                        return;
                    }
                    return;
                }
            case 15:
                java.lang.Object obj6 = this.a;
                j$.util.Optional optionalFindFirst = (j$.util.Optional) obj;
                miv mivVar = new miv(obj6, 5);
                if (true == optionalFindFirst.isPresent()) {
                    java.lang.Object obj7 = optionalFindFirst.get();
                    java.lang.Object obj8 = mivVar.a;
                    j$.util.stream.Stream stream = j$.util.Collection.-EL.stream((defpackage.ygw) obj7);
                    kqo kqoVar = ((mlg) obj8).d;
                    kqoVar.getClass();
                    optionalFindFirst = stream.filter(new defpackage.mpw(kqoVar, i)).findFirst();
                    optionalFindFirst.getClass();
                }
                mlc mlcVar = new mlc(obj6, 0);
                if (true != optionalFindFirst.isPresent()) {
                    return;
                }
                ((mlg) mlcVar.a).r((kqo) optionalFindFirst.get());
                return;
            case 16:
                j$.util.Optional optionalFindFirst2 = (j$.util.Optional) obj;
                if (true == optionalFindFirst2.isPresent()) {
                    optionalFindFirst2 = j$.util.Collection.-EL.stream((defpackage.ygw) optionalFindFirst2.get()).filter(new defpackage.lyk(11)).findFirst();
                    optionalFindFirst2.getClass();
                }
                mlc mlcVar2 = new mlc(this.a, 2);
                if (true != optionalFindFirst2.isPresent()) {
                    return;
                }
                java.lang.Object obj9 = optionalFindFirst2.get();
                java.lang.Object obj10 = mlcVar2.a;
                defpackage.zbd zbdVar = defpackage.zbd.tB;
                mky mkyVar = (mky) obj10;
                if (mkyVar.m == null) {
                    throw new java.lang.IllegalStateException("Fragment must be present to supply UiContext for action being logged.");
                }
                defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, mkyVar.m.l(), zbdVar).l());
                ((com.google.android.apps.auto.components.settings.connectacar.ConnectACarActivity) obj10).finish();
                return;
            case 17:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                java.lang.Object obj11 = this.a;
                if (iIntValue2 == 10) {
                    synchronized (((mlm) obj11).c) {
                        ((mla) obj11).o(new mlj(obj11, 3));
                        if (((java.lang.Boolean) ((mlm) obj11).e.orElse(java.lang.Boolean.TRUE)).booleanValue()) {
                            ((mla) obj11).m(defpackage.zbd.tw);
                            ((mlm) obj11).e = j$.util.Optional.of(java.lang.Boolean.FALSE);
                        }
                        break;
                    }
                    return;
                }
                if (iIntValue2 != 12) {
                    return;
                }
                java.lang.Object obj12 = ((mlm) obj11).c;
                synchronized (obj12) {
                    if (((mlm) obj11).e.isPresent() && !((java.lang.Boolean) ((mlm) obj11).e.get()).booleanValue()) {
                        ((mla) obj11).m(defpackage.zbd.tx);
                    }
                    ((mlm) obj11).e = j$.util.Optional.of(java.lang.Boolean.TRUE);
                    oqz oqzVar = ((mlm) obj11).f;
                    oqzVar.getClass();
                    ((mla) obj11).o(new mlj(oqzVar, 0));
                    ((mlm) obj11).p();
                    synchronized (obj12) {
                        en enVar = ((mlm) obj11).d;
                        if (enVar != null) {
                            enVar.dismiss();
                            ((mlm) obj11).d = null;
                        }
                        break;
                    }
                    return;
                }
                return;
            case 18:
                defpackage.ygw ygwVar2 = (defpackage.ygw) obj;
                if (ygwVar2.size() > 1) {
                    com.google.android.apps.auto.components.settings.troubleshooter.TroubleshooterActivity.A(defpackage.zbd.Bo);
                } else {
                    com.google.android.apps.auto.components.settings.troubleshooter.TroubleshooterActivity.A(defpackage.zbd.Bn);
                }
                ((com.google.android.apps.auto.components.settings.troubleshooter.TroubleshooterActivity) this.a).m.c(ygwVar2);
                return;
            case 19:
                defpackage.mmg mmgVar = (defpackage.mmg) obj;
                java.lang.Object obj13 = this.a;
                mmu mmuVar = (mmu) obj13;
                if (mmuVar.g == mmgVar) {
                    ((defpackage.yqj) mmu.f.l().ai((char) 5064)).y("onSettingChanged(%s): ignoring because unchanged", mmgVar);
                    return;
                } else {
                    ((defpackage.yqj) mmu.f.l().ai(5063)).M("onSettingChanged(%s -> %s): invalidating", mmuVar.g, mmgVar);
                    ((rb) obj13).j();
                    return;
                }
            default:
                defpackage.ngi ngiVar = (defpackage.ngi) obj;
                java.lang.Object obj14 = this.a;
                mmw mmwVar = (mmw) obj14;
                if (mmwVar.g == ngiVar) {
                    ((defpackage.yqj) mmw.f.l().ai((char) 5069)).y("onSettingChanged(%s): ignoring because unchanged", ngiVar);
                    return;
                } else {
                    ((defpackage.yqj) mmw.f.l().ai(5068)).M("onSettingChanged(%s -> %s): invalidating", mmwVar.g, ngiVar);
                    ((rb) obj14).j();
                    return;
                }
        }
    }
}
