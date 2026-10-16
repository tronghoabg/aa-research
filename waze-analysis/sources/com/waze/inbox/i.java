package com.waze.inbox;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.ed;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.ao;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.sharedui.views.WazeTextView;
import com.waze.ui.z.as;
import com.waze.view.title.TitleBar;
import com.waze.web.SimpleWebActivity;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends com.waze.app_nav.a.b {

    /* renamed from: a, reason: collision with root package name */
    private InboxRecycler f24645a;

    /* renamed from: b, reason: collision with root package name */
    private TitleBar f24646b;

    /* renamed from: c, reason: collision with root package name */
    private MaterialCardView f24647c;

    /* renamed from: d, reason: collision with root package name */
    private MaterialCardView f24648d;

    /* renamed from: e, reason: collision with root package name */
    private MaterialCardView f24649e;

    /* renamed from: f, reason: collision with root package name */
    private WazeTextView f24650f;

    /* renamed from: g, reason: collision with root package name */
    private View f24651g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f24652h;

    /* renamed from: i, reason: collision with root package name */
    private RelativeLayout f24653i;

    /* renamed from: j, reason: collision with root package name */
    private ed f24654j;

    /* renamed from: k, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f24655k = com.waze.shared_infra.o.b.a();

    public static /* synthetic */ void c(i iVar) {
        iVar.f24651g.setAlpha(0.0f);
        iVar.f24651g.setVisibility(0);
    }

    public static /* synthetic */ void i(i iVar) {
        iVar.f24645a.aM();
        iVar.f24645a.postDelayed(new ao(iVar, 6), 350L);
    }

    public static /* synthetic */ void k(i iVar) {
        if (iVar.f24645a.aU()) {
            iVar.f24645a.aS();
            iVar.h();
        } else {
            iVar.f24645a.aR();
            iVar.f24645a.postDelayed(new ao(iVar, 9), 350L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        boolean zAU = this.f24645a.aU();
        ImageView imageView = this.f24652h;
        if (zAU) {
            imageView.setImageResource(R.drawable.inbox_unselectall_icon);
            this.f24650f.setText(this.f24655k.c(R.string.SELECT_NONE, new Object[0]));
        } else {
            imageView.setImageResource(R.drawable.inbox_selectall_icon);
            this.f24650f.setText(this.f24655k.c(R.string.SELECT_ALL, new Object[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f24645a.j() != null) {
            int itemCount = this.f24645a.j().getItemCount();
            View view = this.f24651g;
            if (itemCount > 0) {
                com.waze.view.anim.g.d(view).alpha(0.0f).setDuration(100L).withEndAction(new ao(this, 7));
            } else {
                com.waze.view.anim.g.d(view).alpha(1.0f).setDuration(100L).withStartAction(new ao(this, 8));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p() {
        com.waze.alerters.a.k.e().c();
    }

    public final void g() {
        if (this.f24653i.getVisibility() == 0) {
            return;
        }
        this.f24653i.setVisibility(0);
        this.f24653i.setTranslationY(as.e(R.dimen.friendItemHeight));
        com.waze.view.anim.g.d(this.f24653i).translationY(0.0f).setListener(null);
        n();
    }

    public final void h() {
        if (this.f24653i.getVisibility() == 8) {
            return;
        }
        this.f24653i.setVisibility(8);
        com.waze.view.anim.g.d(this.f24653i).translationY(as.e(R.dimen.friendItemHeight)).setListener(com.waze.view.anim.g.b(this.f24653i));
        this.f24645a.postDelayed(new ao(this, 9), 350L);
    }

    @Override // android.support.v4.app.ar
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.inbox_menu, viewGroup, false);
    }

    @Override // android.support.v4.app.ar
    public final void onDestroy() {
        super.onDestroy();
        if (this.f24645a.j() == null || this.f24654j == null) {
            return;
        }
        this.f24645a.j().unregisterAdapterDataObserver(this.f24654j);
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int i2 = 0;
        com.waze.shared_infra.g.e.e(view, false, false, false, true);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("open_chat")) {
            b bVar = (b) Objects.requireNonNull((b) arguments.getParcelable("open_chat"));
            final Uri.Builder builderBuildUpon = Uri.parse(ConfigValues.CONFIG_VALUE_INBOX_CHAT_DEEPLINK_URL_PREFIX.b()).buildUpon();
            Map mapA = bVar.a();
            Objects.requireNonNull(builderBuildUpon);
            Map.EL.forEach(mapA, new BiConsumer() { // from class: com.waze.inbox.f
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    builderBuildUpon.appendQueryParameter((String) obj, (String) obj2);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            Context context = getContext();
            if (context != null) {
                context.startActivity(SimpleWebActivity.z(context, null, builderBuildUpon.build().toString()));
            } else {
                com.waze.shared_infra.i.h.j("Cannot open chat deeplink, null context");
            }
            arguments.remove("open_chat");
            setArguments(arguments);
        }
        this.f24645a = (InboxRecycler) view.findViewById(R.id.inboxRecycler);
        this.f24646b = (TitleBar) view.findViewById(R.id.inboxTitle);
        this.f24647c = (MaterialCardView) view.findViewById(R.id.btnSelectAll);
        this.f24648d = (MaterialCardView) view.findViewById(R.id.btnDeleteSelected);
        this.f24649e = (MaterialCardView) view.findViewById(R.id.btnMarkAsRead);
        this.f24650f = (WazeTextView) view.findViewById(R.id.lblSelectAll);
        this.f24651g = view.findViewById(R.id.inboxEmptyStateView);
        this.f24652h = (ImageView) view.findViewById(R.id.selectAllButtonImageView);
        this.f24653i = (RelativeLayout) view.findViewById(R.id.inboxBottomBarContainer);
        this.f24645a.aW(this);
        this.f24646b.n(new e(i2));
        this.f24646b.m(new com.waze.design_components.c.e(this, 12));
        TitleBar titleBar = this.f24646b;
        com.waze.shared_infra.o.a aVar = this.f24655k;
        titleBar.c(aVar.c(R.string.INBOX, new Object[0]));
        this.f24647c.setOnClickListener(new com.waze.design_components.c.e(this, 13));
        this.f24648d.setOnClickListener(new com.waze.design_components.c.e(this, 14));
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new g(this));
        this.f24649e.setOnClickListener(new com.waze.design_components.c.e(this, 15));
        this.f24650f.setText(aVar.c(R.string.SELECT_ALL, new Object[0]));
        this.f24645a.aQ();
        if (this.f24645a.j() != null) {
            o();
            this.f24654j = new h(this);
            this.f24645a.j().registerAdapterDataObserver(this.f24654j);
        }
    }
}
