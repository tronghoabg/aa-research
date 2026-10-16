package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lnj implements defpackage.eqt {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ lnj(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v25, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        ond ondVar;
        boolean z;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.lnl) this.a).o = ((java.lang.Boolean) obj).booleanValue();
                break;
            case 1:
                ((defpackage.lni) this.a).j = ((java.lang.Boolean) obj).booleanValue();
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                loq loqVar = (loq) obj;
                defpackage.yqm yqmVar = defpackage.lot.a;
                java.lang.Object obj2 = this.a;
                if (loqVar != null) {
                    int iOrdinal = loqVar.e().ordinal();
                    if (iOrdinal == 1) {
                        ((defpackage.eqp) obj2).m(java.lang.Boolean.valueOf(loqVar instanceof loy));
                        break;
                    } else if (iOrdinal == 2 || iOrdinal == 3) {
                        ((defpackage.eqp) obj2).m(java.lang.Boolean.FALSE);
                        break;
                    } else if (iOrdinal == 5) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lot.a.g()).ai((char) 4104)).u("createIsBrowserSearchableData indicated car token disconnect");
                        break;
                    }
                } else {
                    ((defpackage.eqp) obj2).m(java.lang.Boolean.FALSE);
                    break;
                }
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.eqp) this.a).m((lpm) obj);
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.List list = (java.util.List) obj;
                java.lang.Object obj3 = this.a;
                defpackage.lpw lpwVar = (defpackage.lpw) obj3;
                defpackage.ygw ygwVar = lpwVar.h;
                boolean[] zArr = lpwVar.i;
                java.util.List list2 = lpwVar.j;
                lpwVar.h = defpackage.ygw.o(list);
                lpwVar.i = new boolean[list.size()];
                lpwVar.j = new java.util.ArrayList(java.util.Collections.nCopies(list.size(), null));
                defpackage.zf zfVar = new defpackage.zf(list.size());
                for (int i = 0; i < list.size(); i++) {
                    defpackage.eqp eqpVar = (defpackage.eqp) list.get(i);
                    if (ygwVar.contains(eqpVar)) {
                        int iIndexOf = ygwVar.indexOf(eqpVar);
                        lpwVar.i[i] = zArr[iIndexOf];
                        lpwVar.j.set(i, list2.get(iIndexOf));
                    } else if (!zfVar.contains(eqpVar)) {
                        ((defpackage.eqr) obj3).r(eqpVar, new jui(obj3, eqpVar, 3));
                        zfVar.add(eqpVar);
                    }
                }
                int size = ygwVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    defpackage.eqp eqpVar2 = (defpackage.eqp) ygwVar.get(i2);
                    if (!list.contains(eqpVar2)) {
                        ((defpackage.eqr) obj3).s(eqpVar2);
                    }
                }
                if (list.isEmpty()) {
                    ((defpackage.eqp) obj3).m(lpwVar.a.a(new java.util.ArrayList()));
                }
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ohy ohyVar = ((lok) obj).i;
                int i3 = lqc.a;
                ohyVar.h(defpackage.zbe.MEDIA_CONTENT_SUGGESTION).d(((com.google.android.apps.auto.components.media.repository.suggestion.AppBrowserMediaSuggestionPayload) this.a).a, android.os.Bundle.EMPTY);
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.eqp) this.a).m((lqo) obj);
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar2 = defpackage.lqz.a;
                java.lang.Object obj4 = this.a;
                lql lqlVar = (lql) obj4;
                java.lang.Runnable runnable = lqlVar.k;
                defpackage.wfp.f(runnable);
                lqlVar.i = obj;
                if (a$.ExternalSyntheticApiModelOutline2.m(lqlVar.a, obj)) {
                    defpackage.wfp.d(runnable, lqlVar.h.toMillis());
                } else {
                    ((defpackage.eqp) obj4).m(obj);
                    lqlVar.j = true;
                }
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                lrt lrtVar = (lrt) obj;
                ?? r11 = this.a;
                if (lrtVar == null) {
                    defpackage.lrw lrwVar = (defpackage.lrw) r11;
                    lrwVar.e();
                    lrwVar.f();
                    break;
                } else {
                    defpackage.lrw lrwVar2 = (defpackage.lrw) r11;
                    android.content.ComponentName componentName = lrwVar2.f;
                    android.content.ComponentName componentName2 = lrtVar.a.c.a;
                    if (componentName != null && !componentName.equals(componentName2)) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lrw.a.f()).ai(4241)).M("Canceling posted notification. New component = %s, previous = %s", componentName2, lrwVar2.f);
                        lrwVar2.e();
                        lrwVar2.f();
                    }
                    if (defpackage.onn.k(lrtVar.b, lrtVar.c)) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lrw.a.f()).ai((char) 4239)).u("Playable media detected. Cleaning up.");
                        lrwVar2.g();
                        break;
                    } else {
                        defpackage.yqm yqmVar3 = defpackage.lrw.a;
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar3.f()).ai((char) 4240)).u("Invalid session state detected.");
                        if (lrwVar2.f != null) {
                            ((defpackage.yqj) yqmVar3.l().ai((char) 4234)).u("Media suggestion already posted. Not creating a new media suggestion observer.");
                            break;
                        } else if (lrwVar2.e == null) {
                            lrwVar2.e = new lru(j$.time.Duration.ofMillis(3000L), defpackage.tcu.t(defpackage.tcu.v(defpackage.lqf.d().b(componentName2), new defpackage.lqi(11))));
                            lrwVar2.e.eM(r11, lrwVar2.c);
                            break;
                        }
                    }
                }
                break;
            case 9:
                lqa lqaVar = (lqa) obj;
                defpackage.yqm yqmVar4 = defpackage.lrw.a;
                ((defpackage.yqj) ((defpackage.yqj) yqmVar4.f()).ai((char) 4236)).y("Received suggestion: %s", lqaVar);
                java.lang.Object obj5 = this.a;
                if (defpackage.actz.K()) {
                    if (lqaVar.b() != null) {
                        android.graphics.Bitmap bitmapB = lqaVar.b();
                        bitmapB.getClass();
                        ondVar = new ond(com.google.android.apps.auto.components.graphics.icon.GhIcon.l(bitmapB), false);
                    } else if (lqaVar.c() != null) {
                        defpackage.lrw lrwVar3 = (defpackage.lrw) obj5;
                        lrwVar3.g = lqaVar;
                        defpackage.onf onfVar = lrwVar3.h;
                        android.content.Context context = lrwVar3.d;
                        android.net.Uri uriC = lqaVar.c();
                        uriC.getClass();
                        ondVar = onfVar.a(context, uriC);
                    } else {
                        ondVar = new ond((com.google.android.apps.auto.components.graphics.icon.GhIcon) null, false);
                    }
                    if (defpackage.onf.c(ondVar)) {
                        ((defpackage.lrw) obj5).a(lqaVar, ondVar.a);
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar4.f()).ai((char) 4237)).u("Not creating notification with empty icon after resource loading is complete.");
                    }
                }
                ((defpackage.lrw) obj5).f();
                break;
            case 10:
                java.lang.Object obj6 = this.a;
                lru lruVar = (lru) obj6;
                if (lruVar.h) {
                    ((defpackage.eqp) obj6).m(obj);
                } else {
                    lruVar.i = true;
                    lruVar.a = obj;
                }
                break;
            case 11:
                lry lryVar = (lry) obj;
                if (lryVar != null) {
                    com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState = lryVar.b;
                    if (aaPlaybackState.Q() != 7) {
                        java.lang.Object obj7 = this.a;
                        android.content.ComponentName componentName3 = lryVar.a;
                        defpackage.lrz lrzVar = (defpackage.lrz) obj7;
                        if (!j$.util.Objects.equals(lrzVar.f, componentName3)) {
                            lrzVar.g = null;
                            lrzVar.f = null;
                        }
                        if (aaPlaybackState.Q() == 3) {
                            lrzVar.g = null;
                            lrzVar.f = componentName3;
                        }
                        if (aaPlaybackState.Q() != 3 && lrzVar.f != null && lrzVar.g == null) {
                            defpackage.ojm.a();
                            lrzVar.g = j$.time.Instant.now();
                        }
                        android.content.ComponentName componentName4 = lrzVar.e;
                        j$.time.Instant instant = lrzVar.g;
                        j$.time.Instant instant2 = lrzVar.h;
                        instant2.getClass();
                        defpackage.ojm.a();
                        if (j$.time.Duration.between(instant2, j$.time.Instant.now()).compareTo(defpackage.lrz.b) > 0) {
                            if (!j$.util.Objects.equals(componentName4, componentName3) && aaPlaybackState.Q() != 3) {
                                if (instant != null) {
                                    defpackage.ojm.a();
                                    if (j$.time.Duration.between(instant, j$.time.Instant.now()).compareTo(defpackage.lrz.a) <= 0) {
                                    }
                                }
                                z = false;
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (android.text.TextUtils.isEmpty(aaPlaybackState.W())) {
                            defpackage.yhe yheVar = defpackage.lrz.c;
                            if (yheVar.containsKey(java.lang.Integer.valueOf(aaPlaybackState.P()))) {
                                lrzVar.a(lrzVar.d.getString(((java.lang.Integer) yheVar.get(java.lang.Integer.valueOf(aaPlaybackState.P()))).intValue()), componentName3, z, false);
                            }
                        } else {
                            lrzVar.a(aaPlaybackState.W().toString(), componentName3, z, true);
                        }
                    }
                    break;
                }
                break;
            case 12:
                ((defpackage.lrz) this.a).e = (android.content.ComponentName) obj;
                break;
            case 13:
                ((defpackage.lsj) this.a).b = (android.content.ComponentName) obj;
                break;
            case 14:
                ((defpackage.lsj) this.a).c = (android.content.ComponentName) obj;
                break;
            case 15:
                ((defpackage.lsj) this.a).e = ((java.lang.Boolean) obj).booleanValue();
                break;
            case 16:
                ((defpackage.yqj) defpackage.lsj.a.l().ai(4259)).y("Expiring observer keeping %s root node connection active", this.a);
                break;
            case 17:
                defpackage.yqm yqmVar5 = defpackage.lsj.a;
                lsh lshVar = (lsh) this.a;
                java.lang.Runnable runnable2 = lshVar.i;
                defpackage.wfp.f(runnable2);
                lshVar.h = obj;
                defpackage.wfp.d(runnable2, lshVar.a);
                break;
            case 18:
                lsp lspVar = (lsp) obj;
                ((defpackage.lsq) this.a).a.add(new lst(lspVar.a, (defpackage.ygw) lspVar.b.get()));
                break;
            case 19:
                lsp lspVar2 = (lsp) obj;
                ((defpackage.lsq) this.a).a.add(new lsu(lspVar2.a, ((java.lang.Boolean) lspVar2.b.get()).booleanValue()));
                break;
            default:
                los losVar = (los) obj;
                ((defpackage.lsq) this.a).a.add(new lsl(losVar.d().a, losVar.e()));
                break;
        }
    }
}
