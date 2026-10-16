package com.waze.copilot.presentation;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f23115a;

    public f(n nVar) {
        this.f23115a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[Catch: Exception -> 0x0085, TRY_LEAVE, TryCatch #0 {Exception -> 0x0085, blocks: (B:3:0x001d, B:16:0x006e, B:6:0x002c, B:8:0x0042, B:9:0x0049, B:11:0x0056, B:12:0x005d, B:14:0x0068), top: B:23:0x001d }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void log(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to parse json request from web, json: "
            java.lang.String r1 = "requestJson"
            h.g.b.x.f(r9, r1)
            java.lang.String r1 = "log called by web app, request json: "
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r1 = r1.concat(r2)
            com.waze.copilot.presentation.n r2 = r8.f23115a
            com.waze.shared_infra.i.e r3 = com.waze.copilot.presentation.n.f(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.a(r1)
            r1 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L85
            r3.<init>(r9)     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = "data"
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch: java.lang.Exception -> L85
            if (r3 != 0) goto L2c
        L2a:
            r3 = r1
            goto L6c
        L2c:
            java.lang.Class<com.waze.copilot.presentation.LogRequest> r4 = com.waze.copilot.presentation.LogRequest.class
            int r5 = h.g.b.ar.f48106a     // Catch: java.lang.Exception -> L85
            h.g.b.m r5 = new h.g.b.m     // Catch: java.lang.Exception -> L85
            r5.<init>(r4)     // Catch: java.lang.Exception -> L85
            java.lang.Class<com.waze.copilot.presentation.UpdateCoPilotSelectionRequest> r6 = com.waze.copilot.presentation.UpdateCoPilotSelectionRequest.class
            h.g.b.m r7 = new h.g.b.m     // Catch: java.lang.Exception -> L85
            r7.<init>(r6)     // Catch: java.lang.Exception -> L85
            boolean r6 = h.g.b.x.n(r5, r7)     // Catch: java.lang.Exception -> L85
            if (r6 == 0) goto L49
            com.waze.calendar.b.c(r3)     // Catch: java.lang.Exception -> L85
            r3 = r1
            com.waze.copilot.presentation.LogRequest r3 = (com.waze.copilot.presentation.LogRequest) r3     // Catch: java.lang.Exception -> L85
            goto L2a
        L49:
            java.lang.Class<com.waze.copilot.presentation.UpdateWebviewHeaderRequest> r6 = com.waze.copilot.presentation.UpdateWebviewHeaderRequest.class
            h.g.b.m r7 = new h.g.b.m     // Catch: java.lang.Exception -> L85
            r7.<init>(r6)     // Catch: java.lang.Exception -> L85
            boolean r6 = h.g.b.x.n(r5, r7)     // Catch: java.lang.Exception -> L85
            if (r6 == 0) goto L5d
            com.waze.calendar.b.d(r3)     // Catch: java.lang.Exception -> L85
            r3 = r1
            com.waze.copilot.presentation.LogRequest r3 = (com.waze.copilot.presentation.LogRequest) r3     // Catch: java.lang.Exception -> L85
            goto L2a
        L5d:
            h.g.b.m r6 = new h.g.b.m     // Catch: java.lang.Exception -> L85
            r6.<init>(r4)     // Catch: java.lang.Exception -> L85
            boolean r4 = h.g.b.x.n(r5, r6)     // Catch: java.lang.Exception -> L85
            if (r4 == 0) goto L2a
            com.waze.copilot.presentation.LogRequest r3 = com.waze.calendar.b.b(r3)     // Catch: java.lang.Exception -> L85
        L6c:
            if (r3 != 0) goto L83
            com.waze.shared_infra.i.e r2 = com.waze.copilot.presentation.n.f(r2)     // Catch: java.lang.Exception -> L85
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L85
            r4.<init>(r0)     // Catch: java.lang.Exception -> L85
            r4.append(r9)     // Catch: java.lang.Exception -> L85
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L85
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> L85
            r2.b(r4)     // Catch: java.lang.Exception -> L85
        L83:
            r1 = r3
            goto L99
        L85:
            r2 = move-exception
            com.waze.copilot.presentation.n r3 = r8.f23115a
            java.lang.String r9 = java.lang.String.valueOf(r9)
            com.waze.shared_infra.i.e r3 = com.waze.copilot.presentation.n.f(r3)
            java.lang.String r9 = r0.concat(r9)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3.c(r9, r2)
        L99:
            if (r1 == 0) goto La4
            com.waze.copilot.presentation.n r8 = r8.f23115a
            com.waze.copilot.presentation.CopilotMarketplaceViewModel r8 = com.waze.copilot.presentation.n.e(r8)
            r8.r(r1)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.presentation.f.log(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[Catch: Exception -> 0x008b, TRY_LEAVE, TryCatch #0 {Exception -> 0x008b, blocks: (B:3:0x0022, B:16:0x0074, B:6:0x0031, B:8:0x0045, B:9:0x004a, B:11:0x0057, B:12:0x005e, B:14:0x006b), top: B:22:0x0022 }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateCoPilotSelection(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to parse json request from web, json: "
            java.lang.String r1 = "requestJson"
            h.g.b.x.f(r9, r1)
            java.lang.String r1 = "updateCoPilotSelection called by web app, request json: "
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r1 = r1.concat(r2)
            com.waze.copilot.presentation.n r2 = r8.f23115a
            com.waze.shared_infra.i.e r3 = com.waze.copilot.presentation.n.f(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.a(r1)
            com.waze.copilot.presentation.CopilotMarketplaceViewModel r1 = com.waze.copilot.presentation.n.e(r2)
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8b
            r4.<init>(r9)     // Catch: java.lang.Exception -> L8b
            java.lang.String r5 = "data"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Exception -> L8b
            if (r4 != 0) goto L31
        L2f:
            r4 = r3
            goto L72
        L31:
            java.lang.Class<com.waze.copilot.presentation.UpdateCoPilotSelectionRequest> r5 = com.waze.copilot.presentation.UpdateCoPilotSelectionRequest.class
            int r6 = h.g.b.ar.f48106a     // Catch: java.lang.Exception -> L8b
            h.g.b.m r6 = new h.g.b.m     // Catch: java.lang.Exception -> L8b
            r6.<init>(r5)     // Catch: java.lang.Exception -> L8b
            h.g.b.m r7 = new h.g.b.m     // Catch: java.lang.Exception -> L8b
            r7.<init>(r5)     // Catch: java.lang.Exception -> L8b
            boolean r5 = h.g.b.x.n(r6, r7)     // Catch: java.lang.Exception -> L8b
            if (r5 == 0) goto L4a
            com.waze.copilot.presentation.UpdateCoPilotSelectionRequest r4 = com.waze.calendar.b.c(r4)     // Catch: java.lang.Exception -> L8b
            goto L72
        L4a:
            java.lang.Class<com.waze.copilot.presentation.UpdateWebviewHeaderRequest> r5 = com.waze.copilot.presentation.UpdateWebviewHeaderRequest.class
            h.g.b.m r7 = new h.g.b.m     // Catch: java.lang.Exception -> L8b
            r7.<init>(r5)     // Catch: java.lang.Exception -> L8b
            boolean r5 = h.g.b.x.n(r6, r7)     // Catch: java.lang.Exception -> L8b
            if (r5 == 0) goto L5e
            com.waze.calendar.b.d(r4)     // Catch: java.lang.Exception -> L8b
            r4 = r3
            com.waze.copilot.presentation.UpdateCoPilotSelectionRequest r4 = (com.waze.copilot.presentation.UpdateCoPilotSelectionRequest) r4     // Catch: java.lang.Exception -> L8b
            goto L2f
        L5e:
            java.lang.Class<com.waze.copilot.presentation.LogRequest> r5 = com.waze.copilot.presentation.LogRequest.class
            h.g.b.m r7 = new h.g.b.m     // Catch: java.lang.Exception -> L8b
            r7.<init>(r5)     // Catch: java.lang.Exception -> L8b
            boolean r5 = h.g.b.x.n(r6, r7)     // Catch: java.lang.Exception -> L8b
            if (r5 == 0) goto L2f
            com.waze.calendar.b.b(r4)     // Catch: java.lang.Exception -> L8b
            r4 = r3
            com.waze.copilot.presentation.UpdateCoPilotSelectionRequest r4 = (com.waze.copilot.presentation.UpdateCoPilotSelectionRequest) r4     // Catch: java.lang.Exception -> L8b
            goto L2f
        L72:
            if (r4 != 0) goto L89
            com.waze.shared_infra.i.e r2 = com.waze.copilot.presentation.n.f(r2)     // Catch: java.lang.Exception -> L8b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8b
            r5.<init>(r0)     // Catch: java.lang.Exception -> L8b
            r5.append(r9)     // Catch: java.lang.Exception -> L8b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L8b
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> L8b
            r2.b(r5)     // Catch: java.lang.Exception -> L8b
        L89:
            r3 = r4
            goto L9f
        L8b:
            r2 = move-exception
            com.waze.copilot.presentation.n r8 = r8.f23115a
            java.lang.String r9 = java.lang.String.valueOf(r9)
            com.waze.shared_infra.i.e r8 = com.waze.copilot.presentation.n.f(r8)
            java.lang.String r9 = r0.concat(r9)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r8.c(r9, r2)
        L9f:
            r1.t(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.presentation.f.updateCoPilotSelection(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070 A[Catch: Exception -> 0x0087, TRY_LEAVE, TryCatch #0 {Exception -> 0x0087, blocks: (B:3:0x001e, B:16:0x0070, B:6:0x002d, B:8:0x0043, B:9:0x004a, B:11:0x0055, B:12:0x005a, B:14:0x0067), top: B:23:0x001e }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateWebviewHeader(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to parse json request from web, json: "
            java.lang.String r1 = "requestJson"
            h.g.b.x.f(r9, r1)
            java.lang.String r1 = "updateWebviewHeader called by web app, request json: "
            java.lang.String r2 = java.lang.String.valueOf(r9)
            java.lang.String r1 = r1.concat(r2)
            com.waze.copilot.presentation.n r2 = r8.f23115a
            com.waze.shared_infra.i.e r3 = com.waze.copilot.presentation.n.f(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.a(r1)
            r1 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L87
            r3.<init>(r9)     // Catch: java.lang.Exception -> L87
            java.lang.String r4 = "data"
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch: java.lang.Exception -> L87
            if (r3 != 0) goto L2d
        L2b:
            r3 = r1
            goto L6e
        L2d:
            java.lang.Class<com.waze.copilot.presentation.UpdateWebviewHeaderRequest> r4 = com.waze.copilot.presentation.UpdateWebviewHeaderRequest.class
            int r5 = h.g.b.ar.f48106a     // Catch: java.lang.Exception -> L87
            h.g.b.m r5 = new h.g.b.m     // Catch: java.lang.Exception -> L87
            r5.<init>(r4)     // Catch: java.lang.Exception -> L87
            java.lang.Class<com.waze.copilot.presentation.UpdateCoPilotSelectionRequest> r6 = com.waze.copilot.presentation.UpdateCoPilotSelectionRequest.class
            h.g.b.m r7 = new h.g.b.m     // Catch: java.lang.Exception -> L87
            r7.<init>(r6)     // Catch: java.lang.Exception -> L87
            boolean r6 = h.g.b.x.n(r5, r7)     // Catch: java.lang.Exception -> L87
            if (r6 == 0) goto L4a
            com.waze.calendar.b.c(r3)     // Catch: java.lang.Exception -> L87
            r3 = r1
            com.waze.copilot.presentation.UpdateWebviewHeaderRequest r3 = (com.waze.copilot.presentation.UpdateWebviewHeaderRequest) r3     // Catch: java.lang.Exception -> L87
            goto L2b
        L4a:
            h.g.b.m r6 = new h.g.b.m     // Catch: java.lang.Exception -> L87
            r6.<init>(r4)     // Catch: java.lang.Exception -> L87
            boolean r4 = h.g.b.x.n(r5, r6)     // Catch: java.lang.Exception -> L87
            if (r4 == 0) goto L5a
            com.waze.copilot.presentation.UpdateWebviewHeaderRequest r3 = com.waze.calendar.b.d(r3)     // Catch: java.lang.Exception -> L87
            goto L6e
        L5a:
            java.lang.Class<com.waze.copilot.presentation.LogRequest> r4 = com.waze.copilot.presentation.LogRequest.class
            h.g.b.m r6 = new h.g.b.m     // Catch: java.lang.Exception -> L87
            r6.<init>(r4)     // Catch: java.lang.Exception -> L87
            boolean r4 = h.g.b.x.n(r5, r6)     // Catch: java.lang.Exception -> L87
            if (r4 == 0) goto L2b
            com.waze.calendar.b.b(r3)     // Catch: java.lang.Exception -> L87
            r3 = r1
            com.waze.copilot.presentation.UpdateWebviewHeaderRequest r3 = (com.waze.copilot.presentation.UpdateWebviewHeaderRequest) r3     // Catch: java.lang.Exception -> L87
            goto L2b
        L6e:
            if (r3 != 0) goto L85
            com.waze.shared_infra.i.e r2 = com.waze.copilot.presentation.n.f(r2)     // Catch: java.lang.Exception -> L87
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L87
            r4.<init>(r0)     // Catch: java.lang.Exception -> L87
            r4.append(r9)     // Catch: java.lang.Exception -> L87
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L87
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> L87
            r2.b(r4)     // Catch: java.lang.Exception -> L87
        L85:
            r1 = r3
            goto L9b
        L87:
            r2 = move-exception
            com.waze.copilot.presentation.n r3 = r8.f23115a
            java.lang.String r9 = java.lang.String.valueOf(r9)
            com.waze.shared_infra.i.e r3 = com.waze.copilot.presentation.n.f(r3)
            java.lang.String r9 = r0.concat(r9)
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            r3.c(r9, r2)
        L9b:
            if (r1 == 0) goto La6
            com.waze.copilot.presentation.n r8 = r8.f23115a
            com.waze.copilot.presentation.CopilotMarketplaceViewModel r8 = com.waze.copilot.presentation.n.e(r8)
            r8.u(r1)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.copilot.presentation.f.updateWebviewHeader(java.lang.String):void");
    }
}
