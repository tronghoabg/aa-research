package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.adview.AppLovinTouchToClickListener;
import com.applovin.impl.v4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinEventTypes;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class y4 implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public static final y4 f23550A;

    /* renamed from: A0, reason: collision with root package name */
    public static final y4 f23551A0;

    /* renamed from: A1, reason: collision with root package name */
    public static final y4 f23552A1;

    /* renamed from: A2, reason: collision with root package name */
    public static final y4 f23553A2;

    /* renamed from: A3, reason: collision with root package name */
    public static final y4 f23554A3;

    /* renamed from: A4, reason: collision with root package name */
    public static final y4 f23555A4;

    /* renamed from: A5, reason: collision with root package name */
    public static final y4 f23556A5;

    /* renamed from: A6, reason: collision with root package name */
    public static final y4 f23557A6;

    /* renamed from: B, reason: collision with root package name */
    public static final y4 f23558B;
    public static final y4 B0;

    /* renamed from: B1, reason: collision with root package name */
    public static final y4 f23559B1;

    /* renamed from: B2, reason: collision with root package name */
    public static final y4 f23560B2;

    /* renamed from: B3, reason: collision with root package name */
    public static final y4 f23561B3;

    /* renamed from: B4, reason: collision with root package name */
    public static final y4 f23562B4;

    /* renamed from: B5, reason: collision with root package name */
    public static final y4 f23563B5;

    /* renamed from: B6, reason: collision with root package name */
    public static final y4 f23564B6;

    /* renamed from: C, reason: collision with root package name */
    public static final y4 f23565C;

    /* renamed from: C0, reason: collision with root package name */
    public static final y4 f23566C0;

    /* renamed from: C1, reason: collision with root package name */
    public static final y4 f23567C1;

    /* renamed from: C2, reason: collision with root package name */
    public static final y4 f23568C2;
    public static final y4 C3;

    /* renamed from: C4, reason: collision with root package name */
    public static final y4 f23569C4;

    /* renamed from: C5, reason: collision with root package name */
    public static final y4 f23570C5;

    /* renamed from: C6, reason: collision with root package name */
    public static final y4 f23571C6;

    /* renamed from: D, reason: collision with root package name */
    public static final y4 f23572D;

    /* renamed from: D0, reason: collision with root package name */
    public static final y4 f23573D0;

    /* renamed from: D1, reason: collision with root package name */
    public static final y4 f23574D1;

    /* renamed from: D2, reason: collision with root package name */
    public static final y4 f23575D2;

    /* renamed from: D3, reason: collision with root package name */
    public static final y4 f23576D3;

    /* renamed from: D4, reason: collision with root package name */
    public static final y4 f23577D4;

    /* renamed from: D5, reason: collision with root package name */
    public static final y4 f23578D5;

    /* renamed from: D6, reason: collision with root package name */
    public static final y4 f23579D6;

    /* renamed from: E, reason: collision with root package name */
    public static final y4 f23580E;

    /* renamed from: E0, reason: collision with root package name */
    public static final y4 f23581E0;

    /* renamed from: E1, reason: collision with root package name */
    public static final y4 f23582E1;

    /* renamed from: E2, reason: collision with root package name */
    public static final y4 f23583E2;

    /* renamed from: E3, reason: collision with root package name */
    public static final y4 f23584E3;

    /* renamed from: E4, reason: collision with root package name */
    public static final y4 f23585E4;

    /* renamed from: E5, reason: collision with root package name */
    public static final y4 f23586E5;

    /* renamed from: E6, reason: collision with root package name */
    public static final y4 f23587E6;

    /* renamed from: F, reason: collision with root package name */
    public static final y4 f23588F;

    /* renamed from: F0, reason: collision with root package name */
    public static final y4 f23589F0;

    /* renamed from: F1, reason: collision with root package name */
    public static final y4 f23590F1;

    /* renamed from: F2, reason: collision with root package name */
    public static final y4 f23591F2;

    /* renamed from: F3, reason: collision with root package name */
    public static final y4 f23592F3;

    /* renamed from: F4, reason: collision with root package name */
    public static final y4 f23593F4;

    /* renamed from: F5, reason: collision with root package name */
    public static final y4 f23594F5;

    /* renamed from: F6, reason: collision with root package name */
    public static final y4 f23595F6;

    /* renamed from: G, reason: collision with root package name */
    public static final y4 f23596G;

    /* renamed from: G0, reason: collision with root package name */
    public static final y4 f23597G0;

    /* renamed from: G1, reason: collision with root package name */
    public static final y4 f23598G1;

    /* renamed from: G2, reason: collision with root package name */
    public static final y4 f23599G2;

    /* renamed from: G3, reason: collision with root package name */
    public static final y4 f23600G3;

    /* renamed from: G4, reason: collision with root package name */
    public static final y4 f23601G4;

    /* renamed from: G5, reason: collision with root package name */
    public static final y4 f23602G5;

    /* renamed from: G6, reason: collision with root package name */
    public static final y4 f23603G6;

    /* renamed from: H, reason: collision with root package name */
    public static final y4 f23604H;

    /* renamed from: H0, reason: collision with root package name */
    public static final y4 f23605H0;

    /* renamed from: H1, reason: collision with root package name */
    public static final y4 f23606H1;

    /* renamed from: H2, reason: collision with root package name */
    public static final y4 f23607H2;

    /* renamed from: H3, reason: collision with root package name */
    public static final y4 f23608H3;

    /* renamed from: H4, reason: collision with root package name */
    public static final y4 f23609H4;

    /* renamed from: H5, reason: collision with root package name */
    public static final y4 f23610H5;

    /* renamed from: H6, reason: collision with root package name */
    public static final y4 f23611H6;

    /* renamed from: I, reason: collision with root package name */
    public static final y4 f23612I;

    /* renamed from: I0, reason: collision with root package name */
    public static final y4 f23613I0;

    /* renamed from: I1, reason: collision with root package name */
    public static final y4 f23614I1;

    /* renamed from: I2, reason: collision with root package name */
    public static final y4 f23615I2;
    public static final y4 I3;

    /* renamed from: I4, reason: collision with root package name */
    public static final y4 f23616I4;

    /* renamed from: I5, reason: collision with root package name */
    public static final y4 f23617I5;

    /* renamed from: I6, reason: collision with root package name */
    public static final y4 f23618I6;

    /* renamed from: J, reason: collision with root package name */
    public static final y4 f23619J;

    /* renamed from: J0, reason: collision with root package name */
    public static final y4 f23620J0;

    /* renamed from: J1, reason: collision with root package name */
    public static final y4 f23621J1;

    /* renamed from: J2, reason: collision with root package name */
    public static final y4 f23622J2;

    /* renamed from: J3, reason: collision with root package name */
    public static final y4 f23623J3;

    /* renamed from: J4, reason: collision with root package name */
    public static final y4 f23624J4;

    /* renamed from: J5, reason: collision with root package name */
    public static final y4 f23625J5;

    /* renamed from: J6, reason: collision with root package name */
    public static final y4 f23626J6;

    /* renamed from: K, reason: collision with root package name */
    public static final y4 f23627K;

    /* renamed from: K0, reason: collision with root package name */
    public static final y4 f23628K0;

    /* renamed from: K1, reason: collision with root package name */
    public static final y4 f23629K1;

    /* renamed from: K2, reason: collision with root package name */
    public static final y4 f23630K2;

    /* renamed from: K3, reason: collision with root package name */
    public static final y4 f23631K3;

    /* renamed from: K4, reason: collision with root package name */
    public static final y4 f23632K4;

    /* renamed from: K5, reason: collision with root package name */
    public static final y4 f23633K5;

    /* renamed from: K6, reason: collision with root package name */
    public static final y4 f23634K6;
    public static final y4 L;

    /* renamed from: L0, reason: collision with root package name */
    public static final y4 f23635L0;

    /* renamed from: L1, reason: collision with root package name */
    public static final y4 f23636L1;

    /* renamed from: L2, reason: collision with root package name */
    public static final y4 f23637L2;

    /* renamed from: L3, reason: collision with root package name */
    public static final y4 f23638L3;

    /* renamed from: L4, reason: collision with root package name */
    public static final y4 f23639L4;

    /* renamed from: L5, reason: collision with root package name */
    public static final y4 f23640L5;

    /* renamed from: L6, reason: collision with root package name */
    public static final y4 f23641L6;

    /* renamed from: M, reason: collision with root package name */
    public static final y4 f23642M;

    /* renamed from: M0, reason: collision with root package name */
    public static final y4 f23643M0;

    /* renamed from: M1, reason: collision with root package name */
    public static final y4 f23644M1;

    /* renamed from: M2, reason: collision with root package name */
    public static final y4 f23645M2;

    /* renamed from: M3, reason: collision with root package name */
    public static final y4 f23646M3;
    public static final y4 M4;

    /* renamed from: M5, reason: collision with root package name */
    public static final y4 f23647M5;

    /* renamed from: M6, reason: collision with root package name */
    public static final y4 f23648M6;

    /* renamed from: N, reason: collision with root package name */
    public static final y4 f23649N;

    /* renamed from: N0, reason: collision with root package name */
    public static final y4 f23650N0;

    /* renamed from: N1, reason: collision with root package name */
    public static final y4 f23651N1;

    /* renamed from: N2, reason: collision with root package name */
    public static final y4 f23652N2;

    /* renamed from: N3, reason: collision with root package name */
    public static final y4 f23653N3;

    /* renamed from: N4, reason: collision with root package name */
    public static final y4 f23654N4;

    /* renamed from: N5, reason: collision with root package name */
    public static final y4 f23655N5;

    /* renamed from: N6, reason: collision with root package name */
    public static final y4 f23656N6;

    /* renamed from: O, reason: collision with root package name */
    public static final y4 f23657O;

    /* renamed from: O0, reason: collision with root package name */
    public static final y4 f23658O0;

    /* renamed from: O1, reason: collision with root package name */
    public static final y4 f23659O1;

    /* renamed from: O2, reason: collision with root package name */
    public static final y4 f23660O2;

    /* renamed from: O3, reason: collision with root package name */
    public static final y4 f23661O3;
    public static final y4 O4;

    /* renamed from: O5, reason: collision with root package name */
    public static final y4 f23662O5;

    /* renamed from: O6, reason: collision with root package name */
    public static final y4 f23663O6;

    /* renamed from: P, reason: collision with root package name */
    public static final y4 f23664P;

    /* renamed from: P0, reason: collision with root package name */
    public static final y4 f23665P0;

    /* renamed from: P1, reason: collision with root package name */
    public static final y4 f23666P1;

    /* renamed from: P2, reason: collision with root package name */
    public static final y4 f23667P2;

    /* renamed from: P3, reason: collision with root package name */
    public static final y4 f23668P3;

    /* renamed from: P4, reason: collision with root package name */
    public static final y4 f23669P4;

    /* renamed from: P5, reason: collision with root package name */
    public static final y4 f23670P5;

    /* renamed from: P6, reason: collision with root package name */
    public static final y4 f23671P6;

    /* renamed from: Q, reason: collision with root package name */
    public static final y4 f23672Q;

    /* renamed from: Q0, reason: collision with root package name */
    public static final y4 f23673Q0;

    /* renamed from: Q1, reason: collision with root package name */
    public static final y4 f23674Q1;

    /* renamed from: Q2, reason: collision with root package name */
    public static final y4 f23675Q2;

    /* renamed from: Q3, reason: collision with root package name */
    public static final y4 f23676Q3;

    /* renamed from: Q4, reason: collision with root package name */
    public static final y4 f23677Q4;

    /* renamed from: Q5, reason: collision with root package name */
    public static final y4 f23678Q5;

    /* renamed from: Q6, reason: collision with root package name */
    public static final y4 f23679Q6;

    /* renamed from: R, reason: collision with root package name */
    public static final y4 f23680R;

    /* renamed from: R0, reason: collision with root package name */
    public static final y4 f23681R0;

    /* renamed from: R1, reason: collision with root package name */
    public static final y4 f23682R1;

    /* renamed from: R2, reason: collision with root package name */
    public static final y4 f23683R2;

    /* renamed from: R3, reason: collision with root package name */
    public static final y4 f23684R3;

    /* renamed from: R4, reason: collision with root package name */
    public static final y4 f23685R4;

    /* renamed from: R5, reason: collision with root package name */
    public static final y4 f23686R5;

    /* renamed from: R6, reason: collision with root package name */
    public static final y4 f23687R6;

    /* renamed from: S, reason: collision with root package name */
    public static final y4 f23688S;

    /* renamed from: S0, reason: collision with root package name */
    public static final y4 f23689S0;

    /* renamed from: S1, reason: collision with root package name */
    public static final y4 f23690S1;

    /* renamed from: S2, reason: collision with root package name */
    public static final y4 f23691S2;

    /* renamed from: S3, reason: collision with root package name */
    public static final y4 f23692S3;
    public static final y4 S4;

    /* renamed from: S5, reason: collision with root package name */
    public static final y4 f23693S5;

    /* renamed from: S6, reason: collision with root package name */
    public static final y4 f23694S6;

    /* renamed from: T, reason: collision with root package name */
    public static final y4 f23695T;

    /* renamed from: T0, reason: collision with root package name */
    public static final y4 f23696T0;

    /* renamed from: T1, reason: collision with root package name */
    public static final y4 f23697T1;

    /* renamed from: T2, reason: collision with root package name */
    public static final y4 f23698T2;

    /* renamed from: T3, reason: collision with root package name */
    public static final y4 f23699T3;

    /* renamed from: T4, reason: collision with root package name */
    public static final y4 f23700T4;

    /* renamed from: T5, reason: collision with root package name */
    public static final y4 f23701T5;

    /* renamed from: T6, reason: collision with root package name */
    public static final y4 f23702T6;

    /* renamed from: U, reason: collision with root package name */
    public static final y4 f23703U;

    /* renamed from: U0, reason: collision with root package name */
    public static final y4 f23704U0;

    /* renamed from: U1, reason: collision with root package name */
    public static final y4 f23705U1;

    /* renamed from: U2, reason: collision with root package name */
    public static final y4 f23706U2;

    /* renamed from: U3, reason: collision with root package name */
    public static final y4 f23707U3;

    /* renamed from: U4, reason: collision with root package name */
    public static final y4 f23708U4;

    /* renamed from: U5, reason: collision with root package name */
    public static final y4 f23709U5;

    /* renamed from: U6, reason: collision with root package name */
    public static final y4 f23710U6;

    /* renamed from: V, reason: collision with root package name */
    public static final y4 f23711V;

    /* renamed from: V0, reason: collision with root package name */
    public static final y4 f23712V0;

    /* renamed from: V1, reason: collision with root package name */
    public static final y4 f23713V1;

    /* renamed from: V2, reason: collision with root package name */
    public static final y4 f23714V2;

    /* renamed from: V3, reason: collision with root package name */
    public static final y4 f23715V3;

    /* renamed from: V4, reason: collision with root package name */
    public static final y4 f23716V4;

    /* renamed from: V5, reason: collision with root package name */
    public static final y4 f23717V5;

    /* renamed from: V6, reason: collision with root package name */
    public static final y4 f23718V6;

    /* renamed from: W, reason: collision with root package name */
    public static final y4 f23719W;

    /* renamed from: W0, reason: collision with root package name */
    public static final y4 f23720W0;

    /* renamed from: W1, reason: collision with root package name */
    public static final y4 f23721W1;

    /* renamed from: W2, reason: collision with root package name */
    public static final y4 f23722W2;

    /* renamed from: W3, reason: collision with root package name */
    public static final y4 f23723W3;

    /* renamed from: W4, reason: collision with root package name */
    public static final y4 f23724W4;

    /* renamed from: W5, reason: collision with root package name */
    public static final y4 f23725W5;

    /* renamed from: W6, reason: collision with root package name */
    public static final y4 f23726W6;

    /* renamed from: X, reason: collision with root package name */
    public static final y4 f23727X;

    /* renamed from: X0, reason: collision with root package name */
    public static final y4 f23728X0;

    /* renamed from: X1, reason: collision with root package name */
    public static final y4 f23729X1;

    /* renamed from: X2, reason: collision with root package name */
    public static final y4 f23730X2;

    /* renamed from: X3, reason: collision with root package name */
    public static final y4 f23731X3;

    /* renamed from: X4, reason: collision with root package name */
    public static final y4 f23732X4;

    /* renamed from: X5, reason: collision with root package name */
    public static final y4 f23733X5;

    /* renamed from: X6, reason: collision with root package name */
    public static final y4 f23734X6;

    /* renamed from: Y, reason: collision with root package name */
    public static final y4 f23735Y;

    /* renamed from: Y0, reason: collision with root package name */
    public static final y4 f23736Y0;

    /* renamed from: Y1, reason: collision with root package name */
    public static final y4 f23737Y1;

    /* renamed from: Y2, reason: collision with root package name */
    public static final y4 f23738Y2;

    /* renamed from: Y3, reason: collision with root package name */
    public static final y4 f23739Y3;

    /* renamed from: Y4, reason: collision with root package name */
    public static final y4 f23740Y4;

    /* renamed from: Y5, reason: collision with root package name */
    public static final y4 f23741Y5;

    /* renamed from: Y6, reason: collision with root package name */
    public static final y4 f23742Y6;

    /* renamed from: Z, reason: collision with root package name */
    public static final y4 f23743Z;
    public static final y4 Z0;

    /* renamed from: Z1, reason: collision with root package name */
    public static final y4 f23744Z1;

    /* renamed from: Z2, reason: collision with root package name */
    public static final y4 f23745Z2;

    /* renamed from: Z3, reason: collision with root package name */
    public static final y4 f23746Z3;

    /* renamed from: Z4, reason: collision with root package name */
    public static final y4 f23747Z4;

    /* renamed from: Z5, reason: collision with root package name */
    public static final y4 f23748Z5;

    /* renamed from: Z6, reason: collision with root package name */
    public static final y4 f23749Z6;

    /* renamed from: a0, reason: collision with root package name */
    public static final y4 f23750a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final y4 f23751a1;

    /* renamed from: a2, reason: collision with root package name */
    public static final y4 f23752a2;

    /* renamed from: a3, reason: collision with root package name */
    public static final y4 f23753a3;

    /* renamed from: a4, reason: collision with root package name */
    public static final y4 f23754a4;
    public static final y4 a5;

    /* renamed from: a6, reason: collision with root package name */
    public static final y4 f23755a6;

    /* renamed from: a7, reason: collision with root package name */
    public static final y4 f23756a7;

    /* renamed from: b0, reason: collision with root package name */
    public static final y4 f23757b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final y4 f23758b1;

    /* renamed from: b2, reason: collision with root package name */
    public static final y4 f23759b2;

    /* renamed from: b3, reason: collision with root package name */
    public static final y4 f23760b3;

    /* renamed from: b4, reason: collision with root package name */
    public static final y4 f23761b4;
    public static final y4 b5;

    /* renamed from: b6, reason: collision with root package name */
    public static final y4 f23762b6;

    /* renamed from: b7, reason: collision with root package name */
    public static final y4 f23763b7;

    /* renamed from: c0, reason: collision with root package name */
    public static final y4 f23765c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final y4 f23766c1;

    /* renamed from: c2, reason: collision with root package name */
    public static final y4 f23767c2;

    /* renamed from: c3, reason: collision with root package name */
    public static final y4 f23768c3;

    /* renamed from: c4, reason: collision with root package name */
    public static final y4 f23769c4;

    /* renamed from: c5, reason: collision with root package name */
    public static final y4 f23770c5;

    /* renamed from: c6, reason: collision with root package name */
    public static final y4 f23771c6;

    /* renamed from: c7, reason: collision with root package name */
    public static final y4 f23772c7;

    /* renamed from: d0, reason: collision with root package name */
    public static final y4 f23774d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final y4 f23775d1;

    /* renamed from: d2, reason: collision with root package name */
    public static final y4 f23776d2;
    public static final y4 d3;

    /* renamed from: d4, reason: collision with root package name */
    public static final y4 f23777d4;
    public static final y4 d5;

    /* renamed from: d6, reason: collision with root package name */
    public static final y4 f23778d6;

    /* renamed from: d7, reason: collision with root package name */
    public static final y4 f23779d7;

    /* renamed from: e, reason: collision with root package name */
    public static final y4 f23780e;

    /* renamed from: e0, reason: collision with root package name */
    public static final y4 f23781e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final y4 f23782e1;

    /* renamed from: e2, reason: collision with root package name */
    public static final y4 f23783e2;

    /* renamed from: e3, reason: collision with root package name */
    public static final y4 f23784e3;

    /* renamed from: e4, reason: collision with root package name */
    public static final y4 f23785e4;

    /* renamed from: e5, reason: collision with root package name */
    public static final y4 f23786e5;

    /* renamed from: e6, reason: collision with root package name */
    public static final y4 f23787e6;
    public static final y4 e7;

    /* renamed from: f, reason: collision with root package name */
    public static final y4 f23788f;

    /* renamed from: f0, reason: collision with root package name */
    public static final y4 f23789f0;
    public static final y4 f1;

    /* renamed from: f2, reason: collision with root package name */
    public static final y4 f23790f2;

    /* renamed from: f3, reason: collision with root package name */
    public static final y4 f23791f3;

    /* renamed from: f4, reason: collision with root package name */
    public static final y4 f23792f4;

    /* renamed from: f5, reason: collision with root package name */
    public static final y4 f23793f5;

    /* renamed from: f6, reason: collision with root package name */
    public static final y4 f23794f6;

    /* renamed from: f7, reason: collision with root package name */
    public static final y4 f23795f7;

    /* renamed from: g, reason: collision with root package name */
    public static final y4 f23796g;

    /* renamed from: g0, reason: collision with root package name */
    public static final y4 f23797g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final y4 f23798g1;

    /* renamed from: g2, reason: collision with root package name */
    public static final y4 f23799g2;

    /* renamed from: g3, reason: collision with root package name */
    public static final y4 f23800g3;

    /* renamed from: g4, reason: collision with root package name */
    public static final y4 f23801g4;

    /* renamed from: g5, reason: collision with root package name */
    public static final y4 f23802g5;

    /* renamed from: g6, reason: collision with root package name */
    public static final y4 f23803g6;

    /* renamed from: g7, reason: collision with root package name */
    public static final y4 f23804g7;

    /* renamed from: h, reason: collision with root package name */
    public static final y4 f23805h;

    /* renamed from: h0, reason: collision with root package name */
    public static final y4 f23806h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final y4 f23807h1;

    /* renamed from: h2, reason: collision with root package name */
    public static final y4 f23808h2;

    /* renamed from: h3, reason: collision with root package name */
    public static final y4 f23809h3;

    /* renamed from: h4, reason: collision with root package name */
    public static final y4 f23810h4;

    /* renamed from: h5, reason: collision with root package name */
    public static final y4 f23811h5;

    /* renamed from: h6, reason: collision with root package name */
    public static final y4 f23812h6;

    /* renamed from: h7, reason: collision with root package name */
    public static final y4 f23813h7;

    /* renamed from: i, reason: collision with root package name */
    public static final y4 f23814i;

    /* renamed from: i0, reason: collision with root package name */
    public static final y4 f23815i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final y4 f23816i1;

    /* renamed from: i2, reason: collision with root package name */
    public static final y4 f23817i2;

    /* renamed from: i3, reason: collision with root package name */
    public static final y4 f23818i3;

    /* renamed from: i4, reason: collision with root package name */
    public static final y4 f23819i4;
    public static final y4 i5;

    /* renamed from: i6, reason: collision with root package name */
    public static final y4 f23820i6;

    /* renamed from: i7, reason: collision with root package name */
    public static final y4 f23821i7;

    /* renamed from: j, reason: collision with root package name */
    public static final y4 f23822j;

    /* renamed from: j0, reason: collision with root package name */
    public static final y4 f23823j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final y4 f23824j1;

    /* renamed from: j2, reason: collision with root package name */
    public static final y4 f23825j2;

    /* renamed from: j3, reason: collision with root package name */
    public static final y4 f23826j3;

    /* renamed from: j4, reason: collision with root package name */
    public static final y4 f23827j4;

    /* renamed from: j5, reason: collision with root package name */
    public static final y4 f23828j5;

    /* renamed from: j6, reason: collision with root package name */
    public static final y4 f23829j6;

    /* renamed from: j7, reason: collision with root package name */
    public static final y4 f23830j7;
    public static final y4 k;

    /* renamed from: k0, reason: collision with root package name */
    public static final y4 f23831k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final y4 f23832k1;

    /* renamed from: k2, reason: collision with root package name */
    public static final y4 f23833k2;

    /* renamed from: k3, reason: collision with root package name */
    public static final y4 f23834k3;

    /* renamed from: k4, reason: collision with root package name */
    public static final y4 f23835k4;
    public static final y4 k5;

    /* renamed from: k6, reason: collision with root package name */
    public static final y4 f23836k6;

    /* renamed from: k7, reason: collision with root package name */
    public static final y4 f23837k7;

    /* renamed from: l, reason: collision with root package name */
    public static final y4 f23838l;

    /* renamed from: l0, reason: collision with root package name */
    public static final y4 f23839l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final y4 f23840l1;

    /* renamed from: l2, reason: collision with root package name */
    public static final y4 f23841l2;

    /* renamed from: l3, reason: collision with root package name */
    public static final y4 f23842l3;

    /* renamed from: l4, reason: collision with root package name */
    public static final y4 f23843l4;

    /* renamed from: l5, reason: collision with root package name */
    public static final y4 f23844l5;

    /* renamed from: l6, reason: collision with root package name */
    public static final y4 f23845l6;

    /* renamed from: l7, reason: collision with root package name */
    public static final y4 f23846l7;

    /* renamed from: m, reason: collision with root package name */
    public static final y4 f23847m;

    /* renamed from: m0, reason: collision with root package name */
    public static final y4 f23848m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final y4 f23849m1;

    /* renamed from: m2, reason: collision with root package name */
    public static final y4 f23850m2;

    /* renamed from: m3, reason: collision with root package name */
    public static final y4 f23851m3;

    /* renamed from: m4, reason: collision with root package name */
    public static final y4 f23852m4;

    /* renamed from: m5, reason: collision with root package name */
    public static final y4 f23853m5;

    /* renamed from: m6, reason: collision with root package name */
    public static final y4 f23854m6;

    /* renamed from: m7, reason: collision with root package name */
    public static final y4 f23855m7;

    /* renamed from: n, reason: collision with root package name */
    public static final y4 f23856n;

    /* renamed from: n0, reason: collision with root package name */
    public static final y4 f23857n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final y4 f23858n1;

    /* renamed from: n2, reason: collision with root package name */
    public static final y4 f23859n2;

    /* renamed from: n3, reason: collision with root package name */
    public static final y4 f23860n3;

    /* renamed from: n4, reason: collision with root package name */
    public static final y4 f23861n4;

    /* renamed from: n5, reason: collision with root package name */
    public static final y4 f23862n5;

    /* renamed from: n6, reason: collision with root package name */
    public static final y4 f23863n6;

    /* renamed from: n7, reason: collision with root package name */
    public static final y4 f23864n7;

    /* renamed from: o, reason: collision with root package name */
    public static final y4 f23865o;

    /* renamed from: o0, reason: collision with root package name */
    public static final y4 f23866o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final y4 f23867o1;

    /* renamed from: o2, reason: collision with root package name */
    public static final y4 f23868o2;

    /* renamed from: o3, reason: collision with root package name */
    public static final y4 f23869o3;

    /* renamed from: o4, reason: collision with root package name */
    public static final y4 f23870o4;

    /* renamed from: o5, reason: collision with root package name */
    public static final y4 f23871o5;

    /* renamed from: o6, reason: collision with root package name */
    public static final y4 f23872o6;
    public static final y4 o7;

    /* renamed from: p, reason: collision with root package name */
    public static final y4 f23873p;

    /* renamed from: p0, reason: collision with root package name */
    public static final y4 f23874p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final y4 f23875p1;

    /* renamed from: p2, reason: collision with root package name */
    public static final y4 f23876p2;

    /* renamed from: p3, reason: collision with root package name */
    public static final y4 f23877p3;

    /* renamed from: p4, reason: collision with root package name */
    public static final y4 f23878p4;

    /* renamed from: p5, reason: collision with root package name */
    public static final y4 f23879p5;

    /* renamed from: p6, reason: collision with root package name */
    public static final y4 f23880p6;

    /* renamed from: p7, reason: collision with root package name */
    public static final y4 f23881p7;

    /* renamed from: q, reason: collision with root package name */
    public static final y4 f23882q;

    /* renamed from: q0, reason: collision with root package name */
    public static final y4 f23883q0;

    /* renamed from: q1, reason: collision with root package name */
    public static final y4 f23884q1;

    /* renamed from: q2, reason: collision with root package name */
    public static final y4 f23885q2;

    /* renamed from: q3, reason: collision with root package name */
    public static final y4 f23886q3;
    public static final y4 q4;

    /* renamed from: q5, reason: collision with root package name */
    public static final y4 f23887q5;

    /* renamed from: q6, reason: collision with root package name */
    public static final y4 f23888q6;

    /* renamed from: q7, reason: collision with root package name */
    public static final y4 f23889q7;

    /* renamed from: r, reason: collision with root package name */
    public static final y4 f23890r;

    /* renamed from: r0, reason: collision with root package name */
    public static final y4 f23891r0;

    /* renamed from: r1, reason: collision with root package name */
    public static final y4 f23892r1;

    /* renamed from: r2, reason: collision with root package name */
    public static final y4 f23893r2;

    /* renamed from: r3, reason: collision with root package name */
    public static final y4 f23894r3;

    /* renamed from: r4, reason: collision with root package name */
    public static final y4 f23895r4;

    /* renamed from: r5, reason: collision with root package name */
    public static final y4 f23896r5;

    /* renamed from: r6, reason: collision with root package name */
    public static final y4 f23897r6;

    /* renamed from: s, reason: collision with root package name */
    public static final y4 f23898s;

    /* renamed from: s0, reason: collision with root package name */
    public static final y4 f23899s0;

    /* renamed from: s1, reason: collision with root package name */
    public static final y4 f23900s1;

    /* renamed from: s2, reason: collision with root package name */
    public static final y4 f23901s2;

    /* renamed from: s3, reason: collision with root package name */
    public static final y4 f23902s3;

    /* renamed from: s4, reason: collision with root package name */
    public static final y4 f23903s4;

    /* renamed from: s5, reason: collision with root package name */
    public static final y4 f23904s5;

    /* renamed from: s6, reason: collision with root package name */
    public static final y4 f23905s6;

    /* renamed from: t, reason: collision with root package name */
    public static final y4 f23906t;

    /* renamed from: t0, reason: collision with root package name */
    public static final y4 f23907t0;

    /* renamed from: t1, reason: collision with root package name */
    public static final y4 f23908t1;

    /* renamed from: t2, reason: collision with root package name */
    public static final y4 f23909t2;

    /* renamed from: t3, reason: collision with root package name */
    public static final y4 f23910t3;

    /* renamed from: t4, reason: collision with root package name */
    public static final y4 f23911t4;

    /* renamed from: t5, reason: collision with root package name */
    public static final y4 f23912t5;

    /* renamed from: t6, reason: collision with root package name */
    public static final y4 f23913t6;

    /* renamed from: u, reason: collision with root package name */
    public static final y4 f23914u;

    /* renamed from: u0, reason: collision with root package name */
    public static final y4 f23915u0;

    /* renamed from: u1, reason: collision with root package name */
    public static final y4 f23916u1;

    /* renamed from: u2, reason: collision with root package name */
    public static final y4 f23917u2;

    /* renamed from: u3, reason: collision with root package name */
    public static final y4 f23918u3;

    /* renamed from: u4, reason: collision with root package name */
    public static final y4 f23919u4;

    /* renamed from: u5, reason: collision with root package name */
    public static final y4 f23920u5;

    /* renamed from: u6, reason: collision with root package name */
    public static final y4 f23921u6;

    /* renamed from: v, reason: collision with root package name */
    public static final y4 f23922v;
    public static final y4 v0;
    public static final y4 v1;
    public static final y4 v2;

    /* renamed from: v3, reason: collision with root package name */
    public static final y4 f23923v3;

    /* renamed from: v4, reason: collision with root package name */
    public static final y4 f23924v4;

    /* renamed from: v5, reason: collision with root package name */
    public static final y4 f23925v5;

    /* renamed from: v6, reason: collision with root package name */
    public static final y4 f23926v6;

    /* renamed from: w, reason: collision with root package name */
    public static final y4 f23927w;

    /* renamed from: w0, reason: collision with root package name */
    public static final y4 f23928w0;

    /* renamed from: w1, reason: collision with root package name */
    public static final y4 f23929w1;
    public static final y4 w2;
    public static final y4 w3;

    /* renamed from: w4, reason: collision with root package name */
    public static final y4 f23930w4;

    /* renamed from: w5, reason: collision with root package name */
    public static final y4 f23931w5;

    /* renamed from: w6, reason: collision with root package name */
    public static final y4 f23932w6;

    /* renamed from: x, reason: collision with root package name */
    public static final y4 f23933x;

    /* renamed from: x0, reason: collision with root package name */
    public static final y4 f23934x0;

    /* renamed from: x1, reason: collision with root package name */
    public static final y4 f23935x1;

    /* renamed from: x2, reason: collision with root package name */
    public static final y4 f23936x2;

    /* renamed from: x3, reason: collision with root package name */
    public static final y4 f23937x3;

    /* renamed from: x4, reason: collision with root package name */
    public static final y4 f23938x4;
    public static final y4 x5;

    /* renamed from: x6, reason: collision with root package name */
    public static final y4 f23939x6;

    /* renamed from: y, reason: collision with root package name */
    public static final y4 f23940y;

    /* renamed from: y0, reason: collision with root package name */
    public static final y4 f23941y0;

    /* renamed from: y1, reason: collision with root package name */
    public static final y4 f23942y1;

    /* renamed from: y2, reason: collision with root package name */
    public static final y4 f23943y2;

    /* renamed from: y3, reason: collision with root package name */
    public static final y4 f23944y3;

    /* renamed from: y4, reason: collision with root package name */
    public static final y4 f23945y4;

    /* renamed from: y5, reason: collision with root package name */
    public static final y4 f23946y5;

    /* renamed from: y6, reason: collision with root package name */
    public static final y4 f23947y6;

    /* renamed from: z, reason: collision with root package name */
    public static final y4 f23948z;

    /* renamed from: z0, reason: collision with root package name */
    public static final y4 f23949z0;

    /* renamed from: z1, reason: collision with root package name */
    public static final y4 f23950z1;
    public static final y4 z2;

    /* renamed from: z3, reason: collision with root package name */
    public static final y4 f23951z3;

    /* renamed from: z4, reason: collision with root package name */
    public static final y4 f23952z4;

    /* renamed from: z5, reason: collision with root package name */
    public static final y4 f23953z5;

    /* renamed from: z6, reason: collision with root package name */
    public static final y4 f23954z6;

    /* renamed from: a, reason: collision with root package name */
    private final String f23955a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f23956b;

    /* renamed from: c, reason: collision with root package name */
    private static final List f23764c = Arrays.asList(Boolean.class, Float.class, Double.class, Integer.class, Long.class, String.class);

    /* renamed from: d, reason: collision with root package name */
    private static final Map f23773d = new HashMap(512);

    static {
        Boolean bool = Boolean.FALSE;
        f23780e = a("is_disabled", bool);
        f23788f = a("device_id", "");
        Boolean bool2 = Boolean.TRUE;
        f23796g = a("rss", bool2);
        f23805h = a("rssoitf", bool);
        f23814i = a("cpoitf", bool);
        f23822j = a("device_token", "");
        k = a("is_verbose_logging", bool);
        f23838l = a("sc", "");
        f23847m = a("sc2", "");
        f23856n = a("sc3", "");
        f23865o = a("server_installed_at", "");
        f23873p = a("clear_completion_callback_on_failure", bool);
        f23882q = a("sicd_ms", 0L);
        f23890r = a("logcat_max_line_size", 1000);
        f23898s = a("exception_handler_enabled", bool2);
        f23906t = a("md", "");
        f23914u = a("ps_atu", "");
        f23922v = a("lsu", bool);
        f23927w = a("tla_ms", -1L);
        f23933x = a("uactlac", bool);
        f23940y = a("vsk", bool);
        f23948z = a("avt_ms", -1L);
        f23550A = a("avrctr", "");
        f23558B = a("error_reporter_v1_sample_percent", 100);
        f23565C = a("health_events_reporter_v1_endpoint", "https://sts.applovin.com/v1/stats/sdk");
        f23572D = a("health_events_reporter_v1_event_level_sampling_percentages", "");
        Float fValueOf = Float.valueOf(-1.0f);
        f23580E = a("health_events_reporter_v1_ad_sampling_percent", fValueOf);
        f23588F = a("health_events_reporter_v1_error_sampling_percent", fValueOf);
        f23596G = a("health_events_reporter_v1_user_session_sampling_percent", fValueOf);
        f23604H = a("health_events_reporter_v1_sampling_percent", Float.valueOf(1.0f));
        f23612I = a("health_events_reporter_v1_batch_grouped_events", bool);
        f23619J = a("health_events_reporter_should_skip_al_events_in_max", bool);
        f23627K = a("health_events_reporter_valid_network_status_codes", "");
        L = a("health_events_reporter_include_cached_asset_info", bool);
        f23642M = a("health_events_reporter_include_html_source", bool);
        f23649N = a("stps", 2);
        f23657O = a("auxiliary_operations_threads", 1);
        f23664P = a("apsobt", bool2);
        f23672Q = a("tmtp", 1);
        f23680R = a("network_thread_count", 2);
        f23688S = a("ntp", 5);
        f23695T = a("ueq", bool);
        f23703U = a("coretc", 1);
        f23711V = a("cachetc", 1);
        f23719W = a("mtc", 1);
        f23727X = a("ttc", 1);
        f23735Y = a("otc", 1);
        f23743Z = a("uaeq", bool);
        f23750a0 = a("ah_cvc", bool2);
        f23757b0 = a("ah_cdde", bool2);
        f23765c0 = a("ah_crut", bool2);
        f23774d0 = a("ah_sae", bool2);
        f23781e0 = a("ah_mvcwges", -1);
        f23789f0 = a("init_omsdk", bool2);
        f23797g0 = a("omsdk_partner_name", "applovin");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f23806h0 = AbstractC1593a.e("ttc_max_click_duration_ms", 1L, timeUnit);
        f23815i0 = a("ttc_max_click_distance_dp", 10);
        AppLovinTouchToClickListener.ClickRecognitionState clickRecognitionState = AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN;
        f23823j0 = a("ttc_acrsv2a", Integer.valueOf(clickRecognitionState.ordinal()));
        f23831k0 = a("ttc_acrsnv", Integer.valueOf(clickRecognitionState.ordinal()));
        f23839l0 = a("ttc_acrsn", Integer.valueOf(clickRecognitionState.ordinal()));
        f23848m0 = a("ttc_edge_buffer_dp", 0);
        f23857n0 = a("whitelisted_postback_endpoints", "https://prod-a.applovin.com,https://rt.applovin.com/4.0/pix, https://rt.applvn.com/4.0/pix,https://ms.applovin.com/,https://ms.applvn.com/");
        f23866o0 = a("fetch_settings_endpoint", "https://ms.applovin.com/");
        f23874p0 = a("fetch_settings_backup_endpoint", "https://ms.applvn.com/");
        f23883q0 = a("adserver_endpoint", "https://a.applovin.com/");
        f23891r0 = a("adserver_backup_endpoint", "https://a.applvn.com/");
        f23899s0 = a("api_endpoint", "https://d.applovin.com/");
        f23907t0 = a("api_backup_endpoint", "https://d.applvn.com/");
        f23915u0 = a("event_tracking_endpoint_v2", "https://rt.applovin.com/");
        v0 = a("event_tracking_backup_endpoint_v2", "https://rt.applvn.com/");
        f23928w0 = a("eete", "https://b.applovin.com/");
        f23934x0 = a("eetbe", "");
        f23941y0 = a("webview_network_error_endpoints_to_report", "applovin.com,applvn.com");
        f23949z0 = a("vle", "");
        f23551A0 = a("vlbe", "");
        B0 = a("vlep", "");
        f23566C0 = a("token_type_prefixes_r", "4!");
        f23573D0 = a("token_type_prefixes_arj", "json_v3!");
        f23581E0 = a("top_level_events", "landing,paused,resumed,cf_start,tos_ok,gdpr_ok,ref,rdf,checkout,iap");
        f23589F0 = a("axon_events", AbstractC1593a.j(new CharSequence[]{"rewarded_ad_opportunity", "ad_view", "ad_clicked", "page_view", "view_item", "add_to_cart", "begin_checkout", "purchase", "add_payment_info", "remove_from_cart", "view_cart", "wishlist_updated", "refund_requested", "financial_deposit", "financial_withdraw", "financial_transaction", "level_start", "level_complete", "level_fail", "virtual_resource_transaction", "tutorial_complete", "energy_depleted", "use_prop", "game_shop_enter", "generate_lead", AppLovinEventTypes.USER_LOGGED_IN, "sign_up", AppLovinEventTypes.USER_EXECUTED_SEARCH, "product_review", "app_open", "account_verification_start", "account_verification_complete", "order", "account_linked", "friend_invite", "gift_transaction", "group_joined", "chat_sent", "post_view", "post_created", "subscribe", "start_trial"}));
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        f23597G0 = a("cache_file_ttl_seconds", Long.valueOf(timeUnit2.toSeconds(1L)));
        f23605H0 = a("cache_max_size_mb", -1);
        f23613I0 = a("precache_delimiters", ")]', ");
        f23620J0 = a("ad_resource_caching_enabled", bool2);
        f23628K0 = a("resource_cache_prefix", "https://vid.applovin.com/,https://stage-vid.applovin.com/,https://pdn.applovin.com/,https://stage-pdn.applovin.com/,https://img.applovin.com/,https://stage-img.applovin.com/,https://d.applovin.com/,https://assets.applovin.com/,https://stage-assets.applovin.com/,https://cdnjs.cloudflare.com/,http://vid.applovin.com/,http://stage-vid.applovin.com/,http://pdn.applovin.com/,http://stage-pdn.applovin.com/,http://img.applovin.com/,http://stage-img.applovin.com/,http://d.applovin.com/,http://assets.applovin.com/,http://stage-assets.applovin.com/,http://cdnjs.cloudflare.com/,http://u.appl.vn/,https://u.appl.vn/,https://res.applovin.com/,https://res1.applovin.com/,https://res2.applovin.com/,https://res3.applovin.com/,http://res.applovin.com/,http://res1.applovin.com/,http://res2.applovin.com/,http://res3.applovin.com/");
        f23635L0 = a("preserved_cached_assets", "sound_off.png,sound_on.png,closeOptOut.png,1381250003_28x28.png,zepto-1.1.3.min.js,jquery-2.1.1.min.js,jquery-1.9.1.min.js,jquery.knob.js");
        f23643M0 = a("resource_max_filename_length", 255);
        f23650N0 = a("ccrc", bool);
        f23658O0 = a("ustpfcrc", bool);
        f23665P0 = a("mcct", 3);
        f23673Q0 = a("mchct", 3);
        f23681R0 = a("dfirf", bool);
        f23689S0 = a("dfipf", bool);
        f23696T0 = a("dcrome", bool);
        f23704U0 = a("dcrobs", bool);
        f23712V0 = a("pcro", bool);
        f23720W0 = a("serfaad", bool);
        f23728X0 = a("mdafra", 1);
        f23736Y0 = a("ssch", bool2);
        Z0 = a("suaf", bool);
        f23751a1 = a("lfblrs", bool);
        f23758b1 = a("pawnrrm", bool);
        f23766c1 = a("ape", bool);
        f23775d1 = a("pafqi", bool);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        f23782e1 = AbstractC1593a.e("pae_ms", 5L, timeUnit3);
        f1 = AbstractC1593a.e("pamttl_ms", 5L, timeUnit);
        f23798g1 = a("saewib", bool);
        f23807h1 = a("fsae_ms", -1L);
        f23816i1 = a("raae", bool);
        f23824j1 = a("vr_retry_count_v1", 1);
        f23832k1 = a("cr_retry_count_v1", 1);
        f23840l1 = a("saru", bool);
        f23849m1 = a("spvtzians", bool);
        f23858n1 = a("close_button_touch_area", 0);
        f23867o1 = a("close_button_outside_touch_area", 0);
        f23875p1 = a("creative_debugger_enabled", bool2);
        f23884q1 = a("smdfhcdb", bool2);
        f23892r1 = a("use_background_view_for_ad_clicks", bool2);
        f23900s1 = AbstractC1593a.e("viewability_adview_imp_delay_ms", 1L, timeUnit);
        f23908t1 = a("viewability_adview_banner_min_width", Integer.valueOf(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE));
        f23916u1 = a("viewability_adview_banner_min_height", Integer.valueOf(AppLovinAdSize.BANNER.getHeight()));
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        v1 = a("viewability_adview_mrec_min_width", Integer.valueOf(maxAdFormat.getSize().getWidth()));
        f23929w1 = a("viewability_adview_mrec_min_height", Integer.valueOf(maxAdFormat.getSize().getHeight()));
        f23935x1 = a("viewability_adview_leader_min_width", 728);
        f23942y1 = a("viewability_adview_leader_min_height", Integer.valueOf(AppLovinAdSize.LEADER.getHeight()));
        f23950z1 = a("viewability_adview_native_min_width", 0);
        f23552A1 = a("viewability_adview_native_min_height", 0);
        f23559B1 = a("viewability_adview_min_alpha", Float.valueOf(10.0f));
        f23567C1 = AbstractC1593a.e("viewability_timer_min_visible_ms", 1L, timeUnit);
        f23574D1 = a("viewability_timer_interval_ms", 100L);
        f23582E1 = a("expandable_close_button_size", 27);
        f23590F1 = a("expandable_h_close_button_margin", 10);
        f23598G1 = a("expandable_t_close_button_margin", 10);
        f23606H1 = a("expandable_lhs_close_button", bool);
        f23614I1 = a("expandable_close_button_touch_area", 0);
        f23621J1 = a("forward_lifecycle_events_to_adview_webview", bool);
        f23629K1 = a("forward_in_app_browser_events_to_adview_webview", bool);
        f23636L1 = a("forward_external_redirect_events_to_adview_webview", bool);
        f23644M1 = a("forward_preload_events_to_adview_webview", bool);
        f23651N1 = a("iaad", bool);
        f23659O1 = AbstractC1593a.e("fullscreen_ad_pending_display_state_timeout_ms", 10L, timeUnit);
        f23666P1 = AbstractC1593a.e("fullscreen_ad_showing_state_timeout_ms", 2L, timeUnit3);
        f23674Q1 = a("lhs_close_button_video", bool);
        f23682R1 = a("close_button_right_margin_video", 4);
        f23690S1 = a("close_button_size_video", 30);
        f23697T1 = a("close_button_top_margin_video", 8);
        f23705U1 = a("video_countdown_clock_margin", 10);
        f23713V1 = a("video_countdown_clock_gravity", 83);
        f23721W1 = a("countdown_clock_size", 32);
        f23729X1 = a("countdown_clock_stroke_size", 4);
        f23737Y1 = a("countdown_clock_text_size", 28);
        f23744Z1 = a("draw_countdown_clock", bool2);
        f23752a2 = a("inter_display_delay", 200L);
        f23759b2 = a("maximum_close_button_delay_seconds", 999L);
        f23767c2 = a("respect_close_button", bool2);
        f23776d2 = a("lhs_skip_button", bool2);
        f23783e2 = a("mute_controls_enabled", bool);
        f23790f2 = a("allow_user_muting", bool2);
        f23799g2 = a("mute_videos", bool);
        f23808h2 = a("show_mute_by_default", bool);
        f23817i2 = a("mute_with_user_settings", bool2);
        f23825j2 = a("mute_button_size", 32);
        f23833k2 = a("mute_button_margin", 10);
        f23841l2 = a("mute_button_gravity", 85);
        f23850m2 = a("progress_bar_step", 25L);
        f23859n2 = a("progress_bar_scale", 10000);
        f23868o2 = a("progress_bar_vertical_padding", -8);
        f23876p2 = a("vs_buffer_indicator_size", 50);
        f23885q2 = a("video_zero_length_as_computed", bool);
        f23893r2 = a("set_poststitial_muted_initial_delay_ms", 500L);
        f23901s2 = a("fsahrpg", bool2);
        f23909t2 = a("eaafrwsoa", bool2);
        f23917u2 = a("postitial_progress_bar_step_ms", 25L);
        v2 = a("postitial_progress_bar_on_bottom", bool2);
        w2 = a("postitial_progress_bar_vertical_padding", -8);
        f23936x2 = a("postitial_progress_bar_scale", 10000);
        f23943y2 = a("fahosu", bool);
        z2 = a("system_insets_mask", Integer.valueOf(o7.f()));
        f23553A2 = a("system_bars_hide_list", "");
        f23560B2 = a("aarwdc", bool);
        f23568C2 = a("track_app_killed", bool);
        f23575D2 = a("track_ad_duration", bool);
        f23583E2 = AbstractC1593a.e("track_ad_duration_interval_ms", 1L, timeUnit);
        f23591F2 = a("simplified_app_killed_detection", bool);
        f23599G2 = AbstractC1593a.e("app_closed_time_threshold_for_app_killed_event_ms", 60L, timeUnit);
        f23607H2 = a("track_app_killed_during_mediated_ad", bool);
        f23615I2 = a("track_mediated_ad_duration_interval_ms", -1L);
        f23622J2 = AbstractC1593a.e("app_closed_time_threshold_for_app_killed_during_mediated_ad_event_ms", 60L, timeUnit);
        f23630K2 = a("nsuttcl", bool);
        f23637L2 = a("submit_postback_timeout", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f23645M2 = a("submit_postback_retries", 4);
        f23652N2 = a("max_postback_attempts", 3);
        f23660O2 = a("max_persisted_postbacks", 100);
        f23667P2 = a("submit_web_tracker_timeout", Integer.valueOf((int) timeUnit.toMillis(7L)));
        f23675Q2 = a("sossp", bool);
        f23683R2 = a("spp", bool2);
        f23691S2 = a("fire_native_ad_postbacks_from_webview", bool);
        f23698T2 = a("use_requests_for_native_ad_click_postbacks", bool);
        f23706U2 = a("preload_postback_webview", bool);
        f23714V2 = a("sejwp", bool);
        f23722W2 = AbstractC1593a.e("ejt_ms", 5L, timeUnit);
        f23730X2 = a("get_retry_delay_v1", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f23738Y2 = a("http_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f23745Z2 = a("http_socket_timeout", Integer.valueOf((int) timeUnit.toMillis(20L)));
        f23753a3 = a("fetch_ad_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f23760b3 = a("fetch_ad_retry_count_v1", 1);
        f23768c3 = a("faer", bool);
        d3 = a("faroae", bool);
        f23784e3 = a("submit_data_retry_count_v1", 1);
        f23791f3 = a("response_buffer_size", 16000);
        f23800g3 = a("fetch_basic_settings_connection_timeout_ms", Integer.valueOf((int) timeUnit.toMillis(10L)));
        f23809h3 = a("fetch_basic_settings_retry_count", 3);
        f23818i3 = a("fetch_basic_settings_on_reconnect", bool);
        f23826j3 = a("skip_fetch_basic_settings_if_not_connected", bool);
        f23834k3 = a("fetch_basic_settings_retry_delay_ms", Integer.valueOf((int) timeUnit.toMillis(2L)));
        f23842l3 = a("idflrwbe", bool);
        f23851m3 = a("falawpr", bool);
        f23860n3 = a("sort_query_parameters", bool);
        f23869o3 = AbstractC1593a.e("communicator_request_timeout_ms", 10L, timeUnit);
        f23877p3 = a("communicator_request_retry_count", 3);
        f23886q3 = AbstractC1593a.e("communicator_request_retry_delay_ms", 2L, timeUnit);
        f23894r3 = a("rfbsd_ms", -1L);
        f23902s3 = a("ehkpd_ms", 500L);
        f23910t3 = a("rironc", bool);
        f23918u3 = a("rroncbd", bool);
        f23923v3 = AbstractC1593a.e("wverc_ms", 5L, timeUnit);
        w3 = a("scrsifm", bool);
        f23937x3 = a("suohfrl", bool);
        f23944y3 = a("lvrc", 1);
        f23951z3 = a("session_tracking_cooldown_on_event_fire", bool2);
        f23554A3 = a("session_tracking_resumed_cooldown_minutes", 90L);
        f23561B3 = a("session_tracking_paused_cooldown_minutes", 90L);
        C3 = a("qq", bool);
        f23576D3 = a("qq1", bool2);
        f23584E3 = a("qq2", bool);
        f23592F3 = a("qq3", bool2);
        f23600G3 = a("qq4", bool2);
        f23608H3 = a("qq5", bool2);
        I3 = a("qq6", bool2);
        f23623J3 = a("qq7", bool2);
        f23631K3 = a("qq8", bool2);
        f23638L3 = a("qq9", bool);
        f23646M3 = a("qq10", bool2);
        f23653N3 = a("qq11", bool2);
        f23661O3 = a("qq12", bool2);
        f23668P3 = a("pui", bool2);
        f23676Q3 = a("plugin_version", "");
        f23684R3 = a("validate_admob_adapter_sdk_version", bool2);
        f23692S3 = a("ccbtbsic", bool);
        f23699T3 = a("hgn", bool2);
        f23707U3 = a("cso", bool2);
        f23715V3 = a("cfs", bool2);
        f23723W3 = a("cmi", bool2);
        f23731X3 = a("crat", bool2);
        f23739Y3 = a("cvs", bool2);
        f23746Z3 = a("caf", bool2);
        f23754a4 = a("cf", bool2);
        f23761b4 = a("cmtl", bool2);
        f23769c4 = a("cnr", bool2);
        f23777d4 = a("ccr", bool);
        f23785e4 = a("adr", bool2);
        f23792f4 = a("volume_normalization_factor", Float.valueOf(100.0f));
        f23801g4 = a("system_user_agent_collection_enabled", bool);
        f23810h4 = a("user_agent_collection_enabled", bool);
        f23819i4 = a("use_cached_user_agent_as_default", bool2);
        f23827j4 = a("collect_device_angle", bool2);
        f23835k4 = a("collect_device_movement", bool2);
        f23843l4 = a("movement_degradation", Float.valueOf(0.75f));
        f23852m4 = a("device_sensor_period_ms", 250);
        f23861n4 = a("mps", "");
        f23870o4 = a("mpsl", 3);
        f23878p4 = a("mpis", "com.applovin,dalvik,java,android,com.android");
        q4 = a("cmps", bool);
        f23895r4 = a("rmps", bool);
        f23903s4 = a("collect_webview_package_info", bool);
        f23911t4 = a("webview_package_names", "com.google.android.webview,com.android.webview");
        f23919u4 = a("collect_opengl_version", bool);
        f23924v4 = a("ncre", bool);
        f23930w4 = a("ncrs", "4,5,6,7,8,11,16");
        f23938x4 = a("ncrcs", bool);
        f23945y4 = a("ncrcai", bool2);
        f23952z4 = a("tmas", "");
        f23555A4 = a("tmasl", "");
        f23562B4 = a("tmahl", 1);
        f23569C4 = a("cin_v2", bool);
        f23577D4 = a("suia", bool2);
        f23585E4 = a("asicl", 1);
        f23593F4 = a("aeicl", 1);
        f23601G4 = a("aeisupf", bool);
        f23609H4 = a("aeistl", -1);
        f23616I4 = a("aeistsr", "5");
        f23624J4 = a("csbi", bool);
        f23632K4 = AbstractC1593a.e("btt_ms", 20L, timeUnit);
        f23639L4 = a("chs", bool);
        M4 = a("dltc", "");
        f23654N4 = a("umsm", bool);
        O4 = a("vast_image_html", "<html><head><style>html,body{height:100%;width:100%}body{background-image:url({SOURCE});background-repeat:no-repeat;background-size:contain;background-position:center;}a{position:absolute;top:0;bottom:0;left:0;right:0}</style></head><body><a href=\"applovin://com.applovin.sdk/adservice/track_click_now\"></a></body></html>");
        f23669P4 = a("vast_link_html", "<html><head><style>html,body,iframe{height:100%;width:100%;}body{margin:0}iframe{border:0;overflow:hidden;position:absolute}</style></head><body><iframe src={SOURCE} frameborder=0></iframe></body></html>");
        f23677Q4 = a("vast_max_response_length", 640000);
        f23685R4 = a("vast_max_wrapper_depth", 5);
        S4 = a("vast_unsupported_video_extensions", "ogv,flv");
        f23700T4 = a("vast_unsupported_video_types", "video/ogg,video/x-flv");
        f23708U4 = a("vast_validate_with_extension_if_no_video_type", bool2);
        f23716V4 = a("vast_wrapper_resolution_retry_count_v1", 1);
        f23724W4 = a("vast_wrapper_resolution_connection_timeout", Integer.valueOf((int) timeUnit.toMillis(30L)));
        f23732X4 = a("vast_industry_icon_max_size", 20);
        f23740Y4 = a("vast_industry_icon_margin", 12);
        f23747Z4 = a("vast_industry_icon_gravity", 85);
        a5 = a("vast_native_mute_button_size", 24);
        b5 = a("vast_native_play_pause_button_size", 24);
        f23770c5 = a("vast_native_video_widget_padding", 6);
        d5 = a("vast_native_video_widget_alpha", Float.valueOf(0.5f));
        f23786e5 = a("vast_native_video_widgets_enabled", bool2);
        f23793f5 = a("vast_replay_video_upon_completion", bool2);
        f23802g5 = a("vast_replay_icon_size", 64);
        f23811h5 = a("vcjfhr", bool);
        i5 = a("vcjfhrr", "(?:<|%3C)script[^>]*src=\"(https[^\"]*\\.js[^\"]*)\".*?(?:>|%3E)");
        f23828j5 = a("vpenfxr", "(<Error><!\\[CDATA\\[[^>]*><\\/Error>)");
        k5 = a("vast_fire_trackers_from_webview", bool);
        f23844l5 = a("ree", bool2);
        v4.a aVar = v4.a.DEFAULT;
        f23853m5 = a("ree_t", Integer.valueOf(aVar.b()));
        f23862n5 = a("btee", bool2);
        f23871o5 = a("btet", Integer.valueOf(aVar.b()));
        f23879p5 = a("reetoa", bool);
        f23887q5 = a("reet_msfs", Integer.valueOf(aVar.b()));
        v4.a aVar2 = v4.a.V2;
        f23896r5 = a("reet_msma", Integer.valueOf(aVar2.b()));
        f23904s5 = a("reet_msmd", Integer.valueOf(aVar.b()));
        f23912t5 = a("reet_asfp", Integer.valueOf(aVar.b()));
        f23920u5 = a("reet_asfg", Integer.valueOf(aVar.b()));
        f23925v5 = a("reet_aset", Integer.valueOf(aVar.b()));
        f23931w5 = a("reet_asaet", Integer.valueOf(aVar2.b()));
        x5 = a("reet_esdi", Integer.valueOf(aVar.b()));
        f23946y5 = a("reet_esrp", Integer.valueOf(aVar.b()));
        f23953z5 = a("reet_lv", Integer.valueOf(aVar2.b()));
        f23556A5 = a("apdra", bool);
        f23563B5 = a("apdrfs", bool);
        f23570C5 = a("apdrma", bool);
        f23578D5 = a("apdrmd", bool);
        f23586E5 = a("apdrfa", bool);
        f23594F5 = a("apdrev", bool);
        f23602G5 = a("apdrdi", bool);
        f23610H5 = a("apdrrp", bool);
        f23617I5 = a("server_timestamp_ms", 0L);
        f23625J5 = a("device_timestamp_ms", 0L);
        f23633K5 = a("gzip_min_length", 0);
        f23640L5 = a("gzip_encoding_default", bool);
        f23647M5 = a("fetch_settings_gzip", bool);
        f23655N5 = a("device_init_gzip", bool);
        f23662O5 = a("fetch_ad_gzip", bool);
        f23670P5 = a("event_tracking_gzip", bool);
        f23678Q5 = a("reward_postback_gzip", bool);
        f23686R5 = a("avg", bool);
        f23693S5 = a("handle_render_process_gone", bool2);
        f23701T5 = a("rworpg", bool2);
        f23709U5 = a("fdadaomr", bool2);
        f23717V5 = a("vfswccar", bool);
        f23725W5 = a("sparafad", bool);
        f23733X5 = a("fahctdmr", bool);
        f23741Y5 = a("mmcarc", bool);
        f23748Z5 = a("teorpc", bool);
        f23755a6 = a("set_webview_render_process_client", bool);
        f23762b6 = a("disable_webview_hardware_acceleration", bool);
        f23771c6 = a("anr_detection_enabled", bool);
        f23778d6 = a("anr_trigger_millis", 4000L);
        f23787e6 = a("anr_touch_millis", 3000L);
        f23794f6 = a("anr_check_millis", 3000L);
        f23803g6 = a("spadib", bool);
        f23812h6 = a("uobid", bool2);
        f23820i6 = a("bvde", bool);
        f23829j6 = a("bvdidm", 1000L);
        f23836k6 = a("bvdim", 4000L);
        f23845l6 = a("bvdrs", 10);
        f23854m6 = a("bvdct", 230);
        f23863n6 = a("bvdict", 3);
        f23872o6 = a("bvad", bool);
        f23880p6 = a("bvebb", bool2);
        f23888q6 = a("bvscb", bool2);
        f23897r6 = a("bvlmtb", -1L);
        f23905s6 = a("bvsafw", bool2);
        f23913t6 = a("bvdtr", 2);
        f23921u6 = a("bvdtc", 2);
        f23926v6 = a("aocve", bool);
        f23932w6 = a("dwvvb", bool);
        f23939x6 = a("stcpc", bool);
        f23947y6 = a("stcic", bool2);
        f23954z6 = a("qjscwwvl", bool);
        f23557A6 = a("web_contents_debugging_enabled", bool);
        f23564B6 = a("fcioiauiidb", bool2);
        f23571C6 = a("teouauiidb", bool2);
        f23579D6 = a("usc", bool);
        f23587E6 = a("should_apply_web_view_settings_to_web_view_button", bool);
        f23595F6 = a("should_use_cached_screen_size_for_foldable_devices", bool2);
        f23603G6 = a("should_persist_shared_prefs_with_background_commit", bool);
        f23611H6 = a("wvmldt", -1);
        f23618I6 = a("fmldt", -1);
        f23626J6 = a("csl", -1);
        f23634K6 = a("should_use_applovin_adaptive_sizing_formula", bool);
        f23641L6 = a("cdbpn", bool);
        f23648M6 = a("cavdi", bool);
        f23656N6 = a("pvdiaqp", bool);
        f23663O6 = a("sudbia", bool);
        f23671P6 = a("pbpn", "");
        f23679Q6 = a("nvelifapd", bool);
        f23687R6 = a("sufecfhrd", bool);
        f23694S6 = a("ignored_auto_redirect_schemes", AbstractC1593a.j(new CharSequence[]{"about", JsonStorageKeyNames.DATA_KEY, "file"}));
        f23702T6 = a("esowod", bool);
        f23710U6 = a("sswskan", bool);
        f23718V6 = a("config_consent_dialog_state", "unknown");
        f23726W6 = a("country_code", "");
        f23734X6 = a("approved_installers_for_package_name_override", "com.google.android.packageinstaller");
        f23742Y6 = a("consent_flow_doc_url", "https://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow");
        f23749Z6 = a("consent_flow_unity_doc_url", "https://support.axon.ai/en/max/unity/overview/terms-and-privacy-policy-flow");
        f23756a7 = a("cfadtml", 20);
        f23763b7 = a("cfgcsmrc", -1);
        f23772c7 = a("cfgcsrec", String.valueOf(3));
        f23779d7 = a("enable_custom_tabs_service", bool2);
        e7 = a("custom_tabs_chrome_package_names", "com.android.chrome");
        f23795f7 = a("custom_tabs_prefer_default_browser", bool2);
        f23804g7 = a("custom_tabs_animation_enabled", bool2);
        f23813h7 = a("custom_tabs_open_external_browser_on_failure", bool2);
        f23821i7 = a("ps_etr", bool);
        f23830j7 = AbstractC1593a.e("ps_tri_ms", 7L, timeUnit2);
        f23837k7 = a("ps_ftri_ms", -1L);
        f23846l7 = a("ps_sroftr", bool);
        f23855m7 = a("ps_sroftrof", bool);
        f23864n7 = a("gawvbu", "https://applovin.com");
        o7 = a("c_sticky_topics", "safedk_init,user_info");
        f23881p7 = a("communicator_enabled", bool2);
        f23889q7 = a("adse", bool2);
    }

    public y4(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No name specified");
        }
        if (obj == null) {
            throw new IllegalArgumentException("No default value specified");
        }
        this.f23955a = str;
        this.f23956b = obj;
    }

    public static Collection c() {
        return DesugarCollections.synchronizedCollection(f23773d.values());
    }

    public Object a() {
        return this.f23956b;
    }

    public String b() {
        return this.f23955a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof y4)) {
            return 0;
        }
        return this.f23955a.compareTo(((y4) obj).b());
    }

    public Object a(Object obj) {
        return this.f23956b.getClass().cast(obj);
    }

    public static y4 a(String str, Object obj) {
        if (obj != null) {
            if (f23764c.contains(obj.getClass())) {
                y4 y4Var = new y4(str, obj);
                Map map = f23773d;
                if (!map.containsKey(str)) {
                    map.put(str, y4Var);
                    return y4Var;
                }
                throw new IllegalArgumentException(R8.v.f("Setting has already been used: ", str));
            }
            throw new IllegalArgumentException("Unsupported value type: " + obj.getClass());
        }
        throw new IllegalArgumentException("No default value specified");
    }

    public static y4 a(String str) {
        return (y4) f23773d.get(str);
    }
}
