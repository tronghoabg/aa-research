package com.bytedance.sdk.openadsdk.core.dz;

import android.util.Pair;
import android.view.View;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;
import java.util.Set;

/* loaded from: classes3.dex */
public class xs {
    private final AdEvents ivm;
    private final AdSession lw;
    protected VastProperties moa;
    protected String yo;
    private boolean xs = false;
    protected boolean uef = false;

    /* renamed from: oa, reason: collision with root package name */
    protected int f25599oa = 0;

    public xs(AdSession adSession, AdEvents adEvents, View view) {
        this.lw = adSession;
        this.ivm = adEvents;
        this.yo = adSession.getAdSessionId();
        uef(view);
    }

    public void moa() {
        uef(3);
    }

    public void oa(int i5) {
    }

    public void uef(float f10, boolean z2) {
    }

    public void yo() {
        uef(4);
    }

    public void oa() {
        uef(1);
    }

    public void uef(boolean z2) {
    }

    public void uef(boolean z2, float f10) {
    }

    public void uef(View view) {
        AdSession adSession;
        if (view == null || (adSession = this.lw) == null) {
            return;
        }
        adSession.registerAdView(view);
    }

    public void uef(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.lw;
        if (adSession != null) {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        }
    }

    public boolean uef() {
        return this.uef;
    }

    public void uef(int i5) {
        int i10;
        if (this.lw == null || this.ivm == null || !lw.yo()) {
            return;
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4 || (i10 = this.f25599oa) == 0 || i10 == 4) {
                        return;
                    }
                    this.lw.finish();
                    this.uef = false;
                } else {
                    if (this.xs) {
                        return;
                    }
                    int i11 = this.f25599oa;
                    if (i11 != 1 && i11 != 2) {
                        return;
                    }
                    this.ivm.impressionOccurred();
                    this.xs = true;
                }
            } else {
                if (this.f25599oa != 0) {
                    return;
                }
                this.lw.start();
                if (this.moa == null) {
                    this.moa = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
                }
                this.ivm.loaded(this.moa);
                this.uef = true;
                this.moa = null;
            }
        } else {
            if (this.f25599oa != 0) {
                return;
            }
            this.lw.start();
            this.ivm.loaded();
            this.uef = true;
        }
        this.f25599oa = i5;
    }

    public void uef(Set<Pair<View, FriendlyObstructionPurpose>> set) {
        for (Pair<View, FriendlyObstructionPurpose> pair : set) {
            uef((View) pair.first, (FriendlyObstructionPurpose) pair.second);
        }
    }
}
