package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentContainerView;
import android.support.v4.app.FragmentState;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class by {
    public final Fragment a;
    private final bz c;
    private final bii e;
    private boolean d = false;
    public int b = -1;

    public by(bii biiVar, bz bzVar, ClassLoader classLoader, bf bfVar, Bundle bundle) {
        this.e = biiVar;
        this.c = bzVar;
        Fragment fragmentA = ((FragmentState) bundle.getParcelable("state")).a(bfVar, classLoader);
        this.a = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (bt.ac(2)) {
            Objects.toString(fragmentA);
            Log.v("FragmentManager", "Instantiated fragment ".concat(String.valueOf(fragmentA)));
        }
    }

    public final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.a;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.e.S(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleC = fragment.mChildFragmentManager.c();
            if (!bundleC.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleC);
            }
            if (fragment.mView != null) {
                g();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    final void b() {
        View view;
        View view2;
        Fragment fragment = this.a;
        Fragment fragmentG = bt.g(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (fragmentG != null && !fragmentG.equals(parentFragment)) {
            int i = fragment.mContainerId;
            int i2 = enj.a;
            fragment.getClass();
            env envVar = new env(fragment, fragmentG, i);
            enj.d(envVar);
            eni eniVarB = enj.b(fragment);
            if (eniVarB.b.contains(enh.e) && enj.e(eniVarB, fragment.getClass(), envVar.getClass())) {
                enj.c(eniVarB, envVar);
            }
        }
        bz bzVar = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = bzVar.a;
            int iIndexOf = arrayList.indexOf(fragment);
            int i3 = iIndexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(iIndexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i3);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    final void c() throws Resources.NotFoundException {
        String resourceName;
        Fragment fragment = this.a;
        if (fragment.mFromLayout) {
            return;
        }
        if (bt.ac(3)) {
            Objects.toString(fragment);
            Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(fragment)));
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(a.bm(fragment, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.n.a(i);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        Fragment fragment2 = this.a;
                        sb.append(Integer.toHexString(fragment2.mContainerId));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(fragment2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    Fragment fragment3 = this.a;
                    int i2 = enj.a;
                    fragment3.getClass();
                    enu enuVar = new enu(fragment3, viewGroup);
                    enj.d(enuVar);
                    eni eniVarB = enj.b(fragment3);
                    if (eniVarB.b.contains(enh.i) && enj.e(eniVarB, fragment3.getClass(), enuVar.getClass())) {
                        enj.c(eniVarB, enuVar);
                    }
                }
            }
        }
        Fragment fragment4 = this.a;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment4.mView != null) {
            if (bt.ac(3)) {
                Objects.toString(fragment4);
                Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(String.valueOf(fragment4)));
            }
            fragment4.mView.setSaveFromParentEnabled(false);
            fragment4.mView.setTag(R.id.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                b();
            }
            if (fragment4.mHidden) {
                fragment4.mView.setVisibility(8);
            }
            if (fragment4.mView.isAttachedToWindow()) {
                View view = fragment4.mView;
                int[] iArr = ebm.a;
                view.requestApplyInsets();
            } else {
                View view2 = fragment4.mView;
                view2.addOnAttachStateChangeListener(new cjh(view2, 1));
            }
            fragment4.performViewCreated();
            this.e.V(fragment4, fragment4.mView, bundle2, false);
            int visibility = fragment4.mView.getVisibility();
            fragment4.setPostOnViewCreatedAlpha(fragment4.mView.getAlpha());
            if (fragment4.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment4.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment4.setFocusedView(viewFindFocus);
                    if (bt.ac(2)) {
                        Log.v("FragmentManager", a.bt(fragment4, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
                    }
                }
                fragment4.mView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
        fragment4.mState = 2;
    }

    final void d() {
        Fragment fragment = this.a;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (bt.ac(3)) {
                Objects.toString(fragment);
                Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(fragment)));
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.e.V(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x0328, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0487 A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x048e A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04c4 A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04e1 A[Catch: all -> 0x0609, TryCatch #0 {all -> 0x0609, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0030, B:80:0x0120, B:88:0x0132, B:90:0x0138, B:91:0x0148, B:93:0x014e, B:101:0x0162, B:103:0x016c, B:106:0x0185, B:96:0x0153, B:98:0x0159, B:100:0x015d, B:107:0x01a5, B:108:0x01bf, B:109:0x01c3, B:111:0x01c9, B:112:0x01d9, B:113:0x01e3, B:115:0x01e7, B:117:0x01eb, B:119:0x020a, B:120:0x021a, B:121:0x021d, B:122:0x0221, B:124:0x0227, B:125:0x0237, B:127:0x023b, B:128:0x023f, B:129:0x0249, B:130:0x0251, B:132:0x0257, B:133:0x0267, B:135:0x026b, B:136:0x026f, B:138:0x0273, B:139:0x0280, B:140:0x0287, B:142:0x028d, B:143:0x029d, B:146:0x02a7, B:148:0x02b1, B:159:0x030a, B:160:0x030d, B:149:0x02bb, B:150:0x02da, B:151:0x02db, B:153:0x02df, B:156:0x02e8, B:157:0x0307, B:161:0x0323, B:162:0x0325, B:164:0x032b, B:166:0x0331, B:167:0x0341, B:168:0x034a, B:169:0x034d, B:171:0x0353, B:172:0x0363, B:173:0x036c, B:175:0x0372, B:176:0x0386, B:178:0x038a, B:184:0x03a1, B:186:0x03a5, B:188:0x03a9, B:190:0x03be, B:191:0x03ce, B:192:0x03d1, B:179:0x0396, B:181:0x039a, B:183:0x039e, B:193:0x03d5, B:194:0x03db, B:196:0x03e1, B:197:0x03f1, B:199:0x03f5, B:201:0x03f9, B:202:0x03fc, B:203:0x0415, B:205:0x0419, B:207:0x0427, B:208:0x0430, B:210:0x0436, B:211:0x0446, B:213:0x044a, B:218:0x0455, B:220:0x0459, B:222:0x0462, B:225:0x046d, B:227:0x0471, B:229:0x0477, B:231:0x047b, B:232:0x047d, B:233:0x0481, B:235:0x0487, B:241:0x049f, B:244:0x04a5, B:245:0x04ac, B:246:0x04be, B:248:0x04c4, B:250:0x04cc, B:252:0x04d8, B:253:0x04dd, B:255:0x04e1, B:256:0x04e7, B:236:0x048e, B:238:0x0494, B:257:0x04ec, B:259:0x04f2, B:260:0x0502, B:262:0x051b, B:268:0x052e, B:270:0x0534, B:271:0x0542, B:265:0x0522, B:274:0x054b, B:276:0x054f, B:278:0x0555, B:280:0x0559, B:282:0x055f, B:283:0x0573, B:285:0x0583, B:286:0x0595, B:287:0x0598, B:289:0x059c, B:291:0x05a0, B:293:0x05a4, B:295:0x05b7, B:297:0x05bd, B:298:0x05cd, B:299:0x05d1, B:301:0x05d7, B:302:0x05e7, B:303:0x05ea, B:305:0x05ee, B:307:0x05f2, B:309:0x05f8, B:310:0x05fa, B:13:0x0034, B:18:0x0044, B:22:0x0057, B:24:0x005b, B:27:0x0061, B:29:0x0069, B:31:0x006f, B:33:0x0076, B:34:0x007d, B:35:0x0081, B:37:0x0085, B:39:0x0089, B:40:0x008d, B:42:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x00b1, B:49:0x00b5, B:51:0x00bb, B:54:0x00c1, B:60:0x00cb, B:69:0x00ea, B:71:0x00ee, B:73:0x00f2, B:74:0x00f6, B:76:0x00fa, B:77:0x00fe, B:79:0x0104, B:62:0x00d2, B:63:0x00d7, B:65:0x00db, B:67:0x00e1, B:68:0x00e6, B:19:0x0049, B:20:0x004e, B:21:0x0053), top: B:316:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 1590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by.e():void");
    }

    final void f(ClassLoader classLoader) {
        Fragment fragment = this.a;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.a;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) fragment2.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                fragment2.mTargetWho = fragmentState.m;
                fragment2.mTargetRequestCode = fragmentState.n;
                Boolean bool = fragment2.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment2.mUserVisibleHint = bool.booleanValue();
                    fragment2.mSavedUserVisibleHint = null;
                } else {
                    fragment2.mUserVisibleHint = fragmentState.o;
                }
            }
            if (fragment2.mUserVisibleHint) {
                return;
            }
            fragment2.mDeferStart = true;
        } catch (BadParcelableException e) {
            Fragment fragment3 = this.a;
            Objects.toString(fragment3);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(fragment3)), e);
        }
    }

    final void g() {
        Fragment fragment = this.a;
        if (fragment.mView == null) {
            return;
        }
        if (bt.ac(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.b.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public by(bii biiVar, bz bzVar, Fragment fragment, Bundle bundle) {
        this.e = biiVar;
        this.c = bzVar;
        this.a = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    public by(bii biiVar, bz bzVar, Fragment fragment) {
        this.e = biiVar;
        this.c = bzVar;
        this.a = fragment;
    }
}
