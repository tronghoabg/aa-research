package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class njt implements defpackage.affc {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ njt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afbj */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d0  */
    /* JADX WARN: Type inference failed for: r9v74, types: [afer, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) throws afbj {
        android.view.ViewGroup viewGroup;
        com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                java.lang.Object obj2 = this.a;
                if (zBooleanValue) {
                    njv njvVar = (njv) obj2;
                    if (njvVar.M != null) {
                        defpackage.bt childFragmentManager = ((android.support.v4.app.Fragment) obj2).getChildFragmentManager();
                        childFragmentManager.getClass();
                        defpackage.w wVar = new defpackage.w(childFragmentManager);
                        android.support.v4.app.Fragment fragment = njvVar.M;
                        fragment.getClass();
                        wVar.k(fragment);
                        wVar.c();
                    }
                    com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton coolwalkButton = njvVar.v;
                    if (coolwalkButton == null) {
                        defpackage.afga.d("assistantIcon");
                        coolwalkButton = null;
                    }
                    coolwalkButton.setVisibility(8);
                    com.google.android.material.button.MaterialButton materialButton = njvVar.v;
                    if (materialButton == null) {
                        defpackage.afga.d("assistantIcon");
                        materialButton = null;
                    }
                    materialButton.k(null);
                    android.support.v4.app.FragmentContainerView fragmentContainerView = njvVar.y;
                    if (fragmentContainerView == null) {
                        defpackage.afga.d("liveFragmentContainer");
                        fragmentContainerView = null;
                    }
                    fragmentContainerView.setVisibility(0);
                    njvVar.M = new jvq();
                    android.support.v4.app.Fragment fragment2 = njvVar.M;
                    fragment2.getClass();
                    fragment2.setArguments(jug.b());
                    com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton coolwalkButton2 = njvVar.x;
                    if (coolwalkButton2 == null) {
                        defpackage.afga.d("geminiLiveBackgroundModeCircleView");
                        coolwalkButton2 = null;
                    }
                    coolwalkButton2.setVisibility(0);
                    defpackage.bt childFragmentManager2 = ((android.support.v4.app.Fragment) obj2).getChildFragmentManager();
                    childFragmentManager2.getClass();
                    defpackage.w wVar2 = new defpackage.w(childFragmentManager2);
                    android.support.v4.app.Fragment fragment3 = njvVar.M;
                    fragment3.getClass();
                    wVar2.q(2131428759, fragment3, null);
                    wVar2.c();
                    com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView2 = njvVar.x;
                    if (railWidgetView2 == null) {
                        defpackage.afga.d("geminiLiveBackgroundModeCircleView");
                    } else {
                        railWidgetView = railWidgetView2;
                    }
                    railWidgetView.setOnClickListener(new mhi(obj2, 20));
                } else {
                    njv njvVar2 = (njv) obj2;
                    com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton coolwalkButton3 = njvVar2.x;
                    if (coolwalkButton3 == null) {
                        defpackage.afga.d("geminiLiveBackgroundModeCircleView");
                        coolwalkButton3 = null;
                    }
                    coolwalkButton3.setVisibility(8);
                    android.support.v4.app.FragmentContainerView fragmentContainerView2 = njvVar2.y;
                    if (fragmentContainerView2 == null) {
                        defpackage.afga.d("liveFragmentContainer");
                        fragmentContainerView2 = null;
                    }
                    fragmentContainerView2.setVisibility(8);
                    com.google.android.apps.auto.components.coolwalk.button.CoolwalkButton coolwalkButton4 = njvVar2.v;
                    if (coolwalkButton4 == null) {
                        defpackage.afga.d("assistantIcon");
                        coolwalkButton4 = null;
                    }
                    coolwalkButton4.setVisibility(0);
                    if (njvVar2.M != null) {
                        defpackage.bt childFragmentManager3 = ((android.support.v4.app.Fragment) obj2).getChildFragmentManager();
                        childFragmentManager3.getClass();
                        defpackage.w wVar3 = new defpackage.w(childFragmentManager3);
                        android.support.v4.app.Fragment fragment4 = njvVar2.M;
                        fragment4.getClass();
                        wVar3.k(fragment4);
                        wVar3.c();
                    }
                    njvVar2.h();
                    com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView3 = njvVar2.v;
                    if (railWidgetView3 == null) {
                        defpackage.afga.d("assistantIcon");
                    } else {
                        railWidgetView = railWidgetView3;
                    }
                    railWidgetView.setOnClickListener(new njs(obj2, 1));
                }
                return defpackage.afbk.a;
            case 1:
                java.lang.Boolean bool2 = (java.lang.Boolean) obj;
                bool2.getClass();
                ((njv) this.a).g(bool2.booleanValue());
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ksh kshVar = (defpackage.ksh) obj;
                java.lang.Object obj3 = this.a;
                defpackage.kry kryVar = defpackage.kry.n;
                android.content.Context contextRequireContext = ((android.support.v4.app.Fragment) obj3).requireContext();
                kshVar.getClass();
                int iB = kryVar.b(contextRequireContext, kshVar);
                njv njvVar3 = (njv) obj3;
                njvVar3.b().c(iB);
                com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView railHotseatItemView = njvVar3.I;
                if (railHotseatItemView == null) {
                    defpackage.afga.d("hotseatTwo");
                    railHotseatItemView = null;
                }
                railHotseatItemView.c(iB);
                com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView railHotseatItemView2 = njvVar3.J;
                if (railHotseatItemView2 == null) {
                    defpackage.afga.d("hotseatThree");
                    railHotseatItemView2 = null;
                }
                railHotseatItemView2.c(iB);
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView4 = njvVar3.K;
                if (railWidgetView4 == null) {
                    defpackage.afga.d("hotseatFour");
                } else {
                    railWidgetView = railWidgetView4;
                }
                railWidgetView.c(iB);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Integer num = (java.lang.Integer) obj;
                int i = (num == null || num.intValue() != 0) ? 0 : 8;
                njv njvVar4 = (njv) this.a;
                com.google.android.apps.auto.components.system.facetbar.ResizeButton resizeButton = njvVar4.E;
                if (resizeButton == null) {
                    defpackage.afga.d("resizeButton");
                    resizeButton = null;
                }
                resizeButton.setVisibility(i);
                android.view.View view = njvVar4.G;
                if (view == null) {
                    defpackage.afga.d("resizeButtonGhost");
                    view = null;
                }
                view.setVisibility(i);
                android.view.View view2 = njvVar4.F;
                if (view2 == null) {
                    defpackage.afga.d("resizeButtonTapTarget");
                    view2 = null;
                }
                view2.setVisibility(i);
                if (num != null && num.intValue() == 2) {
                    com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView5 = njvVar4.E;
                    if (railWidgetView5 == null) {
                        defpackage.afga.d("resizeButton");
                    } else {
                        railWidgetView = railWidgetView5;
                    }
                    railWidgetView.m(nks.b);
                } else if (num != null && num.intValue() == 3) {
                    com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView6 = njvVar4.E;
                    if (railWidgetView6 == null) {
                        defpackage.afga.d("resizeButton");
                    } else {
                        railWidgetView = railWidgetView6;
                    }
                    railWidgetView.m(nks.c);
                } else if (num != null && num.intValue() == 1) {
                    com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView7 = njvVar4.E;
                    if (railWidgetView7 == null) {
                        defpackage.afga.d("resizeButton");
                    } else {
                        railWidgetView = railWidgetView7;
                    }
                    railWidgetView.m(nks.a);
                }
                return defpackage.afbk.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                num2.getClass();
                int iIntValue = num2.intValue();
                njv.b.l().w("onDemandSpaceStateChanged demandSpaceState: %d", iIntValue);
                boolean z = iIntValue != 3;
                njv njvVar5 = (njv) this.a;
                njvVar5.g(z);
                njvVar5.e = iIntValue;
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.kxh kxhVar = (defpackage.kxh) obj;
                kxhVar.getClass();
                njv.b.l().y("onDemandSpaceOpenTriggerChanged demandSpaceOpenTrigger: %s", kxhVar);
                ((njv) this.a).f = kxhVar;
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.Boolean bool3 = (java.lang.Boolean) obj;
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView8 = ((njv) this.a).D;
                if (railWidgetView8 == null) {
                    defpackage.afga.d("etcStatusView");
                } else {
                    railWidgetView = railWidgetView8;
                }
                railWidgetView.setVisibility(true == defpackage.afga.f(bool3, java.lang.Boolean.TRUE) ? 0 : 8);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.nod nodVar = (defpackage.nod) obj;
                boolean zF = defpackage.afga.f(nodVar, defpackage.nod.a);
                java.lang.Object obj4 = this.a;
                if (zF) {
                    njv njvVar6 = (njv) obj4;
                    android.view.ViewGroup viewGroup2 = njvVar6.z;
                    if (viewGroup2 == null) {
                        defpackage.afga.d("hotseatContainer");
                        viewGroup2 = null;
                    }
                    if (viewGroup2.getVisibility() == 0) {
                        njv.b.l().u("hiding hotseat container");
                        viewGroup = ((njv) obj4).z;
                        if (viewGroup == null) {
                            defpackage.afga.d("hotseatContainer");
                            viewGroup = null;
                        }
                        viewGroup.setVisibility(8);
                    } else if (njvVar6.h) {
                        njv.b.l().u("Skipped hotseat animation.");
                        android.view.ViewGroup viewGroup3 = njvVar6.z;
                        if (viewGroup3 == null) {
                            defpackage.afga.d("hotseatContainer");
                            viewGroup3 = null;
                        }
                        viewGroup3.setVisibility(0);
                        njvVar6.h = false;
                    } else {
                        njv.b.l().u("showing hotseat buttons");
                        njv.e(njvVar6.b());
                        android.view.View view3 = njvVar6.I;
                        if (view3 == null) {
                            defpackage.afga.d("hotseatTwo");
                            view3 = null;
                        }
                        njv.e(view3);
                        android.view.View view4 = njvVar6.J;
                        if (view4 == null) {
                            defpackage.afga.d("hotseatThree");
                            view4 = null;
                        }
                        njv.e(view4);
                        android.view.View view5 = njvVar6.K;
                        if (view5 == null) {
                            defpackage.afga.d("hotseatFour");
                            view5 = null;
                        }
                        njv.e(view5);
                        android.view.ViewGroup viewGroup4 = njvVar6.z;
                        if (viewGroup4 == null) {
                            defpackage.afga.d("hotseatContainer");
                            viewGroup4 = null;
                        }
                        viewGroup4.setVisibility(0);
                        njv.d(njvVar6.b(), 100L);
                        android.view.View view6 = njvVar6.I;
                        if (view6 == null) {
                            defpackage.afga.d("hotseatTwo");
                            view6 = null;
                        }
                        njv.d(view6, 175L);
                        android.view.View view7 = njvVar6.J;
                        if (view7 == null) {
                            defpackage.afga.d("hotseatThree");
                            view7 = null;
                        }
                        njv.d(view7, 250L);
                        android.view.View view8 = njvVar6.K;
                        if (view8 == null) {
                            defpackage.afga.d("hotseatFour");
                            view8 = null;
                        }
                        njv.d(view8, 325L);
                    }
                } else {
                    njv.b.l().u("hiding hotseat container");
                    viewGroup = ((njv) obj4).z;
                    if (viewGroup == null) {
                        defpackage.afga.d("hotseatContainer");
                        viewGroup = null;
                    }
                    viewGroup.setVisibility(8);
                }
                com.google.android.apps.auto.components.system.facetbar.widget.RailWidgetView railWidgetView9 = ((njv) obj4).B;
                if (railWidgetView9 == null) {
                    defpackage.afga.d("railWidgetView");
                } else {
                    railWidgetView = railWidgetView9;
                }
                railWidgetView.b(nodVar);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.nne nneVar = (defpackage.nne) obj;
                com.google.android.apps.auto.components.system.facetbar.hotseat.RailHotseatItemView railHotseatItemViewB = ((njv) this.a).b();
                nneVar.getClass();
                njv.m(railHotseatItemViewB, nneVar);
                return defpackage.afbk.a;
            case 9:
                defpackage.npc npcVar = (defpackage.npc) obj;
                npcVar.getClass();
                java.lang.Object obj5 = this.a;
                defpackage.nkf nkfVar = defpackage.nkf.f;
                defpackage.nkj nkjVar = (defpackage.nkj) obj5;
                npcVar.f(nkjVar.l, nkfVar);
                defpackage.eqp eqpVar = nkjVar.p;
                defpackage.eqp eqpVar2 = nkjVar.n;
                npcVar.f(defpackage.tcu.a(eqpVar2, eqpVar), nkfVar);
                npcVar.f(eqpVar2, defpackage.nkf.h);
                return new defpackage.eqs(defpackage.nkf.e);
            case 10:
                defpackage.mqi mqiVar = (defpackage.mqi) obj;
                defpackage.nke nkeVar = defpackage.nkj.a;
                mqiVar.getClass();
                return java.lang.Boolean.valueOf(defpackage.afga.f(mqiVar, defpackage.mpr.b((android.content.ComponentName) this.a)));
            case 11:
                android.content.ComponentName componentName = ((defpackage.nne) obj).b;
                defpackage.nkg nkgVar = (defpackage.nkg) this.a;
                android.content.ComponentName componentName2 = nkgVar.h;
                nkgVar.h = componentName;
                nkgVar.a(nkgVar.h, componentName2);
                return defpackage.afbk.a;
            case 12:
                android.content.ComponentName componentName3 = ((defpackage.nne) obj).b;
                defpackage.nkg nkgVar2 = (defpackage.nkg) this.a;
                android.content.ComponentName componentName4 = nkgVar2.a;
                nkgVar2.a = componentName3;
                nkgVar2.a(nkgVar2.a, componentName4);
                return defpackage.afbk.a;
            case 13:
                android.content.ComponentName componentName5 = ((defpackage.nne) obj).b;
                defpackage.nkg nkgVar3 = (defpackage.nkg) this.a;
                android.content.ComponentName componentName6 = nkgVar3.i;
                nkgVar3.i = componentName5;
                nkgVar3.a(nkgVar3.i, componentName6);
                return defpackage.afbk.a;
            case 14:
                defpackage.nkf nkfVar2 = (defpackage.nkf) obj;
                nkfVar2.getClass();
                nkh nkhVar = (nkh) this.a;
                nkhVar.j = nkfVar2;
                nkhVar.a();
                return defpackage.afbk.a;
            case 15:
                nkh nkhVar2 = (nkh) this.a;
                nkhVar2.a = (defpackage.nne) obj;
                nkhVar2.a();
                return defpackage.afbk.a;
            case 16:
                nkh nkhVar3 = (nkh) this.a;
                nkhVar3.i = (defpackage.nne) obj;
                nkhVar3.a();
                return defpackage.afbk.a;
            case 17:
                nkh nkhVar4 = (nkh) this.a;
                nkhVar4.h = (defpackage.nne) obj;
                nkhVar4.a();
                return defpackage.afbk.a;
            case 18:
                java.lang.Boolean bool4 = (java.lang.Boolean) obj;
                bool4.getClass();
                boolean zBooleanValue2 = bool4.booleanValue();
                nkh nkhVar5 = (nkh) this.a;
                nkhVar5.k = zBooleanValue2;
                nkhVar5.a();
                return defpackage.afbk.a;
            case 19:
                ((java.lang.Boolean) obj).booleanValue();
                this.a.invoke();
                return defpackage.afbk.a;
            default:
                com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) obj;
                carCall.getClass();
                java.lang.Object obj6 = this.a;
                return java.lang.Boolean.valueOf(obj6 != null && carCall.a == ((com.google.android.apps.auto.components.telecom.PhoneCall) obj6).a);
        }
    }
}
