package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC1631d;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1655p extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private C1651n f22459a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f22460b;

    /* renamed from: c, reason: collision with root package name */
    private s2 f22461c;

    /* renamed from: com.applovin.impl.p$a */
    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1651n f22462e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, C1651n c1651n) {
            super(context);
            this.f22462e = c1651n;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return this.f22462e.g().size();
        }

        @Override // com.applovin.impl.s2
        public List c(int i5) {
            ArrayList arrayList = new ArrayList();
            C1653o c1653o = (C1653o) this.f22462e.g().get(i5);
            arrayList.add(AbstractActivityC1655p.this.c(c1653o.c()));
            if (c1653o.b() != null) {
                arrayList.add(AbstractActivityC1655p.this.a("AB Test Experiment Name", c1653o.b()));
            }
            l8 l8VarD = c1653o.d();
            AbstractActivityC1655p abstractActivityC1655p = AbstractActivityC1655p.this;
            arrayList.add(abstractActivityC1655p.a("Device ID Targeting", abstractActivityC1655p.a(l8VarD.a())));
            AbstractActivityC1655p abstractActivityC1655p2 = AbstractActivityC1655p.this;
            arrayList.add(abstractActivityC1655p2.a("Device Type Targeting", abstractActivityC1655p2.b(l8VarD.b())));
            if (l8VarD.c() != null) {
                arrayList.add(AbstractActivityC1655p.this.a(l8VarD.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        public int d(int i5) {
            C1653o c1653o = (C1653o) this.f22462e.g().get(i5);
            return (c1653o.b() != null ? 1 : 0) + 3 + (c1653o.d().c() != null ? 1 : 0);
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i5) {
            return i5 == b.TARGETED_WATERFALL.ordinal() ? new w4("TARGETED WATERFALL FOR CURRENT DEVICE") : i5 == b.OTHER_WATERFALLS.ordinal() ? new w4("OTHER WATERFALLS") : new w4("");
        }
    }

    /* renamed from: com.applovin.impl.p$b */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f22460b;
    }

    public void initialize(C1651n c1651n, com.applovin.impl.sdk.k kVar) {
        this.f22459a = c1651n;
        this.f22460b = kVar;
        a aVar = new a(this, c1651n);
        this.f22461c = aVar;
        aVar.a(new A5.g(this, kVar, c1651n, 12));
        this.f22461c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.f22459a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.f22461c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.f22461c;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals("phone")) {
            return "Phones";
        }
        if (str.equals("tablet")) {
            return "Tablets";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 c(String str) {
        return r2.a(r2.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final C1651n c1651n, final j2 j2Var, r2 r2Var) {
        if (j2Var.a() == 0) {
            final int i5 = 0;
            AbstractC1631d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new AbstractC1631d.b() { // from class: com.applovin.impl.E0
                @Override // com.applovin.impl.AbstractC1631d.b
                public final void a(Activity activity) {
                    switch (i5) {
                        case 0:
                            j2 j2Var2 = j2Var;
                            AbstractActivityC1655p.a(c1651n, j2Var2, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            j2 j2Var3 = j2Var;
                            AbstractActivityC1655p.a(c1651n, j2Var3, kVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        } else {
            final int i10 = 1;
            AbstractC1631d.a(this, MaxDebuggerWaterfallSegmentsActivity.class, kVar.e(), new AbstractC1631d.b() { // from class: com.applovin.impl.E0
                @Override // com.applovin.impl.AbstractC1631d.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            j2 j2Var2 = j2Var;
                            AbstractActivityC1655p.a(c1651n, j2Var2, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            break;
                        default:
                            j2 j2Var3 = j2Var;
                            AbstractActivityC1655p.a(c1651n, j2Var3, kVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C1651n c1651n, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c1651n, (C1653o) c1651n.g().get(j2Var.b()), null, kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(C1651n c1651n, j2 j2Var, com.applovin.impl.sdk.k kVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        C1653o c1653o = (C1653o) c1651n.g().get(j2Var.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(c1653o.c(), c1653o.d().c(), kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(String str, String str2) {
        return r2.a(r2.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(List list) {
        return r2.a(r2.c.DETAIL).d("Segment Targeting").a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }
}
