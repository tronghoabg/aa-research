package com.waze.inbox;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.waze.R;
import com.waze.sharedui.views.CheckBoxView;
import com.waze.ui.z.as;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class j extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f24656a;

    /* renamed from: b, reason: collision with root package name */
    private final MaterialCardView f24657b;

    /* renamed from: c, reason: collision with root package name */
    private final View f24658c;

    /* renamed from: d, reason: collision with root package name */
    private final CheckBoxView f24659d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f24660e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f24661f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f24662g;

    /* renamed from: h, reason: collision with root package name */
    private n f24663h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f24664i;

    /* renamed from: j, reason: collision with root package name */
    private InboxRecycler f24665j;

    public j(Context context) {
        super(context, null, 0);
        this.f24664i = com.waze.shared_infra.o.b.a();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.inbox_item_view, (ViewGroup) null);
        CheckBoxView checkBoxView = (CheckBoxView) viewInflate.findViewById(R.id.inboxItemCheckbox);
        this.f24659d = checkBoxView;
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.inboxItemViewContainer);
        this.f24656a = viewGroup;
        MaterialCardView materialCardView = (MaterialCardView) viewInflate.findViewById(R.id.inboxItemCardRoot);
        this.f24657b = materialCardView;
        this.f24658c = viewInflate.findViewById(R.id.inboxUnreadIndicator);
        this.f24660e = (TextView) viewInflate.findViewById(R.id.inboxTitleLabel);
        this.f24661f = (TextView) viewInflate.findViewById(R.id.inboxDetailsLabel);
        this.f24662g = (TextView) viewInflate.findViewById(R.id.inboxTimeLabel);
        checkBoxView.setOnClickListener(new com.waze.design_components.c.e(this, 16));
        materialCardView.setOnClickListener(new com.waze.design_components.c.e(this, 17));
        viewGroup.setPadding(0, 0, 0, 0);
        int iH = as.h(getResources(), 8);
        setPadding(iH, 0, iH, iH);
        setClipToPadding(false);
        addView(viewInflate);
    }

    public static /* synthetic */ void e(j jVar) {
        InboxRecycler inboxRecycler = jVar.f24665j;
        if (inboxRecycler != null) {
            n nVar = jVar.f24663h;
            if (nVar.i()) {
                nVar.h();
                k.a().e(new String[]{nVar.c()});
                inboxRecycler.j().notifyDataSetChanged();
            }
            InboxPreviewActivity.m(nVar);
        }
    }

    public final n a() {
        return this.f24663h;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.waze.inbox.n r11) {
        /*
            r10 = this;
            r10.f24663h = r11
            java.lang.String r11 = r11.g()
            android.widget.TextView r0 = r10.f24660e
            r0.setText(r11)
            com.waze.inbox.n r11 = r10.f24663h
            java.lang.String r11 = r11.e()
            android.widget.TextView r0 = r10.f24661f
            r0.setText(r11)
            com.waze.inbox.n r11 = r10.f24663h
            long r0 = r11.a()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.util.Calendar r11 = java.util.Calendar.getInstance()
            r11.setTimeInMillis(r0)
            java.util.TimeZone r2 = r11.getTimeZone()
            java.lang.Class<com.waze.settings.SettingsNativeManager> r3 = com.waze.settings.SettingsNativeManager.class
            java.lang.Object r3 = com.waze.web.r.h(r3)
            com.waze.settings.SettingsNativeManager r3 = (com.waze.settings.SettingsNativeManager) r3
            java.util.Locale r4 = new java.util.Locale
            java.lang.String r3 = r3.getLanguagesLocale()
            r4.<init>(r3)
            boolean r3 = android.text.format.DateUtils.isToday(r0)
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L5d
            com.waze.NativeManager r11 = com.waze.NativeManager.getInstance()
            boolean r11 = r11.is24HrClock()
            if (r11 == 0) goto L55
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r3 = "HH:mm"
            r11.<init>(r3)
            goto L98
        L55:
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r3 = "h:mm a"
            r11.<init>(r3)
            goto L98
        L5d:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r7 = -1
            r8 = 5
            r3.add(r8, r7)
            int r7 = r3.get(r6)
            int r9 = r11.get(r6)
            if (r7 != r9) goto L91
            r7 = 2
            int r9 = r3.get(r7)
            int r7 = r11.get(r7)
            if (r9 != r7) goto L91
            int r3 = r3.get(r8)
            int r11 = r11.get(r8)
            if (r3 != r11) goto L91
            com.waze.shared_infra.o.a r11 = r10.f24664i
            r0 = 2131889918(0x7f120efe, float:1.9414513E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r11 = r11.c(r0, r1)
            goto La4
        L91:
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat
            java.lang.String r3 = "d MMMM"
            r11.<init>(r3, r4)
        L98:
            r11.setTimeZone(r2)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r11 = r11.format(r2)
        La4:
            android.widget.TextView r0 = r10.f24662g
            r0.setText(r11)
            com.waze.inbox.n r11 = r10.f24663h
            java.lang.String r11 = r11.f()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            r1 = 8
            if (r6 == r11) goto Lb9
            r11 = r5
            goto Lba
        Lb9:
            r11 = r1
        Lba:
            r0.setVisibility(r11)
            android.view.View r11 = r10.f24658c
            com.waze.inbox.n r0 = r10.f24663h
            boolean r0 = r0.i()
            if (r6 == r0) goto Lc9
            r0 = r1
            goto Lca
        Lc9:
            r0 = r5
        Lca:
            r11.setVisibility(r0)
            android.content.res.Resources r11 = r10.getResources()
            int r11 = com.waze.ui.z.as.h(r11, r1)
            r10.setPadding(r11, r5, r11, r11)
            com.waze.inbox.InboxRecycler r11 = r10.f24665j
            if (r11 == 0) goto Le7
            com.waze.sharedui.views.CheckBoxView r0 = r10.f24659d
            com.waze.inbox.n r10 = r10.f24663h
            boolean r10 = r11.aV(r10)
            r0.c(r10)
        Le7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.inbox.j.b(com.waze.inbox.n):void");
    }

    public final void c() {
        CheckBoxView checkBoxView = this.f24659d;
        checkBoxView.d();
        InboxRecycler inboxRecycler = this.f24665j;
        if (inboxRecycler != null) {
            inboxRecycler.aO(this.f24663h, checkBoxView.e());
        }
    }

    public final void d(InboxRecycler inboxRecycler) {
        this.f24665j = inboxRecycler;
    }
}
