package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mzv implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ mzv(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.drawable.InsetDrawable insetDrawable;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.ltm ltmVar = (defpackage.ltm) obj;
                int i = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                java.lang.Object obj2 = this.a;
                if (ltmVar == null) {
                    ((com.google.android.material.button.MaterialButton) obj2).setVisibility(4);
                } else {
                    ((android.view.View) obj2).setVisibility(0);
                    com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) obj2;
                    materialButton.setEnabled(ltmVar.b);
                    int i2 = defpackage.lgo.a;
                    com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = ltmVar.a;
                    if (ghIcon.b == 2 && defpackage.afga.f(ghIcon.s(), materialButton.getContext().getPackageName())) {
                        materialButton.j(ghIcon.a());
                        if (ghIcon.t()) {
                            materialButton.k(ghIcon.d(materialButton.getContext()));
                            android.graphics.PorterDuff.Mode mode = ghIcon.e;
                            if (materialButton.f != mode) {
                                materialButton.f = mode;
                                materialButton.n(false);
                            }
                        }
                    } else {
                        android.content.Context context = materialButton.getContext();
                        int i3 = materialButton.h;
                        if (i3 == 0) {
                            i3 = -1;
                        }
                        android.graphics.drawable.Drawable drawableF = ghIcon.f(context, i3);
                        if (drawableF != null && drawableF.getIntrinsicWidth() != 0 && drawableF.getIntrinsicHeight() != 0 && drawableF.getIntrinsicHeight() != drawableF.getIntrinsicWidth()) {
                            if (drawableF.getIntrinsicHeight() > drawableF.getIntrinsicWidth()) {
                                int intrinsicHeight = (drawableF.getIntrinsicHeight() - drawableF.getIntrinsicWidth()) / 2;
                                insetDrawable = new android.graphics.drawable.InsetDrawable(drawableF, intrinsicHeight, 0, intrinsicHeight, 0);
                            } else {
                                int intrinsicWidth = (drawableF.getIntrinsicWidth() - drawableF.getIntrinsicHeight()) / 2;
                                insetDrawable = new android.graphics.drawable.InsetDrawable(drawableF, 0, intrinsicWidth, 0, intrinsicWidth);
                            }
                            drawableF = insetDrawable;
                        }
                        materialButton.i(drawableF);
                    }
                    materialButton.setOnClickListener(new mhi(ltmVar, 15));
                }
                return defpackage.afbk.a;
            case 1:
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon2 = (com.google.android.apps.auto.components.graphics.icon.GhIcon) obj;
                int i4 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                if (ghIcon2 != null) {
                    defpackage.lgo.d((android.widget.ImageView) this.a, ghIcon2, true, true, false);
                }
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.acbb acbbVar = (defpackage.acbb) obj;
                int i5 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                java.lang.Object obj3 = this.a;
                if (acbbVar == null) {
                    ((android.widget.ImageView) obj3).setImageTintList(null);
                } else {
                    android.widget.ImageView imageView = (android.widget.ImageView) obj3;
                    if (imageView.getImageTintList() == null) {
                        imageView.setImageTintList(defpackage.tis.j(defpackage.mkc.x(acbbVar)));
                    }
                }
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i6 = true == ((java.lang.Boolean) obj).booleanValue() ? 0 : 8;
                int i7 = com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment.b;
                ((android.widget.ProgressBar) this.a).setVisibility(i6);
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                int i8 = nah.b;
                num.getClass();
                ((android.widget.TextView) this.a).setText(num.intValue());
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i9 = nah.b;
                ((android.widget.TextView) this.a).setText((java.lang.String) obj);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) obj;
                int i10 = nah.b;
                if (drawable != null) {
                    ((android.widget.ImageView) this.a).setImageDrawable(drawable);
                }
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i11 = true != ((java.lang.Boolean) obj).booleanValue() ? 0 : 4;
                int i12 = nah.b;
                ((android.view.View) this.a).setVisibility(i11);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                android.graphics.drawable.Drawable drawable2 = (android.graphics.drawable.Drawable) obj;
                int i13 = naj.b;
                if (drawable2 != null) {
                    ((android.widget.ImageView) this.a).setImageDrawable(drawable2);
                }
                return defpackage.afbk.a;
            case 9:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                int i14 = naj.b;
                java.lang.Object obj4 = this.a;
                obj4.getClass();
                ((android.view.View) obj4).setVisibility(true != zBooleanValue ? 0 : 4);
                return defpackage.afbk.a;
            case 10:
                android.content.ComponentName componentName = (android.content.ComponentName) obj;
                componentName.getClass();
                boolean zF = defpackage.afga.f(componentName, defpackage.mkt.G);
                java.lang.Object obj5 = this.a;
                return zF ? new nbu((defpackage.eqp) obj5) : new mzl((defpackage.eqp) obj5);
            case 11:
                defpackage.afau afauVar = (defpackage.afau) obj;
                afauVar.getClass();
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) afauVar.a;
                if (bitmap != null) {
                    return defpackage.duu.b((1 & 1) != 0 ? defpackage.afdp.a : null, (1 & 2) != 0 ? 5000L : 0L, new dxi((defpackage.nan) this.a, bitmap, (defpackage.afdk) null, 3));
                }
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.eqs(null);
            case 12:
                ((defpackage.byj) this.a).h(((java.lang.Integer) obj).intValue());
                return defpackage.afbk.a;
            case 13:
                ((defpackage.byj) this.a).h(((java.lang.Integer) obj).intValue());
                return defpackage.afbk.a;
            case 14:
                defpackage.nbf nbfVar = (defpackage.nbf) obj;
                defpackage.yqm yqmVar = com.google.android.apps.auto.components.system.dashboard.media.MediaSuggestionFragment.a;
                ((android.widget.ViewAnimator) this.a).setDisplayedChild(nbfVar.ordinal());
                if (nbfVar == defpackage.nbf.b) {
                    defpackage.mwr.a(defpackage.zbd.Hr, null);
                } else if (nbfVar == defpackage.nbf.c) {
                    defpackage.mwr.a(defpackage.zbd.Hs, null);
                }
                return defpackage.afbk.a;
            case 15:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return defpackage.tcu.v(((nbe) this.a).a, new defpackage.nao(7));
                }
                defpackage.afce afceVar = defpackage.afce.a;
                defpackage.afdo afdoVar2 = defpackage.tcu.a;
                return new defpackage.eqs(afceVar);
            case 16:
                defpackage.npc npcVar = (defpackage.npc) obj;
                npcVar.getClass();
                defpackage.nao naoVar = new defpackage.nao(9);
                defpackage.nbg nbgVar = (defpackage.nbg) this.a;
                npcVar.f(defpackage.tcu.v(nbgVar.e, naoVar), defpackage.nbf.b);
                npcVar.f(defpackage.tcu.x(nbgVar.f), defpackage.nbf.a);
                return new defpackage.eqs(defpackage.nbf.c);
            case 17:
                defpackage.yqm yqmVar2 = nbp.a;
                java.lang.Object obj6 = this.a;
                obj6.getClass();
                ((android.view.View) obj6).setVisibility(true != ((java.lang.Boolean) obj).booleanValue() ? 0 : 8);
                return defpackage.afbk.a;
            case 18:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                defpackage.yqm yqmVar3 = nbp.a;
                num2.getClass();
                ((com.google.android.apps.auto.components.coolwalk.card.CoolwalkCardView) this.a).f.b(android.content.res.ColorStateList.valueOf(num2.intValue()));
                return defpackage.afbk.a;
            case 19:
                nbk nbkVar = (nbk) obj;
                java.lang.Object obj7 = this.a;
                nbp nbpVar = (nbp) obj7;
                aiwg aiwgVar = nbpVar.d;
                if (aiwgVar != null) {
                    aiwgVar.s((java.util.concurrent.CancellationException) null);
                }
                android.support.v4.app.Fragment fragment = (android.support.v4.app.Fragment) obj7;
                android.support.v4.app.Fragment fragmentE = fragment.getChildFragmentManager().e(2131428820);
                if (nbkVar == nbk.d) {
                    nbpVar.d = ahoc.d(defpackage.eqy.b(fragment.getViewLifecycleOwner()), (defpackage.afdo) null, 0, new defpackage.bqo(nbpVar, nbkVar, fragmentE, null, 12, null), 3);
                } else {
                    nbkVar.getClass();
                    nbpVar.f(nbkVar, fragmentE);
                }
                return defpackage.afbk.a;
            default:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object obj8 = this.a;
                    nbp nbpVar2 = (nbp) obj8;
                    aiwg aiwgVar2 = nbpVar2.d;
                    if (aiwgVar2 != null) {
                        aiwgVar2.s((java.util.concurrent.CancellationException) null);
                    }
                    nbpVar2.d = ahoc.d(defpackage.eqy.b(((android.support.v4.app.Fragment) obj8).getViewLifecycleOwner()), (defpackage.afdo) null, 0, new defpackage.nbo(nbpVar2, (defpackage.afdk) null, 1, (byte[]) null), 3);
                }
                return defpackage.afbk.a;
        }
    }
}
