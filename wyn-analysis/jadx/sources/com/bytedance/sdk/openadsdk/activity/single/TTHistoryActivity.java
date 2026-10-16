package com.bytedance.sdk.openadsdk.activity.single;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.recyclerview.widget.C1473k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.component.utils.orq;
import com.bytedance.sdk.openadsdk.common.oib;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.oa;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.dz.uef.oa;
import com.bytedance.sdk.openadsdk.dz.uef.oa.uef;
import com.bytedance.sdk.openadsdk.dz.uef.uef.yo;
import com.bytedance.sdk.openadsdk.utils.af;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class TTHistoryActivity extends TTBaseActivity {
    private ArrayList<com.bytedance.sdk.openadsdk.dz.uef.uef> bcc = new ArrayList<>();
    private FrameLayout cq;
    private com.bytedance.sdk.openadsdk.dz.uef.oa.oa dj;
    private com.bytedance.sdk.openadsdk.dz.uef.oa dz;
    private String ivm;
    private String lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.ivm.moa f25172oa;
    private com.bytedance.sdk.openadsdk.core.ivm.yo uef;
    private gzw wk;
    private com.bytedance.sdk.openadsdk.core.ivm.lw wrv;
    private String xs;
    private com.bytedance.sdk.openadsdk.core.ivm.moa yo;

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity$6, reason: invalid class name */
    public class AnonymousClass6 implements oa.InterfaceC0102oa {
        final /* synthetic */ com.bytedance.sdk.openadsdk.core.widget.oa uef;

        public AnonymousClass6(com.bytedance.sdk.openadsdk.core.widget.oa oaVar) {
            this.uef = oaVar;
        }

        @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
        public void oa() {
            this.uef.dismiss();
        }

        @Override // com.bytedance.sdk.openadsdk.core.widget.oa.InterfaceC0102oa
        public void uef() {
            try {
                com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().uef(new yo.uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.6.1
                    @Override // com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef
                    public void uef() {
                        TTHistoryActivity.this.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.6.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                TTHistoryActivity.this.bcc.clear();
                                TTHistoryActivity tTHistoryActivity = TTHistoryActivity.this;
                                Toast.makeText(tTHistoryActivity, tTHistoryActivity.getString(orq.oa(tTHistoryActivity, "tt_history_delete_successful")), 0).show();
                                TTHistoryActivity.this.lw();
                            }
                        });
                        TTHistoryActivity.this.wk = com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().yo();
                        if (TTHistoryActivity.this.wk != null) {
                            com.bytedance.sdk.openadsdk.moa.yo.uef(System.currentTimeMillis(), TTHistoryActivity.this.wk, "landingpage", "iab_clear_history_all");
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef
                    public void uef(Exception exc) {
                        exc.getMessage();
                    }
                });
            } catch (Exception e7) {
                e7.getMessage();
            }
            this.uef.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ivm() {
        com.bytedance.sdk.openadsdk.core.widget.oa oaVar = new com.bytedance.sdk.openadsdk.core.widget.oa(this);
        try {
            this.moa = getString(orq.oa(this, "tt_history_confirm_maintitle"));
            this.lw = getString(orq.oa(this, "tt_history_confirm_subtitle"));
            this.ivm = getString(orq.oa(this, "tt_history_cancel"));
            this.xs = getString(orq.oa(this, "tt_history_delete"));
            oaVar.oa(this.moa).uef(this.lw).yo(this.xs).moa(this.ivm);
            oaVar.uef(new AnonymousClass6(oaVar)).show();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lw() {
        if (this.bcc.isEmpty()) {
            com.bytedance.sdk.openadsdk.dz.uef.oa.oa oaVar = this.dj;
            if (oaVar != null) {
                oaVar.uef();
                this.dj.setVisibility(0);
            }
            this.f25172oa.setVisibility(8);
        } else {
            this.f25172oa.setVisibility(0);
            this.cq.setVisibility(0);
            com.bytedance.sdk.openadsdk.dz.uef.oa.oa oaVar2 = this.dj;
            if (oaVar2 != null) {
                oaVar2.setVisibility(8);
            }
        }
        com.bytedance.sdk.openadsdk.dz.uef.oa oaVar3 = this.dz;
        if (oaVar3 != null) {
            oaVar3.uef(this.bcc);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!wk.lw()) {
            finish();
            return;
        }
        try {
            sy.oa(this);
        } catch (Throwable unused) {
        }
        try {
            setContentView(oa());
            com.bytedance.sdk.openadsdk.dz.oa.uef(this);
            this.f25172oa = (com.bytedance.sdk.openadsdk.core.ivm.moa) this.uef.findViewById(bs.ot);
            this.yo = (com.bytedance.sdk.openadsdk.core.ivm.moa) this.uef.findViewById(520093720);
            this.dj.findViewById(bs.ggp);
            this.f25172oa.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryActivity.this.uef(view);
                }
            });
            this.yo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryActivity.this.finish();
                }
            });
            com.bytedance.sdk.openadsdk.dz.uef.oa oaVar = this.dz;
            if (oaVar != null) {
                oaVar.uef(new oa.InterfaceC0118oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.3
                    @Override // com.bytedance.sdk.openadsdk.dz.uef.oa.InterfaceC0118oa
                    public void uef(com.bytedance.sdk.openadsdk.dz.uef.uef uefVar) {
                        TTHistoryLandingPageActivity.uef(TTHistoryActivity.this, uefVar.xs(), uefVar.lw(), uefVar.oa());
                        TTHistoryActivity.this.finish();
                    }
                });
            }
            yo();
            lw();
        } catch (Throwable unused2) {
            finish();
        }
    }

    private View oa() {
        com.bytedance.sdk.openadsdk.core.ivm.yo yoVar = new com.bytedance.sdk.openadsdk.core.ivm.yo(this);
        if (Build.VERSION.SDK_INT >= 35) {
            yoVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.ivm.lw lwVar = new com.bytedance.sdk.openadsdk.core.ivm.lw(this);
        this.wrv = lwVar;
        lwVar.setOrientation(1);
        yoVar.addView(this.wrv, new FrameLayout.LayoutParams(-1, -1));
        this.wrv.setId(bs.ou);
        this.wrv.setPadding(0, af.oa(this, 12.0f), 0, 0);
        this.uef = new oib(this);
        this.wrv.addView(this.uef, new LinearLayout.LayoutParams(-1, af.oa(this, 44.0f)));
        FrameLayout frameLayout = new FrameLayout(this);
        this.cq = frameLayout;
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setId(bs.hnk);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.bytedance.sdk.openadsdk.dz.uef.oa oaVar = new com.bytedance.sdk.openadsdk.dz.uef.oa(this);
        this.dz = oaVar;
        recyclerView.setAdapter(oaVar);
        recyclerView.addItemDecoration(new C1473k(this));
        this.cq.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.dz.uef.oa.oa oaVar2 = new com.bytedance.sdk.openadsdk.dz.uef.oa.oa(this);
        this.dj = oaVar2;
        oaVar2.setId(bs.ggp);
        this.cq.addView(this.dj, new FrameLayout.LayoutParams(-1, -1));
        this.wrv.addView(this.cq);
        return yoVar;
    }

    private void yo() {
        com.bytedance.sdk.openadsdk.dz.uef.uef.yo.uef().uef(new yo.oa() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4
            @Override // com.bytedance.sdk.openadsdk.dz.uef.uef.yo.oa
            public void uef(List<com.bytedance.sdk.openadsdk.dz.uef.uef> list) {
                if (list != null) {
                    TTHistoryActivity.this.bcc.addAll(list);
                    TTHistoryActivity.this.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            TTHistoryActivity.this.lw();
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(View view) {
        final com.bytedance.sdk.openadsdk.dz.uef.oa.uef uefVar = new com.bytedance.sdk.openadsdk.dz.uef.oa.uef(this);
        uefVar.setOnMenuItemClickListener(new uef.InterfaceC0119uef() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity.5
            @Override // com.bytedance.sdk.openadsdk.dz.uef.oa.uef.InterfaceC0119uef
            public void oa() {
                uefVar.uef();
            }

            @Override // com.bytedance.sdk.openadsdk.dz.uef.oa.uef.InterfaceC0119uef
            public void uef() {
                TTHistoryActivity.this.ivm();
                uefVar.uef();
            }
        });
        uefVar.uef(view);
    }
}
