package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nck implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ nck(int i) {
        this.a = i;
    }

    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String string;
        android.app.PendingIntent pendingIntent;
        nuo nuoVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon;
        i = 0;
        int i = 0;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                int i2 = nco.a;
                return obj == null ? defpackage.tcu.b : defpackage.duu.b((1 & 1) != 0 ? defpackage.afdp.a : null, (1 & 2) != 0 ? 5000L : 0L, new gqx((defpackage.afdk) null, 4, (int[]) null));
            case 1:
                defpackage.lmk lmkVar = (defpackage.lmk) obj;
                lmkVar.getClass();
                java.lang.String strQ = lmkVar.Q("android.media.metadata.ARTIST");
                if (strQ != null && (string = afzh.l(strQ).toString()) != null) {
                    return string;
                }
                java.lang.String strQ2 = lmkVar.Q("com.google.android.apps.auto.radio.MESSAGE");
                if (strQ2 != null) {
                    return afzh.l(strQ2).toString();
                }
                return null;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.afau afauVar = (defpackage.afau) obj;
                defpackage.ncw ncwVar = defpackage.ncx.a;
                afauVar.getClass();
                java.lang.Object obj2 = afauVar.b;
                android.content.ComponentName componentName = (android.content.ComponentName) afauVar.a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj3 : (java.util.List) obj2) {
                    mok mokVar = (mok) obj3;
                    if (mokVar.a.getAction() == null) {
                        java.util.Objects.toString(mokVar);
                        arrayList.add(java.lang.String.valueOf(mokVar).concat("'s action is null"));
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.ncx.c.f()).l(1, java.util.concurrent.TimeUnit.MINUTES)).D("Ignored %d suggestions: %s", arrayList.size(), arrayList);
                }
                java.lang.String packageName = componentName != null ? componentName.getPackageName() : null;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.afga.aj(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new nct((mok) it.next()));
                }
                return new ncu(packageName, arrayList3);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.ComponentName componentName2 = (android.content.ComponentName) obj;
                defpackage.ncw ncwVar2 = defpackage.ncx.a;
                return java.lang.Boolean.valueOf(componentName2 != null ? !defpackage.maw.c(componentName2.getPackageName()) : false);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.ndd();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ncw ncwVar3 = defpackage.ncx.a;
                defpackage.eqp eqpVarA = defpackage.mak.e().a((android.content.ComponentName) obj);
                eqpVarA.getClass();
                return eqpVarA;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return java.lang.Boolean.valueOf(((defpackage.ndl) obj) instanceof ndj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ncu ncuVar = (ncu) obj;
                ncuVar.getClass();
                return afsg.j(new aisx(afsg.q(defpackage.afga.bg(ncuVar.b), new defpackage.nck(8))));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                nct nctVar = (defpackage.mlv) obj;
                nctVar.getClass();
                if (nctVar instanceof nct) {
                    mok mokVar2 = nctVar.a;
                    android.content.Context context = defpackage.mkp.a.c;
                    context.getClass();
                    androidx.car.app.suggestion.model.Suggestion suggestion = mokVar2.a;
                    androidx.car.app.model.CarIcon icon = suggestion.getIcon();
                    android.content.ComponentName componentName3 = mokVar2.b;
                    com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconM = icon != null ? com.google.android.apps.auto.components.graphics.icon.GhIcon.m(icon, componentName3) : com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context, 2131232950);
                    java.lang.String string2 = suggestion.getTitle().toString();
                    string2.getClass();
                    java.lang.String strValueOf = java.lang.String.valueOf(suggestion.getSubtitle());
                    android.app.PendingIntent pendingIntentB = juq.b(context, componentName3.getPackageName(), suggestion.getAction());
                    pendingIntentB.getClass();
                    return new ncr(ghIconM, string2, strValueOf, 0, pendingIntentB);
                }
                if (!(nctVar instanceof ncs)) {
                    throw new defpackage.afas();
                }
                com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion navigationSuggestion = ((ncs) nctVar).a;
                java.lang.CharSequence charSequence = navigationSuggestion.b;
                if (charSequence == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                android.content.Intent intent = navigationSuggestion.a;
                if (intent == null) {
                    throw new java.lang.IllegalArgumentException("Required value was null.");
                }
                android.content.Context context2 = defpackage.mkp.a.c;
                context2.getClass();
                androidx.core.graphics.drawable.IconCompat iconCompat = navigationSuggestion.d;
                com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconK = iconCompat != null ? com.google.android.apps.auto.components.graphics.icon.GhIcon.k(defpackage.dtq.b(iconCompat, context2)) : com.google.android.apps.auto.components.graphics.icon.GhIcon.p(context2, 2131232950);
                java.lang.CharSequence charSequence2 = navigationSuggestion.c;
                int iAz = defpackage.a.az(navigationSuggestion.e);
                if (iAz != 0) {
                    if (iAz == 1) {
                        i = defpackage.lem.a.a().b() ? 2131102864 : 2131103486;
                    } else if (iAz == 2) {
                        i = defpackage.lem.a.a().b() ? 2131102866 : 2131103488;
                    } else if (iAz == 3) {
                        i = defpackage.lem.a.a().b() ? 2131102865 : 2131103487;
                    }
                }
                int i3 = i;
                android.app.PendingIntent pendingIntentC = com.google.android.apps.auto.components.system.GhPendingIntentReceiver.c(intent, context2);
                pendingIntentC.getClass();
                return new ncr(ghIconK, charSequence, charSequence2, i3, pendingIntentC);
            case 9:
                nvh nvhVar = (nvh) obj;
                int i4 = neg.q;
                nvhVar.getClass();
                nup nupVar = nvhVar.u;
                return (nupVar == null || (pendingIntent = nupVar.h) == null) ? nvhVar.c : pendingIntent;
            case 10:
                nuv nuvVar = (nuv) obj;
                int i5 = neg.q;
                nuvVar.getClass();
                return nuvVar.c;
            case 11:
                nvh nvhVar2 = (nvh) obj;
                int i6 = neg.q;
                nvhVar2.getClass();
                return java.lang.Integer.valueOf(nvhVar2.E);
            case 12:
                nvh nvhVar3 = (nvh) obj;
                int i7 = neg.q;
                nvhVar3.getClass();
                nup nupVar2 = nvhVar3.u;
                if (nupVar2 == null || (nuoVar = nupVar2.f) == null) {
                    return nvhVar3.j ? nuo.b : nuo.a;
                }
                return nuoVar;
            case 13:
                nvh nvhVar4 = (nvh) obj;
                int i8 = neg.q;
                nvhVar4.getClass();
                return java.lang.Long.valueOf(nvhVar4.i);
            case 14:
                nvh nvhVar5 = (nvh) obj;
                int i9 = neg.q;
                nvhVar5.getClass();
                nup nupVar3 = nvhVar5.u;
                if (nupVar3 != null && (str = nupVar3.d) != null) {
                    return str;
                }
                java.lang.CharSequence charSequence3 = nvhVar5.n;
                charSequence3.getClass();
                java.lang.CharSequence charSequence4 = true != afzh.v(charSequence3) ? charSequence3 : null;
                if (charSequence4 != null) {
                    return charSequence4;
                }
                java.lang.CharSequence charSequence5 = nvhVar5.o;
                charSequence5.getClass();
                return charSequence5;
            case 15:
                nvh nvhVar6 = (nvh) obj;
                int i10 = neg.q;
                nvhVar6.getClass();
                return java.lang.Boolean.valueOf(!nvhVar6.l);
            case 16:
                nvh nvhVar7 = (nvh) obj;
                int i11 = neg.q;
                nvhVar7.getClass();
                nup nupVar4 = nvhVar7.u;
                return (nupVar4 == null || (str2 = nupVar4.i) == null) ? nvhVar7.f : str2;
            case 17:
                nvh nvhVar8 = (nvh) obj;
                int i12 = neg.q;
                nvhVar8.getClass();
                nup nupVar5 = nvhVar8.u;
                return (nupVar5 == null || (str3 = nupVar5.c) == null) ? nvhVar8.m : str3;
            case 18:
                nvh nvhVar9 = (nvh) obj;
                int i13 = neg.q;
                nvhVar9.getClass();
                nup nupVar6 = nvhVar9.u;
                return (nupVar6 == null || (ghIcon = nupVar6.a) == null) ? nvhVar9.d : ghIcon;
            case 19:
                nvh nvhVar10 = (nvh) obj;
                int i14 = neg.q;
                nvhVar10.getClass();
                android.os.Parcelable parcelable = nvhVar10.F.getParcelable("car_app_call_background_image_uri");
                if (parcelable instanceof android.net.Uri) {
                    return (android.net.Uri) parcelable;
                }
                return null;
            default:
                android.net.Uri uri = (android.net.Uri) obj;
                int i15 = neg.q;
                uri.getClass();
                android.content.Context context3 = defpackage.mkp.a.c;
                context3.getClass();
                return defpackage.mvm.v(context3, uri, null, null, false);
        }
    }
}
