package com.waze.gw;

import android.content.Context;
import com.waze.gw.Gateway;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: HlpProtocol.java */
@Deprecated
/* loaded from: classes10.dex */
final class HudStateSnapshot {
    final List<String> alerts;
    final int averageLeft;
    final int averagePercent;
    final boolean averageZone;
    private final HudCanonicalState canonical;
    final String currentStreet;
    final String eta;
    final int exit;
    final Gateway.LaneSnapshot lanes;
    final int limitKmh;
    final boolean navigating;
    final String nextStreet;
    final int nextTurn;
    final int overMargin;
    final int recommendedSpeed;
    final int remainingMeters;
    final int remainingMinutes;
    final int speedKmh;
    final int turn;
    final int turnDistance;

    private HudStateSnapshot(HudCanonicalState hudCanonicalState) {
        this.canonical = hudCanonicalState;
        this.speedKmh = hudCanonicalState.speedKmh;
        this.limitKmh = hudCanonicalState.limitKmh;
        this.overMargin = hudCanonicalState.overMargin;
        this.navigating = hudCanonicalState.navigating;
        this.turn = hudCanonicalState.turn;
        this.nextTurn = hudCanonicalState.nextTurn;
        this.turnDistance = hudCanonicalState.turnDistanceM;
        this.exit = hudCanonicalState.exitNumber;
        this.lanes = hudCanonicalState.lanes;
        this.currentStreet = hudCanonicalState.currentStreet;
        this.nextStreet = hudCanonicalState.nextStreet;
        this.eta = hudCanonicalState.etaClock;
        this.remainingMinutes = hudCanonicalState.remainingMinutes;
        this.remainingMeters = hudCanonicalState.remainingMeters;
        this.averageZone = hudCanonicalState.averageZone;
        this.averageLeft = hudCanonicalState.averageLeftM;
        this.recommendedSpeed = hudCanonicalState.recommendedSpeedKmh;
        this.averagePercent = hudCanonicalState.averagePercent;
        ArrayList arrayList = new ArrayList();
        Iterator<HudCanonicalAlert> it = hudCanonicalState.alerts.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().rawRow);
        }
        this.alerts = Collections.unmodifiableList(arrayList);
    }

    static HudStateSnapshot capture(Context context) {
        return new HudStateSnapshot(HudCanonicalState.capture(context));
    }

    static int toKmhForTest(int i2, String str) {
        return HudCanonicalState.toKmhForTest(i2, str);
    }

    static int turnCode(int i2) {
        return HudTurnCodec.encode(i2);
    }

    String alertSignature() {
        return this.canonical.alertSignature();
    }

    String signature(Set<String> set) {
        return HlpStateEncoder.signature(this.canonical, set);
    }

    byte[] encode(Set<String> set, long j2) throws IOException {
        return HlpStateEncoder.encode(this.canonical, set, j2);
    }
}
