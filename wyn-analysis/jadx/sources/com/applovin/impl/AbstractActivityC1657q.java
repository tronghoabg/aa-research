package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC1631d;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerAdUnitWaterfallsListActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1657q extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f22571a;

    /* renamed from: b, reason: collision with root package name */
    private s2 f22572b;

    /* renamed from: c, reason: collision with root package name */
    private List f22573c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22574d;

    /* renamed from: e, reason: collision with root package name */
    private ListView f22575e;

    /* renamed from: com.applovin.impl.q$a */
    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f22576e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f22576e = list;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.s2
        public List c(int i5) {
            return AbstractActivityC1657q.this.f22573c;
        }

        @Override // com.applovin.impl.s2
        public int d(int i5) {
            return this.f22576e.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i5) {
            return new w4("");
        }
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f22571a;
    }

    public void initialize(List<C1651n> list, boolean z2, com.applovin.impl.sdk.k kVar) {
        this.f22574d = z2;
        this.f22571a = kVar;
        this.f22573c = a(list);
        a aVar = new a(this, list);
        this.f22572b = aVar;
        aVar.a(new A5.g(this, list, kVar, 15));
        this.f22572b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle((this.f22574d ? "Selective Init " : "").concat("Ad Units"));
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f22575e = listView;
        listView.setAdapter((ListAdapter) this.f22572b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, final com.applovin.impl.sdk.k kVar, j2 j2Var, r2 r2Var) {
        final C1651n c1651n = (C1651n) list.get(j2Var.a());
        if (c1651n.g().size() == 1) {
            final int i5 = 0;
            AbstractC1631d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new AbstractC1631d.b() { // from class: com.applovin.impl.J0
                @Override // com.applovin.impl.AbstractC1631d.b
                public final void a(Activity activity) {
                    switch (i5) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c1651n, null, null, kVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c1651n, kVar);
                            break;
                    }
                }
            });
        } else {
            final int i10 = 1;
            AbstractC1631d.a(this, MaxDebuggerAdUnitWaterfallsListActivity.class, kVar.e(), new AbstractC1631d.b() { // from class: com.applovin.impl.J0
                @Override // com.applovin.impl.AbstractC1631d.b
                public final void a(Activity activity) {
                    switch (i10) {
                        case 0:
                            ((MaxDebuggerAdUnitDetailActivity) activity).initialize(c1651n, null, null, kVar);
                            break;
                        default:
                            ((MaxDebuggerAdUnitWaterfallsListActivity) activity).initialize(c1651n, kVar);
                            break;
                    }
                }
            });
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1651n c1651n = (C1651n) it.next();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ID\t\t\t\t\t\t", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c1651n.c(), -16777216));
            spannableStringBuilder.append((CharSequence) new SpannedString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("FORMAT  ", -7829368));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(c1651n.b(), -16777216));
            arrayList.add(r2.a(r2.c.DETAIL).b(StringUtils.createSpannedString(c1651n.d(), -16777216, 18, 1)).a(new SpannedString(spannableStringBuilder)).a(this).a(true).a());
        }
        return arrayList;
    }
}
