package com.unity3d.services.core.domain.task;

import Ef.E;
import ef.C2515C;
import ef.C2530n;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import lf.AbstractC3471j;
import lf.InterfaceC3466e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEf/E;", "Lef/n;", "Lef/C;", "<anonymous>", "(LEf/E;)Lef/n;"}, k = 3, mv = {1, 8, 0})
@InterfaceC3466e(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {48, 53, 58, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class InitializeSDK$doWork$2 extends AbstractC3471j implements p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, InterfaceC3103c<? super InitializeSDK$doWork$2> interfaceC3103c) {
        super(2, interfaceC3103c);
        this.this$0 = initializeSDK;
    }

    @Override // lf.AbstractC3462a
    @NotNull
    public final InterfaceC3103c<C2515C> create(@Nullable Object obj, @NotNull InterfaceC3103c<?> interfaceC3103c) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, interfaceC3103c);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // tf.p
    @Nullable
    public final Object invoke(@NotNull E e7, @Nullable InterfaceC3103c<? super C2530n> interfaceC3103c) {
        return ((InitializeSDK$doWork$2) create(e7, interfaceC3103c)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x031c, code lost:
    
        if (r12 != r1) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a1 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ef A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0302 A[Catch: all -> 0x001d, CancellationException -> 0x0020, PHI: r0 r2
  0x0302: PHI (r0v46 java.lang.Object) = (r0v44 java.lang.Object), (r0v44 java.lang.Object), (r0v49 java.lang.Object) binds: [B:122:0x02ed, B:124:0x02ff, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x0302: PHI (r2v32 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r2v29 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v29 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v35 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:122:0x02ed, B:124:0x02ff, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d A[PHI: r0 r2 r4 r6 r12
  0x007d: PHI (r0v26 com.unity3d.services.core.configuration.Configuration) = 
  (r0v23 com.unity3d.services.core.configuration.Configuration)
  (r0v32 com.unity3d.services.core.configuration.Configuration)
 binds: [B:87:0x0214, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r2v18 java.lang.Object) = (r2v16 java.lang.Object), (r2v20 java.lang.Object) binds: [B:87:0x0214, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r4v17 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r4v14 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v19 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:87:0x0214, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r6v16 Ef.E) = (r6v13 Ef.E), (r6v18 Ef.E) binds: [B:87:0x0214, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r12v37 java.lang.Object) = (r12v36 java.lang.Object), (r12v50 java.lang.Object) binds: [B:87:0x0214, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[PHI: r0 r2 r4 r12
  0x00cc: PHI (r0v9 com.unity3d.services.core.configuration.Configuration) = 
  (r0v6 com.unity3d.services.core.configuration.Configuration)
  (r0v15 com.unity3d.services.core.configuration.Configuration)
 binds: [B:66:0x018c, B:41:0x00c5] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r2v8 com.unity3d.services.core.domain.task.InitializeSDK) = (r2v5 com.unity3d.services.core.domain.task.InitializeSDK), (r2v11 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:66:0x018c, B:41:0x00c5] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r4v5 Ef.E) = (r4v2 Ef.E), (r4v9 Ef.E) binds: [B:66:0x018c, B:41:0x00c5] A[DONT_GENERATE, DONT_INLINE]
  0x00cc: PHI (r12v22 java.lang.Object) = (r12v18 java.lang.Object), (r12v26 java.lang.Object) binds: [B:66:0x018c, B:41:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133 A[Catch: all -> 0x001d, CancellationException -> 0x0020, PHI: r2 r6
  0x0133: PHI (r2v2 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r2v1 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v1 com.unity3d.services.core.domain.task.InitializeSDK)
  (r2v4 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:51:0x0110, B:53:0x012f, B:47:0x00e9] A[DONT_GENERATE, DONT_INLINE]
  0x0133: PHI (r6v2 Ef.E) = (r6v1 Ef.E), (r6v1 Ef.E), (r6v4 Ef.E) binds: [B:51:0x0110, B:53:0x012f, B:47:0x00e9] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0194 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b1 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bd A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01df A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6 A[Catch: all -> 0x001d, CancellationException -> 0x0020, PHI: r0 r2 r4 r6
  0x01f6: PHI (r0v23 com.unity3d.services.core.configuration.Configuration) = 
  (r0v20 com.unity3d.services.core.configuration.Configuration)
  (r0v20 com.unity3d.services.core.configuration.Configuration)
  (r0v25 com.unity3d.services.core.configuration.Configuration)
 binds: [B:82:0x01dd, B:84:0x01f2, B:32:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r2v16 java.lang.Object) = (r2v12 java.lang.Object), (r2v12 java.lang.Object), (r2v17 java.lang.Object) binds: [B:82:0x01dd, B:84:0x01f2, B:32:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r4v14 com.unity3d.services.core.domain.task.InitializeSDK) = 
  (r4v10 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v10 com.unity3d.services.core.domain.task.InitializeSDK)
  (r4v16 com.unity3d.services.core.domain.task.InitializeSDK)
 binds: [B:82:0x01dd, B:84:0x01f2, B:32:0x0090] A[DONT_GENERATE, DONT_INLINE]
  0x01f6: PHI (r6v13 Ef.E) = (r6v11 Ef.E), (r6v11 Ef.E), (r6v15 Ef.E) binds: [B:82:0x01dd, B:84:0x01f2, B:32:0x0090] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021c A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023c A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0248 A[Catch: all -> 0x001d, CancellationException -> 0x0020, TryCatch #2 {CancellationException -> 0x0020, all -> 0x001d, blocks: (B:6:0x0014, B:129:0x031f, B:13:0x0029, B:126:0x0302, B:16:0x0034, B:121:0x02eb, B:123:0x02ef, B:19:0x0045, B:114:0x02b6, B:117:0x02c7, B:22:0x0050, B:109:0x029d, B:111:0x02a1, B:26:0x005e, B:94:0x0236, B:96:0x023c, B:97:0x0247, B:29:0x0076, B:89:0x0218, B:91:0x021c, B:98:0x0248, B:100:0x0253, B:102:0x025d, B:104:0x0263, B:105:0x0277, B:115:0x02c1, B:130:0x0325, B:131:0x032c, B:32:0x0090, B:86:0x01f6, B:35:0x00a1, B:81:0x01db, B:83:0x01df, B:38:0x00af, B:73:0x01ab, B:75:0x01b1, B:76:0x01bc, B:41:0x00c5, B:68:0x0190, B:70:0x0194, B:77:0x01bd, B:44:0x00d9, B:59:0x0150, B:61:0x0156, B:62:0x0169, B:65:0x0173, B:47:0x00e9, B:55:0x0133, B:50:0x00f7, B:52:0x0112), top: B:142:0x0009 }] */
    @Override // lf.AbstractC3462a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
