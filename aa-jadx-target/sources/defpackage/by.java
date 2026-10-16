package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class by {
    public final android.support.v4.app.Fragment a;
    private final defpackage.bz c;
    private final defpackage.bil e;
    private boolean d = false;
    public int b = -1;

    public by(defpackage.bil bilVar, defpackage.bz bzVar, java.lang.ClassLoader classLoader, defpackage.bf bfVar, android.os.Bundle bundle) {
        this.e = bilVar;
        this.c = bzVar;
        android.support.v4.app.Fragment fragmentA = bundle.getParcelable("state").a(bfVar, classLoader);
        this.a = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        android.os.Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (defpackage.bt.ac(2)) {
            java.util.Objects.toString(fragmentA);
            android.util.Log.v("FragmentManager", "Instantiated fragment ".concat(java.lang.String.valueOf(fragmentA)));
        }
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle;
        android.os.Bundle bundle2 = new android.os.Bundle();
        android.support.v4.app.Fragment fragment = this.a;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new android.support.v4.app.FragmentState(fragment));
        if (fragment.mState > 0) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.e.S(fragment, bundle3, false);
            android.os.Bundle bundle4 = new android.os.Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            android.os.Bundle bundleC = fragment.mChildFragmentManager.c();
            if (!bundleC.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleC);
            }
            if (fragment.mView != null) {
                g();
            }
            android.util.SparseArray<android.os.Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            android.os.Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        android.os.Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    final void b() {
        android.view.View view;
        android.view.View view2;
        android.support.v4.app.Fragment fragment = this.a;
        android.support.v4.app.Fragment fragmentG = defpackage.bt.g(fragment.mContainer);
        android.support.v4.app.Fragment parentFragment = fragment.getParentFragment();
        if (fragmentG != null && !fragmentG.equals(parentFragment)) {
            int i = fragment.mContainerId;
            int i2 = defpackage.enp.a;
            fragment.getClass();
            eob eobVar = new eob(fragment, fragmentG, i);
            defpackage.enp.d(eobVar);
            defpackage.eno enoVarB = defpackage.enp.b(fragment);
            if (enoVarB.b.contains(defpackage.enn.e) && defpackage.enp.e(enoVarB, fragment.getClass(), eobVar.getClass())) {
                defpackage.enp.c(enoVarB, eobVar);
            }
        }
        defpackage.bz bzVar = this.c;
        android.view.ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = bzVar.a;
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i3 = iIndexOf - 1; i3 >= 0; i3--) {
                android.support.v4.app.Fragment fragment2 = (android.support.v4.app.Fragment) arrayList.get(i3);
                if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                android.support.v4.app.Fragment fragment3 = (android.support.v4.app.Fragment) arrayList.get(iIndexOf);
                if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    final void c() {
        java.lang.String resourceName;
        android.support.v4.app.Fragment fragment = this.a;
        if (fragment.mFromLayout) {
            return;
        }
        if (defpackage.bt.ac(3)) {
            java.util.Objects.toString(fragment);
            android.util.Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(java.lang.String.valueOf(fragment)));
        }
        android.os.Bundle bundle = fragment.mSavedFragmentState;
        android.view.ViewGroup viewGroup = null;
        android.os.Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        android.view.LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        android.view.ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new java.lang.IllegalArgumentException(defpackage.a.bl(fragment, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (android.view.ViewGroup) fragment.mFragmentManager.n.a(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (android.content.res.Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("No view found for id 0x");
                        android.support.v4.app.Fragment fragment2 = this.a;
                        sb.append(java.lang.Integer.toHexString(fragment2.mContainerId));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(fragment2);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof android.support.v4.app.FragmentContainerView)) {
                    android.support.v4.app.Fragment fragment3 = this.a;
                    int i2 = defpackage.enp.a;
                    fragment3.getClass();
                    defpackage.eoa eoaVar = new defpackage.eoa(fragment3, viewGroup);
                    defpackage.enp.d(eoaVar);
                    defpackage.eno enoVarB = defpackage.enp.b(fragment3);
                    if (enoVarB.b.contains(defpackage.enn.i) && defpackage.enp.e(enoVarB, fragment3.getClass(), eoaVar.getClass())) {
                        defpackage.enp.c(enoVarB, eoaVar);
                    }
                }
            }
        }
        android.support.v4.app.Fragment fragment4 = this.a;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment4.mView != null) {
            if (defpackage.bt.ac(3)) {
                java.util.Objects.toString(fragment4);
                android.util.Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(java.lang.String.valueOf(fragment4)));
            }
            fragment4.mView.setSaveFromParentEnabled(false);
            fragment4.mView.setTag(2131428235, fragment4);
            if (viewGroup != null) {
                b();
            }
            if (fragment4.mHidden) {
                fragment4.mView.setVisibility(8);
            }
            if (fragment4.mView.isAttachedToWindow()) {
                android.view.View view = fragment4.mView;
                int[] iArr = defpackage.ebt.a;
                view.requestApplyInsets();
            } else {
                android.view.View view2 = fragment4.mView;
                view2.addOnAttachStateChangeListener(new defpackage.cjp(view2, 1));
            }
            fragment4.performViewCreated();
            this.e.V(fragment4, fragment4.mView, bundle2, false);
            int visibility = fragment4.mView.getVisibility();
            fragment4.setPostOnViewCreatedAlpha(fragment4.mView.getAlpha());
            if (fragment4.mContainer != null && visibility == 0) {
                android.view.View viewFindFocus = fragment4.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment4.setFocusedView(viewFindFocus);
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", defpackage.a.bs(fragment4, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
                    }
                }
                fragment4.mView.setAlpha(0.0f);
            }
        }
        fragment4.mState = 2;
    }

    final void d() {
        android.support.v4.app.Fragment fragment = this.a;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (defpackage.bt.ac(3)) {
                java.util.Objects.toString(fragment);
                android.util.Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(java.lang.String.valueOf(fragment)));
            }
            android.os.Bundle bundle = fragment.mSavedFragmentState;
            android.os.Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            android.view.View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(2131428235, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.e.V(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:235:0x0487 A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x048e A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x0494 A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:239:0x049c  */
    /* JADX WARN: Code duplicated, block: B:248:0x04c4 A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:255:0x04e1 A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x04cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x04be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x04be A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
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
    public final void e() {
        int iMin;
        int i;
        android.view.ViewGroup viewGroup;
        defpackage.bg<?> bgVar;
        android.content.Context context;
        boolean z;
        defpackage.bz bzVar;
        java.lang.String str;
        android.support.v4.app.Fragment fragment;
        android.support.v4.app.Fragment fragmentB;
        android.view.View view;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        if (this.d) {
            if (defpackage.bt.ac(2)) {
                android.support.v4.app.Fragment fragment2 = this.a;
                java.util.Objects.toString(fragment2);
                android.util.Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for ".concat(java.lang.String.valueOf(fragment2)));
                return;
            }
            return;
        }
        try {
            this.d = true;
            java.lang.Object[] objArr = false;
            while (true) {
                android.support.v4.app.Fragment fragment3 = this.a;
                if (fragment3.mFragmentManager == null) {
                    iMin = fragment3.mState;
                } else {
                    iMin = this.b;
                    int iOrdinal = fragment3.mMaxState.ordinal();
                    if (iOrdinal == 1) {
                        iMin = java.lang.Math.min(iMin, 0);
                    } else if (iOrdinal == 2) {
                        iMin = java.lang.Math.min(iMin, 1);
                    } else if (iOrdinal == 3) {
                        iMin = java.lang.Math.min(iMin, 5);
                    } else if (iOrdinal != 4) {
                        iMin = java.lang.Math.min(iMin, -1);
                    }
                    if (fragment3.mFromLayout) {
                        boolean z2 = fragment3.mInLayout;
                        int i2 = this.b;
                        if (z2) {
                            iMin = java.lang.Math.max(i2, 2);
                            android.view.View view2 = fragment3.mView;
                            if (view2 != null && view2.getParent() == null) {
                                iMin = java.lang.Math.min(iMin, 2);
                            }
                        } else {
                            iMin = i2 < 4 ? java.lang.Math.min(iMin, fragment3.mState) : java.lang.Math.min(iMin, 1);
                        }
                    }
                    if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
                        iMin = java.lang.Math.min(iMin, 4);
                    }
                    if (!fragment3.mAdded) {
                        iMin = java.lang.Math.min(iMin, 1);
                    }
                    android.view.ViewGroup viewGroup4 = fragment3.mContainer;
                    if (viewGroup4 != null) {
                        defpackage.ca caVarAp = fragment3.getParentFragmentManager().ap();
                        caVarAp.getClass();
                        defpackage.cq cqVarD = defpackage.ca.d(viewGroup4, caVarAp);
                        fragment3.getClass();
                        defpackage.cp cpVarA = cqVarD.a(fragment3);
                        i = cpVarA != null ? cpVarA.i : 0;
                        defpackage.cp cpVarB = cqVarD.b(fragment3);
                        int i3 = cpVarB != null ? cpVarB.i : 0;
                        if (i == 0 || i - 1 == 0) {
                            i = i3;
                        }
                    } else {
                        i = 0;
                    }
                    if (i == 2) {
                        iMin = java.lang.Math.min(iMin, 6);
                    } else if (i == 3) {
                        iMin = java.lang.Math.max(iMin, 3);
                    } else if (fragment3.mRemoving) {
                        iMin = fragment3.isInBackStack() ? java.lang.Math.min(iMin, 1) : java.lang.Math.min(iMin, -1);
                    }
                    if (fragment3.mDeferStart && fragment3.mState < 5) {
                        iMin = java.lang.Math.min(iMin, 4);
                    }
                    if (fragment3.mTransitioning) {
                        iMin = java.lang.Math.max(iMin, 3);
                    }
                    if (defpackage.bt.ac(2)) {
                        android.util.Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment3);
                    }
                }
                int i4 = fragment3.mState;
                if (iMin == i4) {
                    if (objArr == false && i4 == -1 && fragment3.mRemoving && !fragment3.isInBackStack() && !fragment3.mBeingSaved) {
                        if (defpackage.bt.ac(3)) {
                            android.util.Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment3);
                        }
                        defpackage.bz bzVar2 = this.c;
                        bzVar2.d.b(fragment3, true);
                        bzVar2.k(this);
                        if (defpackage.bt.ac(3)) {
                            android.util.Log.d("FragmentManager", "initState called for fragment: " + fragment3);
                        }
                        fragment3.initState();
                    }
                    if (fragment3.mHiddenChanged) {
                        if (fragment3.mView != null && (viewGroup = fragment3.mContainer) != null) {
                            defpackage.ca caVarAp2 = fragment3.getParentFragmentManager().ap();
                            caVarAp2.getClass();
                            defpackage.cq cqVarD2 = defpackage.ca.d(viewGroup, caVarAp2);
                            if (fragment3.mHidden) {
                                if (defpackage.bt.ac(2)) {
                                    java.util.Objects.toString(fragment3);
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment ".concat(java.lang.String.valueOf(fragment3)));
                                }
                                cqVarD2.i(3, 1, this);
                            } else {
                                if (defpackage.bt.ac(2)) {
                                    java.util.Objects.toString(fragment3);
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment ".concat(java.lang.String.valueOf(fragment3)));
                                }
                                cqVarD2.i(2, 1, this);
                            }
                        }
                        defpackage.bt btVar = fragment3.mFragmentManager;
                        if (btVar != null && fragment3.mAdded && defpackage.bt.aj(fragment3)) {
                            btVar.v = true;
                        }
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                        fragment3.mChildFragmentManager.y();
                    }
                    this.d = false;
                    return;
                }
                defpackage.by byVarD = null;
                if (iMin <= i4) {
                    switch (i4 - 1) {
                        case -1:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "movefrom ATTACHED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            fragment3.performDetach();
                            this.e.N(fragment3, false);
                            fragment3.mState = -1;
                            fragment3.mHost = null;
                            fragment3.mContextAwareHelper.b();
                            fragment3.mParentFragment = null;
                            fragment3.mFragmentManager = null;
                            if ((fragment3.mRemoving && !fragment3.isInBackStack()) || this.c.d.f(fragment3)) {
                                if (defpackage.bt.ac(3)) {
                                    java.util.Objects.toString(fragment3);
                                    android.util.Log.d("FragmentManager", "initState called for fragment: ".concat(java.lang.String.valueOf(fragment3)));
                                }
                                fragment3.initState();
                            }
                            break;
                        case defpackage.abnt.b /* 0 */:
                            if (fragment3.mBeingSaved) {
                                defpackage.bz bzVar3 = this.c;
                                if (((android.os.Bundle) bzVar3.c.get(fragment3.mWho)) == null) {
                                    bzVar3.a(fragment3.mWho, a());
                                }
                            }
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "movefrom CREATED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            java.lang.Object[] objArr2 = fragment3.mRemoving && !fragment3.isInBackStack();
                            if (objArr2 != false && !fragment3.mBeingSaved) {
                                this.c.a(fragment3.mWho, null);
                            }
                            if (objArr2 == true) {
                                bgVar = fragment3.mHost;
                                if (bgVar instanceof defpackage.esa) {
                                    z = this.c.d.f;
                                } else {
                                    context = bgVar.c;
                                    if (context instanceof android.app.Activity) {
                                        z = !((android.app.Activity) context).isChangingConfigurations();
                                    } else {
                                        z = true;
                                    }
                                }
                                if (objArr2 == true) {
                                    this.c.d.b(fragment3, false);
                                } else {
                                    this.c.d.b(fragment3, false);
                                }
                                fragment3.performDestroy();
                                this.e.M(fragment3, false);
                                bzVar = this.c;
                                while (r7.hasNext()) {
                                    if (byVar != null) {
                                        fragment = byVar.a;
                                        if (fragment3.mWho.equals(fragment.mTargetWho)) {
                                            fragment.mTarget = fragment3;
                                            fragment.mTargetWho = null;
                                        }
                                    }
                                }
                                str = fragment3.mTargetWho;
                                if (str != null) {
                                    fragment3.mTarget = bzVar.b(str);
                                }
                                bzVar.k(this);
                            } else {
                                defpackage.bz bzVar4 = this.c;
                                if (bzVar4.d.f(fragment3)) {
                                    bgVar = fragment3.mHost;
                                    if (bgVar instanceof defpackage.esa) {
                                        z = this.c.d.f;
                                    } else {
                                        context = bgVar.c;
                                        if (context instanceof android.app.Activity) {
                                            z = !((android.app.Activity) context).isChangingConfigurations();
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if ((objArr2 == true && !fragment3.mBeingSaved) || z) {
                                        this.c.d.b(fragment3, false);
                                    }
                                    fragment3.performDestroy();
                                    this.e.M(fragment3, false);
                                    bzVar = this.c;
                                    for (defpackage.by byVar : bzVar.e()) {
                                        if (byVar != null) {
                                            fragment = byVar.a;
                                            if (fragment3.mWho.equals(fragment.mTargetWho)) {
                                                fragment.mTarget = fragment3;
                                                fragment.mTargetWho = null;
                                            }
                                        }
                                    }
                                    str = fragment3.mTargetWho;
                                    if (str != null) {
                                        fragment3.mTarget = bzVar.b(str);
                                    }
                                    bzVar.k(this);
                                } else {
                                    java.lang.String str2 = fragment3.mTargetWho;
                                    if (str2 != null && (fragmentB = bzVar4.b(str2)) != null && fragmentB.mRetainInstance) {
                                        fragment3.mTarget = fragmentB;
                                    }
                                    fragment3.mState = 0;
                                }
                            }
                            break;
                        case 1:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "movefrom CREATE_VIEW: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            android.view.ViewGroup viewGroup5 = fragment3.mContainer;
                            if (viewGroup5 != null && (view = fragment3.mView) != null) {
                                viewGroup5.removeView(view);
                            }
                            fragment3.performDestroyView();
                            this.e.W(fragment3, false);
                            fragment3.mContainer = null;
                            fragment3.mView = null;
                            fragment3.mViewLifecycleOwner = null;
                            fragment3.mViewLifecycleOwnerLiveData.m(null);
                            fragment3.mInLayout = false;
                            fragment3.mState = 1;
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            fragment3.mInLayout = false;
                            fragment3.mState = 2;
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            if (defpackage.bt.ac(3)) {
                                android.util.Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment3);
                            }
                            if (fragment3.mBeingSaved) {
                                this.c.a(fragment3.mWho, a());
                            } else if (fragment3.mView != null && fragment3.mSavedViewState == null) {
                                g();
                            }
                            if (fragment3.mView != null && (viewGroup2 = fragment3.mContainer) != null) {
                                defpackage.ca caVarAp3 = fragment3.getParentFragmentManager().ap();
                                caVarAp3.getClass();
                                defpackage.cq cqVarD3 = defpackage.ca.d(viewGroup2, caVarAp3);
                                if (defpackage.bt.ac(2)) {
                                    java.util.Objects.toString(fragment3);
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment ".concat(java.lang.String.valueOf(fragment3)));
                                }
                                cqVarD3.i(1, 3, this);
                            }
                            fragment3.mState = 3;
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "movefrom STARTED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            fragment3.performStop();
                            this.e.U(fragment3, false);
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            fragment3.mState = 5;
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "movefrom RESUMED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            fragment3.performPause();
                            this.e.O(fragment3, false);
                            break;
                    }
                } else {
                    switch (i4 + 1) {
                        case defpackage.abnt.b /* 0 */:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "moveto ATTACHED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            android.support.v4.app.Fragment fragment4 = fragment3.mTarget;
                            if (fragment4 != null) {
                                defpackage.by byVarD2 = this.c.d(fragment4.mWho);
                                if (byVarD2 == null) {
                                    throw new java.lang.IllegalStateException("Fragment " + fragment3 + " declared target fragment " + fragment3.mTarget + " that does not belong to this FragmentManager!");
                                }
                                fragment3.mTargetWho = fragment3.mTarget.mWho;
                                fragment3.mTarget = null;
                                byVarD = byVarD2;
                            } else {
                                java.lang.String str3 = fragment3.mTargetWho;
                                if (str3 != null && (byVarD = this.c.d(str3)) == null) {
                                    throw new java.lang.IllegalStateException("Fragment " + fragment3 + " declared target fragment " + fragment3.mTargetWho + " that does not belong to this FragmentManager!");
                                }
                            }
                            if (byVarD != null) {
                                byVarD.e();
                            }
                            defpackage.bt btVar2 = fragment3.mFragmentManager;
                            fragment3.mHost = btVar2.m;
                            fragment3.mParentFragment = btVar2.o;
                            defpackage.bil bilVar = this.e;
                            bilVar.P(fragment3, false);
                            fragment3.performAttach();
                            bilVar.K(fragment3, false);
                            break;
                        case 1:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "moveto CREATED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            android.os.Bundle bundle = fragment3.mSavedFragmentState;
                            android.os.Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            if (fragment3.mIsCreated) {
                                fragment3.mState = 1;
                                fragment3.restoreChildFragmentState();
                            } else {
                                defpackage.bil bilVar2 = this.e;
                                bilVar2.Q(fragment3, bundle2, false);
                                fragment3.performCreate(bundle2);
                                bilVar2.L(fragment3, bundle2, false);
                            }
                            break;
                        case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                            d();
                            c();
                            break;
                        case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "moveto ACTIVITY_CREATED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            android.os.Bundle bundle3 = fragment3.mSavedFragmentState;
                            android.os.Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            fragment3.performActivityCreated(bundle4);
                            this.e.J(fragment3, bundle4, false);
                            break;
                        case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                            if (fragment3.mView != null && (viewGroup3 = fragment3.mContainer) != null) {
                                defpackage.ca caVarAp4 = fragment3.getParentFragmentManager().ap();
                                caVarAp4.getClass();
                                defpackage.cq cqVarD4 = defpackage.ca.d(viewGroup3, caVarAp4);
                                int i5 = defpackage.ca.i(fragment3.mView.getVisibility());
                                if (defpackage.bt.ac(2)) {
                                    java.util.Objects.toString(fragment3);
                                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment ".concat(java.lang.String.valueOf(fragment3)));
                                }
                                cqVarD4.i(i5, 2, this);
                            }
                            fragment3.mState = 4;
                            break;
                        case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "moveto STARTED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            fragment3.performStart();
                            this.e.T(fragment3, false);
                            break;
                        case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                            fragment3.mState = 6;
                            break;
                        case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (defpackage.bt.ac(3)) {
                                java.util.Objects.toString(fragment3);
                                android.util.Log.d("FragmentManager", "moveto RESUMED: ".concat(java.lang.String.valueOf(fragment3)));
                            }
                            android.view.View focusedView = fragment3.getFocusedView();
                            if (focusedView != null) {
                                if (focusedView != fragment3.mView) {
                                    android.view.ViewParent parent = focusedView.getParent();
                                    while (true) {
                                        if (parent != null) {
                                            if (parent != fragment3.mView) {
                                                parent = parent.getParent();
                                            }
                                        }
                                    }
                                }
                                boolean zRequestFocus = focusedView.requestFocus();
                                if (defpackage.bt.ac(2)) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append("requestFocus: Restoring focused view ");
                                    sb.append(focusedView);
                                    sb.append(" ");
                                    sb.append(true != zRequestFocus ? "failed" : "succeeded");
                                    sb.append(" on Fragment ");
                                    sb.append(fragment3);
                                    sb.append(" resulting in focused view ");
                                    sb.append(fragment3.mView.findFocus());
                                    android.util.Log.v("FragmentManager", sb.toString());
                                }
                            }
                            fragment3.setFocusedView(null);
                            fragment3.performResume();
                            this.e.R(fragment3, false);
                            this.c.a(fragment3.mWho, null);
                            fragment3.mSavedFragmentState = null;
                            fragment3.mSavedViewState = null;
                            fragment3.mSavedViewRegistryState = null;
                            break;
                    }
                }
                objArr = true;
            }
        } catch (java.lang.Throwable th) {
            this.d = false;
            throw th;
        }
    }

    final void f(java.lang.ClassLoader classLoader) {
        android.support.v4.app.Fragment fragment = this.a;
        android.os.Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new android.os.Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            android.support.v4.app.Fragment fragment2 = this.a;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            android.support.v4.app.FragmentState parcelable = fragment2.mSavedFragmentState.getParcelable("state");
            if (parcelable != null) {
                fragment2.mTargetWho = parcelable.m;
                fragment2.mTargetRequestCode = parcelable.n;
                java.lang.Boolean bool = fragment2.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment2.mUserVisibleHint = bool.booleanValue();
                    fragment2.mSavedUserVisibleHint = null;
                } else {
                    fragment2.mUserVisibleHint = parcelable.o;
                }
            }
            if (fragment2.mUserVisibleHint) {
                return;
            }
            fragment2.mDeferStart = true;
        } catch (android.os.BadParcelableException e) {
            android.support.v4.app.Fragment fragment3 = this.a;
            java.util.Objects.toString(fragment3);
            throw new java.lang.IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(java.lang.String.valueOf(fragment3)), e);
        }
    }

    final void g() {
        android.support.v4.app.Fragment fragment = this.a;
        if (fragment.mView == null) {
            return;
        }
        if (defpackage.bt.ac(2)) {
            android.util.Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        fragment.mViewLifecycleOwner.b.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public by(defpackage.bil bilVar, defpackage.bz bzVar, android.support.v4.app.Fragment fragment, android.os.Bundle bundle) {
        this.e = bilVar;
        this.c = bzVar;
        this.a = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        android.support.v4.app.Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    public by(defpackage.bil bilVar, defpackage.bz bzVar, android.support.v4.app.Fragment fragment) {
        this.e = bilVar;
        this.c = bzVar;
        this.a = fragment;
    }
}
