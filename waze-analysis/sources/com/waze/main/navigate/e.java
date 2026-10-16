package com.waze.main.navigate;

import android.content.Context;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.textfield.ao;
import com.google.firebase.messaging.l;
import com.waze.R;
import com.waze.jni.protos.navigate.NavigationItemList;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f25494a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewPager f25495b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f25496c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f25497d;

    /* renamed from: e, reason: collision with root package name */
    private final View f25498e;

    /* renamed from: f, reason: collision with root package name */
    private final View f25499f;

    /* renamed from: g, reason: collision with root package name */
    private final ListView f25500g;

    /* renamed from: h, reason: collision with root package name */
    private final i f25501h;

    /* renamed from: i, reason: collision with root package name */
    private final j f25502i;

    /* renamed from: j, reason: collision with root package name */
    private final ListView f25503j;

    /* renamed from: k, reason: collision with root package name */
    private final View f25504k;

    /* renamed from: l, reason: collision with root package name */
    private final FrameLayout f25505l;
    private com.waze.main_screen.l.b.i m;

    public e(Context context, com.waze.main_screen.l.b.b bVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        super(context);
        View viewInflate = inflate(context, R.layout.fragment_navigation_list, this);
        this.f25494a = viewInflate;
        ViewPager viewPager = (ViewPager) viewInflate.findViewById(R.id.fragNavListPager);
        this.f25495b = viewPager;
        TextView textView = (TextView) viewInflate.findViewById(R.id.fragNavListTabs1Text);
        this.f25496c = textView;
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fragNavListTabs2Text);
        this.f25497d = textView2;
        this.f25498e = viewInflate.findViewById(R.id.fragNavListTabs1Ind);
        this.f25499f = viewInflate.findViewById(R.id.fragNavListTabs2Ind);
        textView.setText(str.toUpperCase());
        textView2.setText(str2.toUpperCase());
        bVar.d();
        viewPager.addOnPageChangeListener(new b(this, bVar));
        viewInflate.findViewById(R.id.fragNavListTabs1).setOnClickListener(new c(this, 1, null));
        viewInflate.findViewById(R.id.fragNavListTabs2).setOnClickListener(new c(this, 0));
        Context context2 = getContext();
        Objects.requireNonNull(bVar);
        i iVar = new i(context2, z, str4, str5, str6, str7, new l(bVar));
        this.f25501h = iVar;
        ListView listView = new ListView(getContext());
        this.f25500g = listView;
        listView.setDividerHeight(0);
        listView.setAdapter((ListAdapter) iVar);
        Context context3 = getContext();
        Objects.requireNonNull(bVar);
        j jVar = new j(context3, new l(bVar));
        this.f25502i = jVar;
        FrameLayout frameLayout = (FrameLayout) inflate(getContext(), R.layout.navigation_list_no_reports, null);
        this.f25505l = frameLayout;
        this.f25504k = frameLayout.findViewById(R.id.navListNoReportsLayout);
        ((TextView) frameLayout.findViewById(R.id.navListNoReportsText)).setText(str3);
        ListView listView2 = (ListView) frameLayout.findViewById(R.id.navListReportsList);
        this.f25503j = listView2;
        listView2.setDividerHeight(0);
        listView2.setAdapter((ListAdapter) jVar);
        viewPager.setAdapter(new d(this));
        if (viewInflate == null) {
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation.setDuration(180L);
        translateAnimation.setStartOffset(100L);
        translateAnimation.setFillBefore(true);
        translateAnimation.setInterpolator(new DecelerateInterpolator());
        viewInflate.findViewById(R.id.fragNavListBackground).startAnimation(translateAnimation);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation2.setDuration(100L);
        translateAnimation2.setStartOffset(100L);
        translateAnimation2.setFillBefore(true);
        translateAnimation2.setInterpolator(new DecelerateInterpolator());
        viewInflate.findViewById(R.id.fragNavListTabs).startAnimation(translateAnimation2);
    }

    public static /* synthetic */ void h(e eVar) {
        ListView listView = eVar.f25500g;
        listView.setVisibility(0);
        int childCount = listView.getChildCount();
        int i2 = ((childCount - 1) * 20) + 10;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = listView.getChildAt(i3);
            int top = childAt.getTop();
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, -top, 0.0f));
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.setInterpolator(new DecelerateInterpolator());
            animationSet.setDuration(300L);
            animationSet.setStartOffset(i2);
            animationSet.setFillBefore(true);
            childAt.startAnimation(animationSet);
            i2 -= 20;
        }
    }

    public static /* synthetic */ void i(e eVar, com.waze.main_screen.l.b.i iVar) {
        ListView listView;
        com.waze.main_screen.l.b.i iVar2;
        i iVar3 = eVar.f25501h;
        List listA = iVar.a();
        if (iVar3 != null && (listView = eVar.f25500g) != null && ((eVar.m != null || !listA.isEmpty()) && ((iVar2 = eVar.m) == null || !listA.equals(iVar2.a())))) {
            List list = (List) Collection.EL.stream(listA).map(new Function() { // from class: com.waze.main.navigate.a
                public final /* synthetic */ Function andThen(Function function) {
                    return i != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return i != 0 ? ((com.waze.main_screen.l.a.f) obj).a() : ((com.waze.main_screen.l.a.a) obj).a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return i != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            NavigationItemList.Builder builderNewBuilder = NavigationItemList.newBuilder();
            builderNewBuilder.addAllNavigationItem(list);
            NavigationItemList navigationItemListBuild = builderNewBuilder.build();
            listView.setVisibility(4);
            iVar3.a(navigationItemListBuild);
            iVar3.notifyDataSetChanged();
            listView.post(new ao(eVar, 16));
        }
        List listB = iVar.b();
        com.waze.main_screen.l.b.i iVar4 = eVar.m;
        if (iVar4 == null || !listB.equals(iVar4.b())) {
            final int i2 = 1;
            List list2 = (List) Collection.EL.stream(listB).map(new Function() { // from class: com.waze.main.navigate.a
                public final /* synthetic */ Function andThen(Function function) {
                    return i2 != 0 ? Function$CC.$default$andThen(this, function) : Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return i2 != 0 ? ((com.waze.main_screen.l.a.f) obj).a() : ((com.waze.main_screen.l.a.a) obj).a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return i2 != 0 ? Function$CC.$default$compose(this, function) : Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            j jVar = eVar.f25502i;
            jVar.a(list2);
            jVar.notifyDataSetChanged();
            eVar.f25503j.invalidateViews();
            eVar.f25504k.setVisibility(true != list2.isEmpty() ? 8 : 0);
        }
        eVar.m = iVar;
    }
}
