package com.applovin.impl.mediation;

import com.applovin.mediation.MaxReward;

/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f21980a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21981b;

    private MaxRewardImpl(int i5, String str) {
        if (i5 < 0) {
            throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
        }
        this.f21980a = str;
        this.f21981b = i5;
    }

    public static MaxReward create(int i5, String str) {
        return new MaxRewardImpl(i5, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f21981b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f21980a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxReward{amount=");
        sb2.append(this.f21981b);
        sb2.append(", label=");
        return wg.b.c(sb2, this.f21980a, "}");
    }
}
