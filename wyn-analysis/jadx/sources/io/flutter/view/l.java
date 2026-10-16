package io.flutter.view;

import Va.X7;
import a2.C1323c;
import android.R;
import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.C3558a;

/* loaded from: classes5.dex */
public final class l extends AccessibilityNodeProvider {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f37278z = 0;

    /* renamed from: a, reason: collision with root package name */
    public final kc.r f37279a;

    /* renamed from: b, reason: collision with root package name */
    public final C3558a f37280b;

    /* renamed from: c, reason: collision with root package name */
    public final AccessibilityManager f37281c;

    /* renamed from: d, reason: collision with root package name */
    public final AccessibilityViewEmbedder f37282d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.platform.j f37283e;

    /* renamed from: f, reason: collision with root package name */
    public final ContentResolver f37284f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f37285g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f37286h;

    /* renamed from: i, reason: collision with root package name */
    public h f37287i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f37288j;
    public Integer k;

    /* renamed from: l, reason: collision with root package name */
    public int f37289l;

    /* renamed from: m, reason: collision with root package name */
    public h f37290m;

    /* renamed from: n, reason: collision with root package name */
    public h f37291n;

    /* renamed from: o, reason: collision with root package name */
    public h f37292o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f37293p;

    /* renamed from: q, reason: collision with root package name */
    public int f37294q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f37295r;

    /* renamed from: s, reason: collision with root package name */
    public C1323c f37296s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f37297t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f37298u;

    /* renamed from: v, reason: collision with root package name */
    public final a f37299v;

    /* renamed from: w, reason: collision with root package name */
    public final b f37300w;

    /* renamed from: x, reason: collision with root package name */
    public final d f37301x;

    /* renamed from: y, reason: collision with root package name */
    public final c f37302y;

