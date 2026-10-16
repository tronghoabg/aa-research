package com.google.android.gms.car.senderprotocol;

import com.google.android.gms.car.senderprotocol.Channel;
import defpackage.rvz;

/* loaded from: classes2.dex */
public final class AutoValue_Channel_FlattenedChannel extends Channel.FlattenedChannel {
    private final int a;
    private final int b;
    private final int c;
    private final rvz d;

    public AutoValue_Channel_FlattenedChannel(int i, int i2, int i3, rvz rvzVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (rvzVar == null) {
            throw new NullPointerException("Null qoSPriority");
        }
        this.d = rvzVar;
    }

    @Override // com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel
    public final int a() {
        return this.a;
    }

    @Override // com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel
    public final int b() {
        return this.b;
    }

    @Override // com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel
    public final int c() {
        return this.c;
    }

    @Override // com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel
    public final rvz d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Channel.FlattenedChannel) {
            Channel.FlattenedChannel flattenedChannel = (Channel.FlattenedChannel) obj;
            if (this.a == flattenedChannel.a() && this.b == flattenedChannel.b() && this.c == flattenedChannel.c() && this.d.equals(flattenedChannel.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        rvz rvzVar = this.d;
        return ((this.c ^ ((((i ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ rvzVar.hashCode();
    }

    public final String toString() {
        return "FlattenedChannel{channelNumber=" + this.a + ", channelPriority=" + this.b + ", channelState=" + this.c + ", qoSPriority=" + this.d.toString() + "}";
    }
}
