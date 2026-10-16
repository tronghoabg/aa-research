package android.support.v4.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.EnvironmentCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import com.waze.R;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class cd {

    /* renamed from: a, reason: collision with root package name */
    private final ce f236a;

    /* renamed from: b, reason: collision with root package name */
    private final ar f237b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f238c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f239d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final aw f240e;

    cd(aw awVar, ce ceVar, ClassLoader classLoader, az azVar, Bundle bundle) {
        this.f240e = awVar;
        this.f236a = ceVar;
        ar arVarA = ((cb) bundle.getParcelable("state")).a(azVar, classLoader);
        this.f237b = arVarA;
        arVarA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        arVarA.setArguments(bundle2);
        if (bv.aM(2)) {
            Objects.toString(arVarA);
            Log.v("FragmentManager", "Instantiated fragment ".concat(String.valueOf(arVarA)));
        }
    }

    final Bundle a() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        ar arVar = this.f237b;
        if (arVar.mState == -1 && (bundle = arVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new cb(arVar));
        if (arVar.mState > 0) {
            Bundle bundle3 = new Bundle();
            arVar.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f240e.j(arVar, bundle3);
            Bundle bundle4 = new Bundle();
            arVar.mSavedStateRegistryController.performSave(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleC = arVar.mChildFragmentManager.c();
            if (!bundleC.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleC);
            }
            if (arVar.mView != null) {
                i();
            }
            SparseArray<Parcelable> sparseArray = arVar.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = arVar.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = arVar.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    final aq b() {
        if (this.f237b.mState >= 0) {
            return new aq(a());
        }
        return null;
    }

    final ar c() {
        return this.f237b;
    }

    final void d() {
        ar arVar = this.f237b;
        ar arVarJ = bv.j(arVar.mContainer);
        ar parentFragment = arVar.getParentFragment();
        if (arVarJ != null && !arVarJ.equals(parentFragment)) {
            FragmentStrictMode.onWrongNestedHierarchy(arVar, arVarJ, arVar.mContainerId);
        }
        arVar.mContainer.addView(arVar.mView, this.f236a.a(arVar));
    }

    final void e() throws Resources.NotFoundException {
        String resourceName;
        ar arVar = this.f237b;
        if (arVar.mFromLayout) {
            return;
        }
        if (bv.aM(3)) {
            Objects.toString(arVar);
            Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(arVar)));
        }
        Bundle bundle = arVar.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = arVar.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = arVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = arVar.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException(k.e(arVar, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) arVar.mFragmentManager.n().a(arVar.mContainerId);
                if (viewGroup == null) {
                    if (!arVar.mRestored && !arVar.mInDynamicContainer) {
                        try {
                            resourceName = arVar.getResources().getResourceName(arVar.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = EnvironmentCompat.MEDIA_UNKNOWN;
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        ar arVar2 = this.f237b;
                        sb.append(Integer.toHexString(arVar2.mContainerId));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(arVar2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode.onWrongFragmentContainer(this.f237b, viewGroup);
                }
            }
        }
        ar arVar3 = this.f237b;
        arVar3.mContainer = viewGroup;
        arVar3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (arVar3.mView != null) {
            if (bv.aM(3)) {
                Objects.toString(arVar3);
                Log.d("FragmentManager", "moveto VIEW_CREATED: ".concat(String.valueOf(arVar3)));
            }
            arVar3.mView.setSaveFromParentEnabled(false);
            arVar3.mView.setTag(R.id.fragment_container_view_tag, arVar3);
            if (viewGroup != null) {
                d();
            }
            if (arVar3.mHidden) {
                arVar3.mView.setVisibility(8);
            }
            if (arVar3.mView.isAttachedToWindow()) {
                ViewCompat.requestApplyInsets(arVar3.mView);
            } else {
                View view = arVar3.mView;
                view.addOnAttachStateChangeListener(new cc(view));
            }
            arVar3.performViewCreated();
            this.f240e.m(arVar3, arVar3.mView, bundle2);
            int visibility = arVar3.mView.getVisibility();
            arVar3.setPostOnViewCreatedAlpha(arVar3.mView.getAlpha());
            if (arVar3.mContainer != null && visibility == 0) {
                View viewFindFocus = arVar3.mView.findFocus();
                if (viewFindFocus != null) {
                    arVar3.setFocusedView(viewFindFocus);
                    if (bv.aM(2)) {
                        Log.v("FragmentManager", k.f(arVar3, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
                    }
                }
                arVar3.mView.setAlpha(0.0f);
            }
        }
        arVar3.mState = 2;
    }

    final void f() {
        ar arVar = this.f237b;
        if (arVar.mFromLayout && arVar.mInLayout && !arVar.mPerformedCreateView) {
            if (bv.aM(3)) {
                Objects.toString(arVar);
                Log.d("FragmentManager", "moveto CREATE_VIEW: ".concat(String.valueOf(arVar)));
            }
            Bundle bundle = arVar.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            arVar.performCreateView(arVar.performGetLayoutInflater(bundle2), null, bundle2);
            View view = arVar.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                arVar.mView.setTag(R.id.fragment_container_view_tag, arVar);
                if (arVar.mHidden) {
                    arVar.mView.setVisibility(8);
                }
                arVar.performViewCreated();
                this.f240e.m(arVar, arVar.mView, bundle2);
                arVar.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:313:0x02f7, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0437 A[Catch: all -> 0x058d, TryCatch #0 {all -> 0x058d, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0031, B:70:0x0105, B:77:0x0116, B:79:0x011c, B:80:0x012c, B:82:0x0132, B:90:0x0146, B:92:0x0150, B:95:0x0169, B:85:0x0137, B:87:0x013d, B:89:0x0141, B:96:0x0189, B:97:0x01a3, B:98:0x01a7, B:100:0x01ad, B:101:0x01bd, B:102:0x01c7, B:104:0x01cb, B:106:0x01cf, B:107:0x01e6, B:108:0x01ea, B:110:0x01f0, B:111:0x0200, B:113:0x0204, B:114:0x0208, B:115:0x0212, B:116:0x021a, B:118:0x0220, B:119:0x0230, B:121:0x0234, B:122:0x0238, B:124:0x023c, B:125:0x0249, B:126:0x0250, B:128:0x0256, B:129:0x0266, B:132:0x0270, B:134:0x027a, B:145:0x02d3, B:146:0x02d6, B:135:0x0284, B:136:0x02a3, B:137:0x02a4, B:139:0x02a8, B:142:0x02b1, B:143:0x02d0, B:147:0x02f2, B:148:0x02f4, B:150:0x02fa, B:152:0x0300, B:153:0x0310, B:154:0x0319, B:155:0x031c, B:157:0x0322, B:158:0x0332, B:159:0x033b, B:161:0x0341, B:162:0x0355, B:164:0x0359, B:170:0x0370, B:172:0x0374, B:174:0x0378, B:175:0x0383, B:165:0x0365, B:167:0x0369, B:169:0x036d, B:176:0x0387, B:177:0x038d, B:179:0x0393, B:180:0x03a3, B:182:0x03a7, B:184:0x03ab, B:185:0x03ae, B:186:0x03c7, B:188:0x03cb, B:190:0x03d5, B:191:0x03de, B:193:0x03e4, B:194:0x03f4, B:196:0x03f8, B:201:0x0403, B:203:0x0407, B:205:0x0410, B:208:0x041d, B:210:0x0421, B:212:0x0427, B:214:0x042b, B:215:0x042d, B:216:0x0431, B:218:0x0437, B:224:0x0459, B:227:0x045f, B:228:0x0468, B:229:0x047a, B:231:0x0480, B:233:0x0488, B:235:0x0494, B:236:0x0499, B:238:0x049d, B:239:0x04a3, B:219:0x0442, B:221:0x044a, B:240:0x04a8, B:242:0x04ae, B:243:0x04be, B:245:0x04d7, B:251:0x04ec, B:253:0x04f2, B:254:0x0500, B:248:0x04de, B:257:0x0509, B:259:0x050d, B:261:0x0513, B:263:0x0517, B:265:0x051d, B:266:0x0531, B:268:0x0543, B:269:0x0555, B:270:0x0558, B:272:0x055c, B:274:0x0560, B:276:0x0564, B:278:0x0570, B:279:0x0574, B:280:0x0577, B:282:0x057b, B:283:0x057e, B:13:0x0035, B:18:0x0047, B:22:0x005a, B:24:0x005e, B:27:0x0064, B:29:0x006c, B:31:0x0072, B:33:0x0079, B:34:0x0080, B:35:0x0084, B:37:0x0088, B:39:0x008c, B:40:0x0090, B:42:0x0094, B:43:0x0098, B:45:0x009c, B:47:0x00aa, B:49:0x00ae, B:59:0x00cf, B:61:0x00d3, B:63:0x00d7, B:64:0x00db, B:66:0x00df, B:67:0x00e3, B:69:0x00e9, B:50:0x00b3, B:52:0x00b7, B:53:0x00bc, B:55:0x00c0, B:57:0x00c6, B:58:0x00cb, B:19:0x004c, B:20:0x0051, B:21:0x0056), top: B:289:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0442 A[Catch: all -> 0x058d, TryCatch #0 {all -> 0x058d, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0031, B:70:0x0105, B:77:0x0116, B:79:0x011c, B:80:0x012c, B:82:0x0132, B:90:0x0146, B:92:0x0150, B:95:0x0169, B:85:0x0137, B:87:0x013d, B:89:0x0141, B:96:0x0189, B:97:0x01a3, B:98:0x01a7, B:100:0x01ad, B:101:0x01bd, B:102:0x01c7, B:104:0x01cb, B:106:0x01cf, B:107:0x01e6, B:108:0x01ea, B:110:0x01f0, B:111:0x0200, B:113:0x0204, B:114:0x0208, B:115:0x0212, B:116:0x021a, B:118:0x0220, B:119:0x0230, B:121:0x0234, B:122:0x0238, B:124:0x023c, B:125:0x0249, B:126:0x0250, B:128:0x0256, B:129:0x0266, B:132:0x0270, B:134:0x027a, B:145:0x02d3, B:146:0x02d6, B:135:0x0284, B:136:0x02a3, B:137:0x02a4, B:139:0x02a8, B:142:0x02b1, B:143:0x02d0, B:147:0x02f2, B:148:0x02f4, B:150:0x02fa, B:152:0x0300, B:153:0x0310, B:154:0x0319, B:155:0x031c, B:157:0x0322, B:158:0x0332, B:159:0x033b, B:161:0x0341, B:162:0x0355, B:164:0x0359, B:170:0x0370, B:172:0x0374, B:174:0x0378, B:175:0x0383, B:165:0x0365, B:167:0x0369, B:169:0x036d, B:176:0x0387, B:177:0x038d, B:179:0x0393, B:180:0x03a3, B:182:0x03a7, B:184:0x03ab, B:185:0x03ae, B:186:0x03c7, B:188:0x03cb, B:190:0x03d5, B:191:0x03de, B:193:0x03e4, B:194:0x03f4, B:196:0x03f8, B:201:0x0403, B:203:0x0407, B:205:0x0410, B:208:0x041d, B:210:0x0421, B:212:0x0427, B:214:0x042b, B:215:0x042d, B:216:0x0431, B:218:0x0437, B:224:0x0459, B:227:0x045f, B:228:0x0468, B:229:0x047a, B:231:0x0480, B:233:0x0488, B:235:0x0494, B:236:0x0499, B:238:0x049d, B:239:0x04a3, B:219:0x0442, B:221:0x044a, B:240:0x04a8, B:242:0x04ae, B:243:0x04be, B:245:0x04d7, B:251:0x04ec, B:253:0x04f2, B:254:0x0500, B:248:0x04de, B:257:0x0509, B:259:0x050d, B:261:0x0513, B:263:0x0517, B:265:0x051d, B:266:0x0531, B:268:0x0543, B:269:0x0555, B:270:0x0558, B:272:0x055c, B:274:0x0560, B:276:0x0564, B:278:0x0570, B:279:0x0574, B:280:0x0577, B:282:0x057b, B:283:0x057e, B:13:0x0035, B:18:0x0047, B:22:0x005a, B:24:0x005e, B:27:0x0064, B:29:0x006c, B:31:0x0072, B:33:0x0079, B:34:0x0080, B:35:0x0084, B:37:0x0088, B:39:0x008c, B:40:0x0090, B:42:0x0094, B:43:0x0098, B:45:0x009c, B:47:0x00aa, B:49:0x00ae, B:59:0x00cf, B:61:0x00d3, B:63:0x00d7, B:64:0x00db, B:66:0x00df, B:67:0x00e3, B:69:0x00e9, B:50:0x00b3, B:52:0x00b7, B:53:0x00bc, B:55:0x00c0, B:57:0x00c6, B:58:0x00cb, B:19:0x004c, B:20:0x0051, B:21:0x0056), top: B:289:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0480 A[Catch: all -> 0x058d, TryCatch #0 {all -> 0x058d, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0031, B:70:0x0105, B:77:0x0116, B:79:0x011c, B:80:0x012c, B:82:0x0132, B:90:0x0146, B:92:0x0150, B:95:0x0169, B:85:0x0137, B:87:0x013d, B:89:0x0141, B:96:0x0189, B:97:0x01a3, B:98:0x01a7, B:100:0x01ad, B:101:0x01bd, B:102:0x01c7, B:104:0x01cb, B:106:0x01cf, B:107:0x01e6, B:108:0x01ea, B:110:0x01f0, B:111:0x0200, B:113:0x0204, B:114:0x0208, B:115:0x0212, B:116:0x021a, B:118:0x0220, B:119:0x0230, B:121:0x0234, B:122:0x0238, B:124:0x023c, B:125:0x0249, B:126:0x0250, B:128:0x0256, B:129:0x0266, B:132:0x0270, B:134:0x027a, B:145:0x02d3, B:146:0x02d6, B:135:0x0284, B:136:0x02a3, B:137:0x02a4, B:139:0x02a8, B:142:0x02b1, B:143:0x02d0, B:147:0x02f2, B:148:0x02f4, B:150:0x02fa, B:152:0x0300, B:153:0x0310, B:154:0x0319, B:155:0x031c, B:157:0x0322, B:158:0x0332, B:159:0x033b, B:161:0x0341, B:162:0x0355, B:164:0x0359, B:170:0x0370, B:172:0x0374, B:174:0x0378, B:175:0x0383, B:165:0x0365, B:167:0x0369, B:169:0x036d, B:176:0x0387, B:177:0x038d, B:179:0x0393, B:180:0x03a3, B:182:0x03a7, B:184:0x03ab, B:185:0x03ae, B:186:0x03c7, B:188:0x03cb, B:190:0x03d5, B:191:0x03de, B:193:0x03e4, B:194:0x03f4, B:196:0x03f8, B:201:0x0403, B:203:0x0407, B:205:0x0410, B:208:0x041d, B:210:0x0421, B:212:0x0427, B:214:0x042b, B:215:0x042d, B:216:0x0431, B:218:0x0437, B:224:0x0459, B:227:0x045f, B:228:0x0468, B:229:0x047a, B:231:0x0480, B:233:0x0488, B:235:0x0494, B:236:0x0499, B:238:0x049d, B:239:0x04a3, B:219:0x0442, B:221:0x044a, B:240:0x04a8, B:242:0x04ae, B:243:0x04be, B:245:0x04d7, B:251:0x04ec, B:253:0x04f2, B:254:0x0500, B:248:0x04de, B:257:0x0509, B:259:0x050d, B:261:0x0513, B:263:0x0517, B:265:0x051d, B:266:0x0531, B:268:0x0543, B:269:0x0555, B:270:0x0558, B:272:0x055c, B:274:0x0560, B:276:0x0564, B:278:0x0570, B:279:0x0574, B:280:0x0577, B:282:0x057b, B:283:0x057e, B:13:0x0035, B:18:0x0047, B:22:0x005a, B:24:0x005e, B:27:0x0064, B:29:0x006c, B:31:0x0072, B:33:0x0079, B:34:0x0080, B:35:0x0084, B:37:0x0088, B:39:0x008c, B:40:0x0090, B:42:0x0094, B:43:0x0098, B:45:0x009c, B:47:0x00aa, B:49:0x00ae, B:59:0x00cf, B:61:0x00d3, B:63:0x00d7, B:64:0x00db, B:66:0x00df, B:67:0x00e3, B:69:0x00e9, B:50:0x00b3, B:52:0x00b7, B:53:0x00bc, B:55:0x00c0, B:57:0x00c6, B:58:0x00cb, B:19:0x004c, B:20:0x0051, B:21:0x0056), top: B:289:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x049d A[Catch: all -> 0x058d, TryCatch #0 {all -> 0x058d, blocks: (B:9:0x0022, B:10:0x0025, B:12:0x0031, B:70:0x0105, B:77:0x0116, B:79:0x011c, B:80:0x012c, B:82:0x0132, B:90:0x0146, B:92:0x0150, B:95:0x0169, B:85:0x0137, B:87:0x013d, B:89:0x0141, B:96:0x0189, B:97:0x01a3, B:98:0x01a7, B:100:0x01ad, B:101:0x01bd, B:102:0x01c7, B:104:0x01cb, B:106:0x01cf, B:107:0x01e6, B:108:0x01ea, B:110:0x01f0, B:111:0x0200, B:113:0x0204, B:114:0x0208, B:115:0x0212, B:116:0x021a, B:118:0x0220, B:119:0x0230, B:121:0x0234, B:122:0x0238, B:124:0x023c, B:125:0x0249, B:126:0x0250, B:128:0x0256, B:129:0x0266, B:132:0x0270, B:134:0x027a, B:145:0x02d3, B:146:0x02d6, B:135:0x0284, B:136:0x02a3, B:137:0x02a4, B:139:0x02a8, B:142:0x02b1, B:143:0x02d0, B:147:0x02f2, B:148:0x02f4, B:150:0x02fa, B:152:0x0300, B:153:0x0310, B:154:0x0319, B:155:0x031c, B:157:0x0322, B:158:0x0332, B:159:0x033b, B:161:0x0341, B:162:0x0355, B:164:0x0359, B:170:0x0370, B:172:0x0374, B:174:0x0378, B:175:0x0383, B:165:0x0365, B:167:0x0369, B:169:0x036d, B:176:0x0387, B:177:0x038d, B:179:0x0393, B:180:0x03a3, B:182:0x03a7, B:184:0x03ab, B:185:0x03ae, B:186:0x03c7, B:188:0x03cb, B:190:0x03d5, B:191:0x03de, B:193:0x03e4, B:194:0x03f4, B:196:0x03f8, B:201:0x0403, B:203:0x0407, B:205:0x0410, B:208:0x041d, B:210:0x0421, B:212:0x0427, B:214:0x042b, B:215:0x042d, B:216:0x0431, B:218:0x0437, B:224:0x0459, B:227:0x045f, B:228:0x0468, B:229:0x047a, B:231:0x0480, B:233:0x0488, B:235:0x0494, B:236:0x0499, B:238:0x049d, B:239:0x04a3, B:219:0x0442, B:221:0x044a, B:240:0x04a8, B:242:0x04ae, B:243:0x04be, B:245:0x04d7, B:251:0x04ec, B:253:0x04f2, B:254:0x0500, B:248:0x04de, B:257:0x0509, B:259:0x050d, B:261:0x0513, B:263:0x0517, B:265:0x051d, B:266:0x0531, B:268:0x0543, B:269:0x0555, B:270:0x0558, B:272:0x055c, B:274:0x0560, B:276:0x0564, B:278:0x0570, B:279:0x0574, B:280:0x0577, B:282:0x057b, B:283:0x057e, B:13:0x0035, B:18:0x0047, B:22:0x005a, B:24:0x005e, B:27:0x0064, B:29:0x006c, B:31:0x0072, B:33:0x0079, B:34:0x0080, B:35:0x0084, B:37:0x0088, B:39:0x008c, B:40:0x0090, B:42:0x0094, B:43:0x0098, B:45:0x009c, B:47:0x00aa, B:49:0x00ae, B:59:0x00cf, B:61:0x00d3, B:63:0x00d7, B:64:0x00db, B:66:0x00df, B:67:0x00e3, B:69:0x00e9, B:50:0x00b3, B:52:0x00b7, B:53:0x00bc, B:55:0x00c0, B:57:0x00c6, B:58:0x00cb, B:19:0x004c, B:20:0x0051, B:21:0x0056), top: B:289:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void g() {
        /*
            Method dump skipped, instructions count: 1466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.cd.g():void");
    }

    final void h(ClassLoader classLoader) {
        ar arVar = this.f237b;
        Bundle bundle = arVar.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (arVar.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            arVar.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            arVar.mSavedViewState = arVar.mSavedFragmentState.getSparseParcelableArray("viewState");
            ar arVar2 = this.f237b;
            arVar2.mSavedViewRegistryState = arVar2.mSavedFragmentState.getBundle("viewRegistryState");
            cb cbVar = (cb) arVar2.mSavedFragmentState.getParcelable("state");
            if (cbVar != null) {
                arVar2.mTargetWho = cbVar.m;
                arVar2.mTargetRequestCode = cbVar.n;
                Boolean bool = arVar2.mSavedUserVisibleHint;
                if (bool != null) {
                    arVar2.mUserVisibleHint = bool.booleanValue();
                    arVar2.mSavedUserVisibleHint = null;
                } else {
                    arVar2.mUserVisibleHint = cbVar.o;
                }
            }
            if (arVar2.mUserVisibleHint) {
                return;
            }
            arVar2.mDeferStart = true;
        } catch (BadParcelableException e2) {
            ar arVar3 = this.f237b;
            Objects.toString(arVar3);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(arVar3)), e2);
        }
    }

    final void i() {
        ar arVar = this.f237b;
        if (arVar.mView == null) {
            return;
        }
        if (bv.aM(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + arVar + " with view " + arVar.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        arVar.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            arVar.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        arVar.mViewLifecycleOwner.d(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        arVar.mSavedViewRegistryState = bundle;
    }

    final void j(int i2) {
        this.f239d = i2;
    }

    cd(aw awVar, ce ceVar, ar arVar, Bundle bundle) {
        this.f240e = awVar;
        this.f236a = ceVar;
        this.f237b = arVar;
        arVar.mSavedViewState = null;
        arVar.mSavedViewRegistryState = null;
        arVar.mBackStackNesting = 0;
        arVar.mInLayout = false;
        arVar.mAdded = false;
        ar arVar2 = arVar.mTarget;
        arVar.mTargetWho = arVar2 != null ? arVar2.mWho : null;
        arVar.mTarget = null;
        arVar.mSavedFragmentState = bundle;
        arVar.mArguments = bundle.getBundle("arguments");
    }

    cd(aw awVar, ce ceVar, ar arVar) {
        this.f240e = awVar;
        this.f236a = ceVar;
        this.f237b = arVar;
    }
}
