package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cq {
    public final android.view.ViewGroup a;
    public final java.util.List b = new java.util.ArrayList();
    public final java.util.List c = new java.util.ArrayList();
    public boolean d;
    public boolean e;
    private boolean f;

    public cq(android.view.ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    private final void j() {
        for (defpackage.cp cpVar : this.b) {
            if (cpVar.i == 2) {
                cpVar.h(defpackage.ca.i(cpVar.a.requireView().getVisibility()), 1);
            }
        }
    }

    private final void k(java.util.Map map, android.view.View view) {
        int[] iArr = defpackage.ebt.a;
        java.lang.String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    k(map, childAt);
                }
            }
        }
    }

    private static void l(defpackage.zd zdVar, java.util.Collection collection) {
        defpackage.afga.bt(zdVar.entrySet(), new defpackage.bmp(collection, 1), false);
    }

    public final defpackage.cp a(android.support.v4.app.Fragment fragment) {
        java.lang.Object next;
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            defpackage.cp cpVar = (defpackage.cp) next;
            if (defpackage.afga.f(cpVar.a, fragment) && !cpVar.b) {
                return (defpackage.cp) next;
            }
        }
        next = null;
        return (defpackage.cp) next;
    }

    public final defpackage.cp b(android.support.v4.app.Fragment fragment) {
        java.lang.Object next;
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            defpackage.cp cpVar = (defpackage.cp) next;
            if (defpackage.afga.f(cpVar.a, fragment) && !cpVar.b) {
                return (defpackage.cp) next;
            }
        }
        next = null;
        return (defpackage.cp) next;
    }

    public final void c(defpackage.cp cpVar) {
        cpVar.getClass();
        if (cpVar.f) {
            int i = cpVar.h;
            android.support.v4.app.Fragment fragment = cpVar.a;
            defpackage.ca.h(i, fragment.requireView(), this.a);
            cpVar.g();
        }
    }

    public final void d(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.afga.bk(arrayList, ((defpackage.cp) it.next()).g);
        }
        java.util.List listAZ = defpackage.afga.aZ(defpackage.afga.bf(arrayList));
        int size = listAZ.size();
        for (int i = 0; i < size; i++) {
            ((cn) listAZ.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c((defpackage.cp) list.get(i2));
        }
        java.util.List listAZ2 = defpackage.afga.aZ(list);
        int size3 = listAZ2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            defpackage.cp cpVar = (defpackage.cp) listAZ2.get(i3);
            if (cpVar.g.isEmpty()) {
                cpVar.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:174:0x04c5 A[Catch: all -> 0x0671, LOOP:25: B:172:0x04bf->B:174:0x04c5, LOOP_END, TryCatch #0 {, blocks: (B:11:0x0019, B:12:0x0027, B:14:0x002e, B:16:0x003a, B:20:0x0042, B:21:0x0045, B:22:0x0049, B:24:0x0050, B:26:0x005a, B:28:0x0060, B:29:0x0076, B:34:0x0099, B:36:0x009f, B:30:0x007a, B:32:0x0080, B:33:0x0096, B:37:0x00a3, B:39:0x00a9, B:42:0x00b9, B:44:0x00c5, B:45:0x00cc, B:47:0x00d4, B:48:0x00db, B:49:0x00df, B:51:0x00e5, B:53:0x00f9, B:57:0x00ff, B:58:0x010a, B:60:0x0110, B:62:0x0124, B:66:0x012a, B:68:0x0133, B:69:0x0140, B:70:0x0156, B:72:0x015c, B:73:0x017f, B:74:0x0187, B:76:0x018d, B:83:0x01a7, B:84:0x01b6, B:85:0x01bf, B:87:0x01c5, B:89:0x01d2, B:90:0x01d6, B:91:0x01df, B:93:0x01e5, B:95:0x01f2, B:96:0x01f6, B:97:0x01fc, B:99:0x0202, B:103:0x0211, B:104:0x023a, B:175:0x04d1, B:176:0x04df, B:178:0x04e5, B:179:0x04f3, B:180:0x04fc, B:182:0x0502, B:184:0x0517, B:186:0x051b, B:187:0x051f, B:189:0x0529, B:191:0x052f, B:192:0x053d, B:194:0x0542, B:195:0x0545, B:196:0x054f, B:197:0x0553, B:199:0x0559, B:201:0x0565, B:203:0x056b, B:205:0x057b, B:207:0x0581, B:208:0x058f, B:209:0x0598, B:211:0x059d, B:213:0x05a3, B:215:0x05b1, B:218:0x05b8, B:219:0x05bc, B:221:0x05c2, B:225:0x05d2, B:226:0x05db, B:228:0x05e1, B:229:0x05ed, B:233:0x05f6, B:234:0x05fb, B:236:0x0601, B:241:0x0614, B:243:0x061c, B:245:0x063c, B:251:0x065f, B:253:0x0668, B:248:0x0649, B:250:0x0653, B:108:0x0247, B:109:0x0274, B:111:0x027a, B:115:0x028c, B:117:0x02c4, B:119:0x02d1, B:120:0x02d8, B:121:0x02dd, B:123:0x02e6, B:125:0x0301, B:127:0x0310, B:128:0x0334, B:130:0x033e, B:131:0x034c, B:133:0x0352, B:134:0x0368, B:135:0x0376, B:137:0x037c, B:138:0x0392, B:140:0x039f, B:142:0x03a5, B:143:0x03b7, B:144:0x03b8, B:146:0x03d3, B:148:0x03d9, B:149:0x03eb, B:150:0x03ec, B:152:0x03f6, B:154:0x0402, B:155:0x0405, B:156:0x0408, B:158:0x041c, B:124:0x02f4, B:164:0x0488, B:166:0x048e, B:167:0x0492, B:169:0x0498, B:171:0x04a2, B:172:0x04bf, B:174:0x04c5), top: B:259:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:232:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    public final void e() {
        int i;
        java.lang.Object next;
        java.lang.Object objPrevious;
        android.view.ViewGroup viewGroup;
        java.util.List list;
        java.util.ArrayList<aa> arrayList;
        cn aiVar;
        java.util.Iterator it;
        android.view.ViewGroup viewGroup2;
        boolean z;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        ck ckVar;
        java.util.ArrayList arrayList5;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.e) {
            return;
        }
        android.view.ViewGroup viewGroup3 = this.a;
        if (!viewGroup3.isAttachedToWindow()) {
            f();
            this.d = false;
            return;
        }
        java.util.List list2 = this.b;
        synchronized (list2) {
            java.util.List list3 = this.c;
            java.util.ArrayList arrayList6 = new java.util.ArrayList(list3);
            list3.clear();
            java.util.Iterator it2 = arrayList6.iterator();
            while (true) {
                boolean z5 = true;
                if (!it2.hasNext()) {
                    break;
                }
                defpackage.cp cpVar = (defpackage.cp) it2.next();
                if (list2.isEmpty() || !cpVar.a.mTransitioning) {
                    z5 = false;
                }
                cpVar.d = z5;
            }
            java.util.Iterator it3 = arrayList6.iterator();
            while (true) {
                i = 2;
                if (!it3.hasNext()) {
                    break;
                }
                defpackage.cp cpVar2 = (defpackage.cp) it3.next();
                if (this.f) {
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + cpVar2);
                    }
                    cpVar2.a();
                } else {
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + cpVar2);
                    }
                    cpVar2.e(viewGroup3);
                }
                this.f = false;
                if (!cpVar2.c) {
                    list3.add(cpVar2);
                }
            }
            if (!list2.isEmpty()) {
                j();
                java.util.ArrayList<defpackage.cp> arrayList7 = new java.util.ArrayList(list2);
                if (!arrayList7.isEmpty()) {
                    list2.clear();
                    list3.addAll(arrayList7);
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    boolean z6 = this.d;
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", "Collecting Effects");
                    }
                    java.util.Iterator it4 = arrayList7.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        defpackage.cp cpVar3 = (defpackage.cp) next;
                        android.view.View view = cpVar3.a.mView;
                        view.getClass();
                        if (defpackage.ca.j(view) == 2 && cpVar3.h != 2) {
                            break;
                        }
                    }
                    defpackage.cp cpVar4 = (defpackage.cp) next;
                    java.util.ListIterator listIterator = arrayList7.listIterator(arrayList7.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        defpackage.cp cpVar5 = (defpackage.cp) objPrevious;
                        android.view.View view2 = cpVar5.a.mView;
                        view2.getClass();
                        if (defpackage.ca.j(view2) != 2 && cpVar5.h == 2) {
                            break;
                        }
                    }
                    defpackage.cp cpVar6 = (defpackage.cp) objPrevious;
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", defpackage.a.bs(cpVar6, cpVar4, "Executing operations from ", " to "));
                    }
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    android.support.v4.app.Fragment fragment = ((defpackage.cp) defpackage.afga.aE(arrayList7)).a;
                    java.util.Iterator it5 = arrayList7.iterator();
                    while (it5.hasNext()) {
                        defpackage.ax axVar = ((defpackage.cp) it5.next()).a.mAnimationInfo;
                        int i2 = i;
                        defpackage.ax axVar2 = fragment.mAnimationInfo;
                        axVar.b = axVar2.b;
                        axVar.c = axVar2.c;
                        axVar.d = axVar2.d;
                        axVar.e = axVar2.e;
                        i = i2;
                    }
                    int i3 = i;
                    for (defpackage.cp cpVar7 : arrayList7) {
                        arrayList8.add(new aa(cpVar7, z6));
                        if (z6) {
                            if (cpVar7 == cpVar4) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else if (cpVar7 == cpVar6) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        arrayList9.add(new aj(cpVar7, z6, z4));
                        cpVar7.c(new defpackage.af(this, cpVar7, 1));
                    }
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    for (java.lang.Object obj : arrayList9) {
                        if (!((aj) obj).b()) {
                            arrayList10.add(obj);
                        }
                    }
                    java.util.ArrayList<aj> arrayList11 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : arrayList10) {
                        if (((aj) obj2).a() != null) {
                            arrayList11.add(obj2);
                        }
                    }
                    ck ckVar2 = null;
                    for (aj ajVar : arrayList11) {
                        ck ckVarA = ajVar.a();
                        if (ckVar2 != null && ckVarA != ckVar2) {
                            throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((ad) ajVar).a.a + " returned Transition " + ajVar.b + " which uses a different Transition type than other Fragments.");
                        }
                        ckVar2 = ckVarA;
                    }
                    if (ckVar2 == null) {
                        viewGroup = viewGroup3;
                        list = arrayList7;
                        arrayList = arrayList8;
                    } else {
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        java.util.ArrayList arrayList13 = new java.util.ArrayList();
                        defpackage.zd zdVar = new defpackage.zd();
                        java.util.ArrayList<java.lang.String> arrayList14 = new java.util.ArrayList<>();
                        java.util.ArrayList arrayList15 = new java.util.ArrayList();
                        defpackage.zd zdVar2 = new defpackage.zd();
                        defpackage.zd zdVar3 = new defpackage.zd();
                        java.lang.Object obj3 = null;
                        for (aj ajVar2 : arrayList11) {
                            if (!ajVar2.c() || cpVar4 == null || cpVar6 == null) {
                                viewGroup2 = viewGroup3;
                                z = z6;
                                arrayList2 = arrayList7;
                                arrayList3 = arrayList8;
                                arrayList4 = arrayList11;
                                ckVar = ckVar2;
                                arrayList5 = arrayList12;
                            } else {
                                java.lang.Object objC = ckVar2.c(ckVar2.a(ajVar2.d));
                                android.support.v4.app.Fragment fragment2 = cpVar6.a;
                                viewGroup2 = viewGroup3;
                                java.util.ArrayList sharedElementSourceNames = fragment2.getSharedElementSourceNames();
                                sharedElementSourceNames.getClass();
                                z = z6;
                                android.support.v4.app.Fragment fragment3 = cpVar4.a;
                                arrayList3 = arrayList8;
                                java.util.ArrayList<java.lang.String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                                sharedElementSourceNames2.getClass();
                                arrayList4 = arrayList11;
                                java.util.ArrayList<java.lang.String> sharedElementTargetNames = fragment3.getSharedElementTargetNames();
                                sharedElementTargetNames.getClass();
                                ckVar = ckVar2;
                                int size = sharedElementTargetNames.size();
                                arrayList2 = arrayList7;
                                arrayList5 = arrayList12;
                                int i4 = 0;
                                while (i4 < size) {
                                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                                    java.util.ArrayList<java.lang.String> arrayList16 = sharedElementTargetNames;
                                    if (iIndexOf != -1) {
                                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i4));
                                    }
                                    i4++;
                                    sharedElementTargetNames = arrayList16;
                                }
                                java.util.ArrayList<java.lang.String> sharedElementTargetNames2 = fragment2.getSharedElementTargetNames();
                                sharedElementTargetNames2.getClass();
                                defpackage.afau afauVar = !z ? new defpackage.afau(fragment3.getExitTransitionCallback(), fragment2.getEnterTransitionCallback()) : new defpackage.afau(fragment3.getEnterTransitionCallback(), fragment2.getExitTransitionCallback());
                                java.lang.Object obj4 = afauVar.b;
                                defpackage.duu duuVar = (defpackage.duu) afauVar.a;
                                defpackage.duu duuVar2 = (defpackage.duu) obj4;
                                int size2 = sharedElementSourceNames.size();
                                int i5 = 0;
                                while (i5 < size2) {
                                    java.lang.Object obj5 = sharedElementSourceNames.get(i5);
                                    obj5.getClass();
                                    defpackage.duu duuVar3 = duuVar2;
                                    java.lang.String str = (java.lang.String) obj5;
                                    java.lang.String str2 = sharedElementTargetNames2.get(i5);
                                    str2.getClass();
                                    zdVar.put(str, str2);
                                    i5++;
                                    duuVar2 = duuVar3;
                                    duuVar = duuVar;
                                }
                                defpackage.duu duuVar4 = duuVar2;
                                defpackage.duu duuVar5 = duuVar;
                                if (defpackage.bt.ac(i3)) {
                                    android.util.Log.v("FragmentManager", ">>> entering view names <<<");
                                    java.util.Iterator<java.lang.String> it6 = sharedElementTargetNames2.iterator();
                                    it6.getClass();
                                    while (it6.hasNext()) {
                                        android.util.Log.v("FragmentManager", "Name: ".concat(java.lang.String.valueOf(it6.next())));
                                    }
                                    android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
                                    java.util.Iterator it7 = sharedElementSourceNames.iterator();
                                    it7.getClass();
                                    while (it7.hasNext()) {
                                        android.util.Log.v("FragmentManager", "Name: ".concat(java.lang.String.valueOf((java.lang.String) it7.next())));
                                    }
                                }
                                android.view.View view3 = fragment3.mView;
                                view3.getClass();
                                k(zdVar2, view3);
                                zdVar2.a(sharedElementSourceNames);
                                if (duuVar5 != null) {
                                    if (!defpackage.bt.ac(i3)) {
                                        throw null;
                                    }
                                    java.util.Objects.toString(cpVar4);
                                    android.util.Log.v("FragmentManager", "Executing exit callback for operation ".concat(cpVar4.toString()));
                                    throw null;
                                }
                                zdVar.a(zdVar2.keySet());
                                android.view.View view4 = fragment2.mView;
                                view4.getClass();
                                k(zdVar3, view4);
                                zdVar3.a(sharedElementTargetNames2);
                                zdVar3.a(zdVar.values());
                                if (duuVar4 != null) {
                                    if (!defpackage.bt.ac(i3)) {
                                        throw null;
                                    }
                                    java.util.Objects.toString(cpVar6);
                                    android.util.Log.v("FragmentManager", "Executing enter callback for operation ".concat(cpVar6.toString()));
                                    throw null;
                                }
                                ck ckVar3 = cd.a;
                                for (int i6 = zdVar.d - 1; i6 >= 0; i6--) {
                                    if (!zdVar3.containsKey((java.lang.String) zdVar.g(i6))) {
                                        zdVar.e(i6);
                                    }
                                }
                                l(zdVar2, zdVar.keySet());
                                l(zdVar3, zdVar.values());
                                if (zdVar.isEmpty()) {
                                    android.util.Log.i("FragmentManager", "Ignoring shared elements transition " + objC + " between " + cpVar4 + " and " + cpVar6 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                    arrayList5.clear();
                                    arrayList13.clear();
                                    arrayList15 = sharedElementSourceNames;
                                    arrayList14 = sharedElementTargetNames2;
                                    obj3 = null;
                                } else {
                                    arrayList15 = sharedElementSourceNames;
                                    obj3 = objC;
                                    arrayList14 = sharedElementTargetNames2;
                                }
                            }
                            arrayList11 = arrayList4;
                            z6 = z;
                            viewGroup3 = viewGroup2;
                            arrayList8 = arrayList3;
                            ckVar2 = ckVar;
                            arrayList12 = arrayList5;
                            arrayList7 = arrayList2;
                        }
                        viewGroup = viewGroup3;
                        boolean z7 = z6;
                        list = arrayList7;
                        arrayList = arrayList8;
                        java.util.ArrayList arrayList17 = arrayList11;
                        ck ckVar4 = ckVar2;
                        java.util.ArrayList arrayList18 = arrayList12;
                        if (obj3 != null) {
                            aiVar = new ai(arrayList17, cpVar4, cpVar6, ckVar4, obj3, arrayList18, arrayList13, zdVar, arrayList14, arrayList15, zdVar2, zdVar3, z7);
                            it = arrayList17.iterator();
                            while (it.hasNext()) {
                                ((ad) ((aj) it.next())).a.d(aiVar);
                            }
                        } else if (!arrayList17.isEmpty()) {
                            java.util.Iterator it8 = arrayList17.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    if (((aj) it8.next()).b != null) {
                                        aiVar = new ai(arrayList17, cpVar4, cpVar6, ckVar4, obj3, arrayList18, arrayList13, zdVar, arrayList14, arrayList15, zdVar2, zdVar3, z7);
                                        it = arrayList17.iterator();
                                        while (it.hasNext()) {
                                            ((ad) ((aj) it.next())).a.d(aiVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    java.util.ArrayList<aa> arrayList19 = new java.util.ArrayList();
                    java.util.ArrayList arrayList20 = new java.util.ArrayList();
                    java.util.Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        defpackage.afga.bk(arrayList20, ((ad) ((aa) it9.next())).a.g);
                    }
                    boolean zIsEmpty = arrayList20.isEmpty();
                    boolean z8 = false;
                    for (aa aaVar : arrayList) {
                        defpackage.cp cpVar8 = ((ad) aaVar).a;
                        android.content.Context context = viewGroup.getContext();
                        context.getClass();
                        se seVarA = aaVar.a(context);
                        if (seVarA != null) {
                            if (seVarA.a == null) {
                                arrayList19.add(aaVar);
                            } else {
                                android.support.v4.app.Fragment fragment4 = cpVar8.a;
                                if (cpVar8.g.isEmpty()) {
                                    if (cpVar8.h == 3) {
                                        cpVar8.g();
                                    }
                                    cpVar8.d(new ac(aaVar));
                                    z8 = true;
                                } else if (defpackage.bt.ac(i3)) {
                                    android.util.Log.v("FragmentManager", defpackage.a.bl(fragment4, "Ignoring Animator set on ", " as this Fragment was involved in a Transition."));
                                }
                            }
                        }
                    }
                    for (aa aaVar2 : arrayList19) {
                        defpackage.cp cpVar9 = ((ad) aaVar2).a;
                        android.support.v4.app.Fragment fragment5 = cpVar9.a;
                        if (zIsEmpty) {
                            if (!z8) {
                                cpVar9.d(new z(aaVar2));
                            } else if (defpackage.bt.ac(i3)) {
                                android.util.Log.v("FragmentManager", defpackage.a.bl(fragment5, "Ignoring Animation set on ", " as Animations cannot run alongside Animators."));
                            }
                        } else if (defpackage.bt.ac(i3)) {
                            android.util.Log.v("FragmentManager", defpackage.a.bl(fragment5, "Ignoring Animation set on ", " as Animations cannot run alongside Transitions."));
                        }
                    }
                    java.util.Iterator it10 = list.iterator();
                    loop12: while (true) {
                        z2 = true;
                        while (true) {
                            if (!it10.hasNext()) {
                                break loop12;
                            }
                            java.util.List list4 = ((defpackage.cp) it10.next()).g;
                            if (!list4.isEmpty()) {
                                if (list4.isEmpty()) {
                                    break;
                                }
                                java.util.Iterator it11 = list4.iterator();
                                do {
                                    if (!it11.hasNext()) {
                                        break;
                                    }
                                } while (((cn) it11.next()).d());
                            }
                            z2 = false;
                        }
                    }
                    if (z2) {
                        java.util.ArrayList arrayList21 = new java.util.ArrayList();
                        java.util.Iterator it12 = list.iterator();
                        while (it12.hasNext()) {
                            defpackage.afga.bk(arrayList21, ((defpackage.cp) it12.next()).g);
                        }
                        if (arrayList21.isEmpty()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    java.util.Iterator it13 = list.iterator();
                    boolean z9 = true;
                    while (it13.hasNext()) {
                        z9 &= ((defpackage.cp) it13.next()).a.mTransitioning;
                    }
                    this.f = z9 && !z3;
                    if (defpackage.bt.ac(i3)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z3 + " \ntransition = " + z9);
                    }
                    if (z9) {
                        java.util.List list5 = list;
                        if (z3) {
                            h(list5);
                            int size3 = list5.size();
                            for (int i7 = 0; i7 < size3; i7++) {
                                c((defpackage.cp) list5.get(i7));
                            }
                        }
                    } else {
                        java.util.List list6 = list;
                        h(list6);
                        d(list6);
                    }
                    this.d = false;
                    if (defpackage.bt.ac(i3)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    public final void f() {
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        android.view.ViewGroup viewGroup = this.a;
        java.util.List list = this.b;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            j();
            h(list);
            java.util.ArrayList<defpackage.cp> arrayList = new java.util.ArrayList(this.c);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((defpackage.cp) it.next()).d = false;
            }
            for (defpackage.cp cpVar : arrayList) {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bx(cpVar, zIsAttachedToWindow ? "" : defpackage.a.bl(viewGroup, "Container ", " is not attached to window. "), "SpecialEffectsController: ", "Cancelling running operation "));
                }
                cpVar.e(viewGroup);
            }
            java.util.ArrayList<defpackage.cp> arrayList2 = new java.util.ArrayList(list);
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((defpackage.cp) it2.next()).d = false;
            }
            for (defpackage.cp cpVar2 : arrayList2) {
                if (defpackage.bt.ac(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bx(cpVar2, zIsAttachedToWindow ? "" : defpackage.a.bl(viewGroup, "Container ", " is not attached to window. "), "SpecialEffectsController: ", "Cancelling pending operation "));
                }
                cpVar2.e(viewGroup);
            }
        }
    }

    public final void g() {
        java.lang.Object objPrevious;
        java.util.List list = this.b;
        synchronized (list) {
            j();
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                defpackage.cp cpVar = (defpackage.cp) objPrevious;
                android.view.View view = cpVar.a.mView;
                view.getClass();
                int iJ = defpackage.ca.j(view);
                if (cpVar.h == 2 && iJ != 2) {
                    break;
                }
            }
            defpackage.cp cpVar2 = (defpackage.cp) objPrevious;
            android.support.v4.app.Fragment fragment = cpVar2 != null ? cpVar2.a : null;
            this.e = fragment != null ? fragment.isPostponed() : false;
        }
    }

    public final void h(java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.cp) list.get(i)).b();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.afga.bk(arrayList, ((defpackage.cp) it.next()).g);
        }
        java.util.List listAZ = defpackage.afga.aZ(defpackage.afga.bf(arrayList));
        int size2 = listAZ.size();
        for (int i2 = 0; i2 < size2; i2++) {
            cn cnVar = (cn) listAZ.get(i2);
            android.view.ViewGroup viewGroup = this.a;
            if (!cnVar.i) {
                cnVar.c(viewGroup);
            }
            cnVar.i = true;
        }
    }

    public final void i(int i, int i2, defpackage.by byVar) {
        java.util.List list = this.b;
        synchronized (list) {
            android.support.v4.app.Fragment fragment = byVar.a;
            fragment.getClass();
            defpackage.cp cpVarA = a(fragment);
            if (cpVarA == null) {
                if (fragment.mTransitioning || fragment.mRemoving) {
                    fragment.getClass();
                    cpVarA = b(fragment);
                } else {
                    cpVarA = null;
                }
            }
            if (cpVarA != null) {
                cpVarA.h(i, i2);
            } else {
                defpackage.co coVar = new defpackage.co(i, i2, byVar);
                list.add(coVar);
                coVar.c(new defpackage.aq(this, coVar, 4));
                coVar.c(new defpackage.aq(this, coVar, 5));
            }
        }
    }
}
