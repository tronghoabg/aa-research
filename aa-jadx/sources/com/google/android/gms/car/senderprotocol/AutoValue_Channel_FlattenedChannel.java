package com.google.android.gms.car.senderprotocol;

/* JADX INFO: loaded from: classes2.dex */
public final class AutoValue_Channel_FlattenedChannel extends com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel {
    private final int a;
    private final int b;
    private final int c;
    private final defpackage.rws d;

    public AutoValue_Channel_FlattenedChannel(int i, int i2, int i3, defpackage.rws rwsVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (rwsVar == null) {
            throw new java.lang.NullPointerException("Null qoSPriority");
        }
        this.d = rwsVar;
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
    public final defpackage.rws d() {
        return this.d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel) {
            com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel flattenedChannel = (com.google.android.gms.car.senderprotocol.Channel.FlattenedChannel) obj;
            if (this.a == flattenedChannel.a() && this.b == flattenedChannel.b() && this.c == flattenedChannel.c() && this.d.equals(flattenedChannel.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        defpackage.rws rwsVar = this.d;
        return ((this.c ^ ((((i ^ 1000003) * 1000003) ^ this.b) * 1000003)) * 1000003) ^ rwsVar.hashCode();
    }

    public final java.lang.String toString() {
        return "FlattenedChannel{channelNumber=" + this.a + ", channelPriority=" + this.b + ", channelState=" + this.c + ", qoSPriority=" + this.d.toString() + "}";
    }
}