    public l(kc.r rVar, C3558a c3558a, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.j jVar) {
        AccessibilityViewEmbedder accessibilityViewEmbedder = new AccessibilityViewEmbedder(rVar, 65536);
        this.f37285g = new HashMap();
        this.f37286h = new HashMap();
        this.f37289l = 0;
        this.f37293p = new ArrayList();
        this.f37294q = 0;
        this.f37295r = 0;
        this.f37297t = false;
        this.f37298u = false;
        this.f37299v = new a(this);
        b bVar = new b(this);
        this.f37300w = bVar;
        c cVar = new c(this, new Handler(), 0);
        this.f37302y = cVar;
        this.f37279a = rVar;
        this.f37280b = c3558a;
        this.f37281c = accessibilityManager;
        this.f37284f = contentResolver;
        this.f37282d = accessibilityViewEmbedder;
        this.f37283e = jVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        d dVar = new d(this, accessibilityManager);
        this.f37301x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        cVar.onChange(false, null);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, cVar);
        if (Build.VERSION.SDK_INT >= 31 && rVar.getResources() != null) {
            int i5 = rVar.getResources().getConfiguration().fontWeightAdjustment;
            if (i5 == Integer.MAX_VALUE || i5 < 300) {
                this.f37289l &= -9;
            } else {
                this.f37289l |= 8;
            }
            ((FlutterJNI) c3558a.f40737b).setAccessibilityFeatures(this.f37289l);
        }
        jVar.a(this);
    }

    public final boolean a(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f37282d;
        if (!accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent) || (recordFlutterId = accessibilityViewEmbedder.getRecordFlutterId(view, accessibilityEvent)) == null) {
            return false;
        }
        int eventType = accessibilityEvent.getEventType();
        if (eventType == 8) {
            this.k = recordFlutterId;
            this.f37290m = null;
            return true;
        }
        if (eventType == 128) {
            this.f37292o = null;
            return true;
        }
        if (eventType == 32768) {
            this.f37288j = recordFlutterId;
            this.f37287i = null;
            return true;
        }
        if (eventType != 65536) {
            return true;
        }
        this.k = null;
        this.f37288j = null;
        return true;
    }

    public final f b(int i5) {
        HashMap map = this.f37286h;
        f fVar = (f) map.get(Integer.valueOf(i5));
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        fVar2.f37220c = -1;
        fVar2.f37219b = i5;
        fVar2.f37218a = 267386881 + i5;
        map.put(Integer.valueOf(i5), fVar2);
        return fVar2;
    }

    public final h c(int i5) {
        HashMap map = this.f37285g;
        h hVar = (h) map.get(Integer.valueOf(i5));
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        hVar2.f37250b = i5;
        map.put(Integer.valueOf(i5), hVar2);
        return hVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i5) {
        int i10;
        boolean z2;
        String str;
        int i11;
        int i12;
        i(true);
        AccessibilityViewEmbedder accessibilityViewEmbedder = this.f37282d;
        if (i5 >= 65536) {
            return accessibilityViewEmbedder.createAccessibilityNodeInfo(i5);
        }
        HashMap map = this.f37285g;
        View view = this.f37279a;
        if (i5 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
            if (map.containsKey(0)) {
                accessibilityNodeInfoObtain.addChild(view, 0);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                accessibilityNodeInfoObtain.setImportantForAccessibility(false);
            }
            return accessibilityNodeInfoObtain;
        }
        h hVar = (h) map.get(Integer.valueOf(i5));
        if (hVar != null) {
            int i13 = hVar.f37257i;
            io.flutter.plugin.platform.j jVar = this.f37283e;
            if (i13 == -1 || !jVar.c(i13)) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(view, i5);
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 24) {
                    accessibilityNodeInfoObtain2.setImportantForAccessibility((hVar.h(12) || (h.b(hVar) == null && hVar.f37252d == 0)) ? false : true);
                }
                accessibilityNodeInfoObtain2.setViewIdResourceName("");
                String str2 = hVar.f37262o;
                if (str2 != null) {
                    accessibilityNodeInfoObtain2.setViewIdResourceName(str2);
                }
                accessibilityNodeInfoObtain2.setPackageName(view.getContext().getPackageName());
                accessibilityNodeInfoObtain2.setClassName("android.view.View");
                accessibilityNodeInfoObtain2.setSource(view, i5);
                accessibilityNodeInfoObtain2.setFocusable(hVar.j());
                h hVar2 = this.f37290m;
                if (hVar2 != null) {
                    accessibilityNodeInfoObtain2.setFocused(hVar2.f37250b == i5);
                }
                h hVar3 = this.f37287i;
                if (hVar3 != null) {
                    accessibilityNodeInfoObtain2.setAccessibilityFocused(hVar3.f37250b == i5);
                }
                if (hVar.h(5)) {
                    accessibilityNodeInfoObtain2.setPassword(hVar.h(11));
                    if (!hVar.h(21)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.EditText");
                    }
                    accessibilityNodeInfoObtain2.setEditable(!hVar.h(21));
                    int i15 = hVar.f37255g;
                    if (i15 != -1 && (i12 = hVar.f37256h) != -1) {
                        accessibilityNodeInfoObtain2.setTextSelection(i15, i12);
                    }
                    h hVar4 = this.f37287i;
                    if (hVar4 != null && hVar4.f37250b == i5) {
                        accessibilityNodeInfoObtain2.setLiveRegion(1);
                    }
                    if (h.a(hVar, e.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                        accessibilityNodeInfoObtain2.addAction(256);
                        i10 = 0;
                        i11 = 1;
                    } else {
                        i11 = 0;
                        i10 = 0;
                    }
                    if (h.a(hVar, e.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i11 = 1;
                    }
                    if (h.a(hVar, e.MOVE_CURSOR_FORWARD_BY_WORD)) {
                        accessibilityNodeInfoObtain2.addAction(256);
                        i11 |= 2;
                    }
                    if (h.a(hVar, e.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                        accessibilityNodeInfoObtain2.addAction(512);
                        i11 |= 2;
                    }
                    accessibilityNodeInfoObtain2.setMovementGranularities(i11);
                    if (hVar.f37253e >= 0) {
                        String str3 = hVar.f37265r;
                        accessibilityNodeInfoObtain2.setMaxTextLength(((str3 == null ? i10 : str3.length()) - hVar.f37254f) + hVar.f37253e);
                    }
                } else {
                    i10 = 0;
                }
                if (h.a(hVar, e.SET_SELECTION)) {
                    accessibilityNodeInfoObtain2.addAction(131072);
                }
                if (h.a(hVar, e.COPY)) {
                    accessibilityNodeInfoObtain2.addAction(Http2.INITIAL_MAX_FRAME_SIZE);
                }
                if (h.a(hVar, e.CUT)) {
                    accessibilityNodeInfoObtain2.addAction(65536);
                }
                if (h.a(hVar, e.PASTE)) {
                    accessibilityNodeInfoObtain2.addAction(32768);
                }
                if (h.a(hVar, e.SET_TEXT)) {
                    accessibilityNodeInfoObtain2.addAction(2097152);
                }
                if (hVar.h(4)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Button");
                }
                if (hVar.h(15)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.ImageView");
                }
                if (h.a(hVar, e.DISMISS)) {
                    accessibilityNodeInfoObtain2.setDismissable(true);
                    accessibilityNodeInfoObtain2.addAction(1048576);
                }
                h hVar5 = hVar.f37238P;
                if (hVar5 != null) {
                    accessibilityNodeInfoObtain2.setParent(view, hVar5.f37250b);
                } else {
                    accessibilityNodeInfoObtain2.setParent(view);
                }
                int i16 = hVar.f37225B;
                if (i16 != -1) {
                    accessibilityNodeInfoObtain2.setTraversalAfter(view, i16);
                }
                Rect rect = hVar.f37248Z;
                h hVar6 = hVar.f37238P;
                if (hVar6 != null) {
                    Rect rect2 = hVar6.f37248Z;
                    Rect rect3 = new Rect(rect);
                    rect3.offset(-rect2.left, -rect2.top);
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect3);
                } else {
                    accessibilityNodeInfoObtain2.setBoundsInParent(rect);
                }
                Rect rect4 = new Rect(rect);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                rect4.offset(iArr[i10], iArr[1]);
                accessibilityNodeInfoObtain2.setBoundsInScreen(rect4);
                accessibilityNodeInfoObtain2.setVisibleToUser(true);
                accessibilityNodeInfoObtain2.setEnabled((!hVar.h(7) || hVar.h(8)) ? true : i10);
                if (h.a(hVar, e.TAP)) {
                    if (hVar.f37242T != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, hVar.f37242T.f37222e));
                        accessibilityNodeInfoObtain2.setClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(16);
                        accessibilityNodeInfoObtain2.setClickable(true);
                    }
                } else if (hVar.h(24)) {
                    accessibilityNodeInfoObtain2.addAction(16);
                    accessibilityNodeInfoObtain2.setClickable(true);
                }
                if (h.a(hVar, e.LONG_PRESS)) {
                    if (hVar.f37243U != null) {
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, hVar.f37243U.f37222e));
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    } else {
                        accessibilityNodeInfoObtain2.addAction(32);
                        accessibilityNodeInfoObtain2.setLongClickable(true);
                    }
                }
                e eVar = e.SCROLL_LEFT;
                boolean zA = h.a(hVar, eVar);
                e eVar2 = e.SCROLL_DOWN;
                e eVar3 = e.SCROLL_UP;
                e eVar4 = e.SCROLL_RIGHT;
                if (zA || h.a(hVar, eVar3) || h.a(hVar, eVar4) || h.a(hVar, eVar2)) {
                    accessibilityNodeInfoObtain2.setScrollable(true);
                    if (hVar.h(19)) {
                        if (h.a(hVar, eVar) || h.a(hVar, eVar4)) {
                            boolean z10 = i10;
                            if (j(hVar)) {
                                accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(z10 ? 1 : 0, hVar.f37258j, z10));
                            } else {
                                accessibilityNodeInfoObtain2.setClassName("android.widget.HorizontalScrollView");
                            }
                        } else if (j(hVar)) {
                            boolean z11 = i10;
                            accessibilityNodeInfoObtain2.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(hVar.f37258j, z11 ? 1 : 0, z11));
                        } else {
                            accessibilityNodeInfoObtain2.setClassName("android.widget.ScrollView");
                        }
                    }
                    if (h.a(hVar, eVar) || h.a(hVar, eVar3)) {
                        accessibilityNodeInfoObtain2.addAction(4096);
                    }
                    if (h.a(hVar, eVar4) || h.a(hVar, eVar2)) {
                        accessibilityNodeInfoObtain2.addAction(Segment.SIZE);
                    }
                }
                e eVar5 = e.INCREASE;
                boolean zA2 = h.a(hVar, eVar5);
                e eVar6 = e.DECREASE;
                if (zA2 || h.a(hVar, eVar6)) {
                    accessibilityNodeInfoObtain2.setClassName("android.widget.SeekBar");
                    if (h.a(hVar, eVar5)) {
                        accessibilityNodeInfoObtain2.addAction(4096);
                    }
                    if (h.a(hVar, eVar6)) {
                        accessibilityNodeInfoObtain2.addAction(Segment.SIZE);
                    }
                }
                if (hVar.h(16)) {
                    accessibilityNodeInfoObtain2.setLiveRegion(1);
                }
                if (hVar.h(5)) {
                    accessibilityNodeInfoObtain2.setText(h.d(hVar.f37265r, hVar.f37266s));
                    if (i14 >= 28) {
                        CharSequence[] charSequenceArr = {hVar.e(), h.d(hVar.f37271x, hVar.f37272y)};
                        int i17 = 0;
                        CharSequence charSequence = null;
                        for (int i18 = 2; i17 < i18; i18 = 2) {
                            CharSequence charSequenceConcat = charSequenceArr[i17];
                            if (charSequenceConcat != null && charSequenceConcat.length() > 0) {
                                if (charSequence != null && charSequence.length() != 0) {
                                    charSequenceConcat = TextUtils.concat(charSequence, ", ", charSequenceConcat);
                                }
                                charSequence = charSequenceConcat;
                            }
                            i17++;
                        }
                        z2 = false;
                        accessibilityNodeInfoObtain2.setHintText(charSequence);
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    if (!hVar.h(12)) {
                        CharSequence charSequenceB = h.b(hVar);
                        if (i14 < 28 && hVar.f37273z != null) {
                            charSequenceB = ((Object) (charSequenceB != null ? charSequenceB : "")) + "\n" + hVar.f37273z;
                        }
                        if (charSequenceB != null) {
                            accessibilityNodeInfoObtain2.setContentDescription(charSequenceB);
                        }
                    }
                }
                int i19 = Build.VERSION.SDK_INT;
                if (i19 >= 28 && (str = hVar.f37273z) != null) {
                    accessibilityNodeInfoObtain2.setTooltipText(str);
                }
                boolean z12 = true;
                boolean zH = hVar.h(1);
                boolean zH2 = hVar.h(17);
                if (!zH && !zH2) {
                    z12 = z2;
                }
                accessibilityNodeInfoObtain2.setCheckable(z12);
                if (zH) {
                    accessibilityNodeInfoObtain2.setChecked(hVar.h(2));
                    if (hVar.h(9)) {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.RadioButton");
                    } else {
                        accessibilityNodeInfoObtain2.setClassName("android.widget.CheckBox");
                    }
                } else if (zH2) {
                    accessibilityNodeInfoObtain2.setChecked(hVar.h(18));
                    accessibilityNodeInfoObtain2.setClassName("android.widget.Switch");
                }
                accessibilityNodeInfoObtain2.setSelected(hVar.h(3));
                if (i19 >= 28) {
                    accessibilityNodeInfoObtain2.setHeading(hVar.h(10));
                }
                h hVar7 = this.f37287i;
                if (hVar7 == null || hVar7.f37250b != i5) {
                    accessibilityNodeInfoObtain2.addAction(64);
                } else {
                    accessibilityNodeInfoObtain2.addAction(128);
                }
                ArrayList arrayList = hVar.f37241S;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        f fVar = (f) it.next();
                        accessibilityNodeInfoObtain2.addAction(new AccessibilityNodeInfo.AccessibilityAction(fVar.f37218a, fVar.f37221d));
                    }
                }
                Iterator it2 = hVar.f37239Q.iterator();
                while (it2.hasNext()) {
                    h hVar8 = (h) it2.next();
                    if (!hVar8.h(14)) {
                        int i20 = hVar8.f37257i;
                        if (i20 != -1) {
                            View viewB = jVar.b(i20);
                            if (!jVar.c(hVar8.f37257i)) {
                                accessibilityNodeInfoObtain2.addChild(viewB);
                            }
                        }
                        accessibilityNodeInfoObtain2.addChild(view, hVar8.f37250b);
                    }
                }
                return accessibilityNodeInfoObtain2;
            }
            View viewB2 = jVar.b(hVar.f37257i);
            if (viewB2 != null) {
                return accessibilityViewEmbedder.getRootNode(viewB2, hVar.f37250b, hVar.f37248Z);
            }
        }
        return null;
    }

    public final AccessibilityEvent d(int i5, int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        kc.r rVar = this.f37279a;
        accessibilityEventObtain.setPackageName(rVar.getContext().getPackageName());
        accessibilityEventObtain.setSource(rVar, i5);
        return accessibilityEventObtain;
    }

    public final boolean e(MotionEvent motionEvent, boolean z2) {
        h hVarI;
        if (this.f37281c.isTouchExplorationEnabled()) {
            HashMap map = this.f37285g;
            if (!map.isEmpty()) {
                h hVarI2 = ((h) map.get(0)).i(new float[]{motionEvent.getX(), motionEvent.getY(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, z2);
                if (hVarI2 == null || hVarI2.f37257i == -1) {
                    if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                        float x5 = motionEvent.getX();
                        float y10 = motionEvent.getY();
                        if (!map.isEmpty() && (hVarI = ((h) map.get(0)).i(new float[]{x5, y10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f}, z2)) != this.f37292o) {
                            if (hVarI != null) {
                                g(hVarI.f37250b, 128);
                            }
                            h hVar = this.f37292o;
                            if (hVar != null) {
                                g(hVar.f37250b, 256);
                            }
                            this.f37292o = hVarI;
                        }
                    } else {
                        if (motionEvent.getAction() != 10) {
                            motionEvent.toString();
                            return false;
                        }
                        h hVar2 = this.f37292o;
                        if (hVar2 != null) {
                            g(hVar2.f37250b, 256);
                            this.f37292o = null;
                        }
                    }
                    return true;
                }
                if (!z2) {
                    return this.f37282d.onAccessibilityHoverEvent(hVarI2.f37250b, motionEvent);
                }
            }
        }
        return false;
    }

    public final boolean f(h hVar, int i5, Bundle bundle, boolean z2) {
        int i10;
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z10 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i12 = hVar.f37255g;
        int i13 = hVar.f37256h;
        if (i13 >= 0 && i12 >= 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8 || i11 == 16) {
                            if (z2) {
                                hVar.f37256h = hVar.f37265r.length();
                            } else {
                                hVar.f37256h = 0;
                            }
                        }
                    } else if (z2 && i13 < hVar.f37265r.length()) {
                        Matcher matcher = Pattern.compile("(?!^)(\\n)").matcher(hVar.f37265r.substring(hVar.f37256h));
                        if (matcher.find()) {
                            hVar.f37256h += matcher.start(1);
                        } else {
                            hVar.f37256h = hVar.f37265r.length();
                        }
                    } else if (!z2 && hVar.f37256h > 0) {
                        Matcher matcher2 = Pattern.compile("(?s:.*)(\\n)").matcher(hVar.f37265r.substring(0, hVar.f37256h));
                        if (matcher2.find()) {
                            hVar.f37256h = matcher2.start(1);
                        } else {
                            hVar.f37256h = 0;
                        }
                    }
                } else if (z2 && i13 < hVar.f37265r.length()) {
                    Matcher matcher3 = Pattern.compile("\\p{L}(\\b)").matcher(hVar.f37265r.substring(hVar.f37256h));
                    matcher3.find();
                    if (matcher3.find()) {
                        hVar.f37256h += matcher3.start(1);
                    } else {
                        hVar.f37256h = hVar.f37265r.length();
                    }
                } else if (!z2 && hVar.f37256h > 0) {
                    Matcher matcher4 = Pattern.compile("(?s:.*)(\\b)\\p{L}").matcher(hVar.f37265r.substring(0, hVar.f37256h));
                    if (matcher4.find()) {
                        hVar.f37256h = matcher4.start(1);
                    }
                }
            } else if (z2 && i13 < hVar.f37265r.length()) {
                hVar.f37256h++;
            } else if (!z2 && (i10 = hVar.f37256h) > 0) {
                hVar.f37256h = i10 - 1;
            }
            if (!z10) {
                hVar.f37255g = hVar.f37256h;
            }
        }
        if (i12 != hVar.f37255g || i13 != hVar.f37256h) {
            String str = hVar.f37265r;
            if (str == null) {
                str = "";
            }
            AccessibilityEvent accessibilityEventD = d(hVar.f37250b, Segment.SIZE);
            accessibilityEventD.getText().add(str);
            accessibilityEventD.setFromIndex(hVar.f37255g);
            accessibilityEventD.setToIndex(hVar.f37256h);
            accessibilityEventD.setItemCount(str.length());
            h(accessibilityEventD);
        }
        C3558a c3558a = this.f37280b;
        if (i11 == 1) {
            if (z2) {
                e eVar = e.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (h.a(hVar, eVar)) {
                    c3558a.q(i5, eVar, Boolean.valueOf(z10));
                    return true;
                }
            }
            if (!z2) {
                e eVar2 = e.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
                if (h.a(hVar, eVar2)) {
                    c3558a.q(i5, eVar2, Boolean.valueOf(z10));
                    return true;
                }
            }
        } else if (i11 == 2) {
            if (z2) {
                e eVar3 = e.MOVE_CURSOR_FORWARD_BY_WORD;
                if (h.a(hVar, eVar3)) {
                    c3558a.q(i5, eVar3, Boolean.valueOf(z10));
                    return true;
                }
            }
            if (!z2) {
                e eVar4 = e.MOVE_CURSOR_BACKWARD_BY_WORD;
                if (h.a(hVar, eVar4)) {
                    c3558a.q(i5, eVar4, Boolean.valueOf(z10));
                    return true;
                }
            }
        } else if (i11 == 4 || i11 == 8 || i11 == 16) {
            return true;
        }
        return false;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i5) {
        if (i5 == 1) {
            h hVar = this.f37290m;
            if (hVar != null) {
                return createAccessibilityNodeInfo(hVar.f37250b);
            }
            Integer num = this.k;
            if (num != null) {
                return createAccessibilityNodeInfo(num.intValue());
            }
        } else if (i5 != 2) {
            return null;
        }
        h hVar2 = this.f37287i;
        if (hVar2 != null) {
            return createAccessibilityNodeInfo(hVar2.f37250b);
        }
        Integer num2 = this.f37288j;
        if (num2 != null) {
            return createAccessibilityNodeInfo(num2.intValue());
        }
        return null;
    }

    public final void g(int i5, int i10) {
        if (this.f37281c.isEnabled()) {
            h(d(i5, i10));
        }
    }

    public final void h(AccessibilityEvent accessibilityEvent) {
        if (this.f37281c.isEnabled()) {
            View view = this.f37279a;
            view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
        }
    }

    public final void i(boolean z2) {
        if (this.f37297t == z2) {
            return;
        }
        this.f37297t = z2;
        if (z2) {
            this.f37289l |= 1;
        } else {
            this.f37289l &= -2;
        }
        ((FlutterJNI) this.f37280b.f40737b).setAccessibilityFeatures(this.f37289l);
    }

    public final boolean j(h hVar) {
        if (hVar.f37258j <= 0) {
            return false;
        }
        h hVar2 = this.f37287i;
        h hVar3 = null;
        if (hVar2 != null) {
            h hVar4 = hVar2.f37238P;
            while (true) {
                if (hVar4 == null) {
                    hVar4 = null;
                    break;
                }
                if (hVar4 == hVar) {
                    break;
                }
                hVar4 = hVar4.f37238P;
            }
            if (hVar4 != null) {
                return true;
            }
        }
        h hVar5 = this.f37287i;
        if (hVar5 == null) {
            return true;
        }
        h hVar6 = hVar5.f37238P;
        while (true) {
            if (hVar6 == null) {
                break;
            }
            if (hVar6.h(19)) {
                hVar3 = hVar6;
                break;
            }
            hVar6 = hVar6.f37238P;
        }
        return hVar3 == null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i5, int i10, Bundle bundle) {
        if (i5 >= 65536) {
            boolean zPerformAction = this.f37282d.performAction(i5, i10, bundle);
            if (zPerformAction && i10 == 128) {
                this.f37288j = null;
            }
            return zPerformAction;
        }
        HashMap map = this.f37285g;
        h hVar = (h) map.get(Integer.valueOf(i5));
        if (hVar != null) {
            e eVar = e.INCREASE;
            e eVar2 = e.DECREASE;
            C3558a c3558a = this.f37280b;
            switch (i10) {
                case 16:
                    c3558a.p(i5, e.TAP);
                    return true;
                case 32:
                    c3558a.p(i5, e.LONG_PRESS);
                    return true;
                case 64:
                    if (this.f37287i == null) {
                        this.f37279a.invalidate();
                    }
                    this.f37287i = hVar;
                    c3558a.p(i5, e.DID_GAIN_ACCESSIBILITY_FOCUS);
                    HashMap map2 = new HashMap();
                    map2.put("type", "didGainFocus");
                    map2.put("nodeId", Integer.valueOf(hVar.f37250b));
                    ((X7) c3558a.f40736a).m(map2, null);
                    g(i5, 32768);
                    if (!h.a(hVar, eVar) && !h.a(hVar, eVar2)) {
                        return true;
                    }
                    g(i5, 4);
                    return true;
                case 128:
                    h hVar2 = this.f37287i;
                    if (hVar2 != null && hVar2.f37250b == i5) {
                        this.f37287i = null;
                    }
                    Integer num = this.f37288j;
                    if (num != null && num.intValue() == i5) {
                        this.f37288j = null;
                    }
                    c3558a.p(i5, e.DID_LOSE_ACCESSIBILITY_FOCUS);
                    g(i5, 65536);
                    return true;
                case 256:
                    return f(hVar, i5, bundle, true);
                case 512:
                    return f(hVar, i5, bundle, false);
                case 4096:
                    e eVar3 = e.SCROLL_UP;
                    if (h.a(hVar, eVar3)) {
                        c3558a.p(i5, eVar3);
                        return true;
                    }
                    e eVar4 = e.SCROLL_LEFT;
                    if (h.a(hVar, eVar4)) {
                        c3558a.p(i5, eVar4);
                        return true;
                    }
                    if (h.a(hVar, eVar)) {
                        hVar.f37265r = hVar.f37267t;
                        hVar.f37266s = hVar.f37268u;
                        g(i5, 4);
                        c3558a.p(i5, eVar);
                        return true;
                    }
                    break;
                case Segment.SIZE /* 8192 */:
                    e eVar5 = e.SCROLL_DOWN;
                    if (h.a(hVar, eVar5)) {
                        c3558a.p(i5, eVar5);
                        return true;
                    }
                    e eVar6 = e.SCROLL_RIGHT;
                    if (h.a(hVar, eVar6)) {
                        c3558a.p(i5, eVar6);
                        return true;
                    }
                    if (h.a(hVar, eVar2)) {
                        hVar.f37265r = hVar.f37269v;
                        hVar.f37266s = hVar.f37270w;
                        g(i5, 4);
                        c3558a.p(i5, eVar2);
                        return true;
                    }
                    break;
                case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                    c3558a.p(i5, e.COPY);
                    return true;
                case 32768:
                    c3558a.p(i5, e.PASTE);
                    return true;
                case 65536:
                    c3558a.p(i5, e.CUT);
                    return true;
                case 131072:
                    HashMap map3 = new HashMap();
                    if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                        map3.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                        map3.put("extent", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT")));
                    } else {
                        map3.put("base", Integer.valueOf(hVar.f37256h));
                        map3.put("extent", Integer.valueOf(hVar.f37256h));
                    }
                    c3558a.q(i5, e.SET_SELECTION, map3);
                    h hVar3 = (h) map.get(Integer.valueOf(i5));
                    hVar3.f37255g = ((Integer) map3.get("base")).intValue();
                    hVar3.f37256h = ((Integer) map3.get("extent")).intValue();
                    return true;
                case 1048576:
                    c3558a.p(i5, e.DISMISS);
                    return true;
                case 2097152:
                    String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
                    c3558a.q(i5, e.SET_TEXT, string);
                    hVar.f37265r = string;
                    hVar.f37266s = null;
                    return true;
                case R.id.accessibilityActionShowOnScreen:
                    c3558a.p(i5, e.SHOW_ON_SCREEN);
                    return true;
                default:
                    f fVar = (f) this.f37286h.get(Integer.valueOf(i10 - 267386881));
                    if (fVar != null) {
                        c3558a.q(i5, e.CUSTOM_ACTION, Integer.valueOf(fVar.f37219b));
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
