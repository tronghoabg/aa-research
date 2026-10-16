.class public final LVa/C1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    check-cast p2, Lcom/applovin/impl/sdk/AppLovinBroadcastManager;

    .line 7
    .line 8
    const/4 p2, 0x1

    .line 9
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Lcom/applovin/impl/sdk/AppLovinBroadcastManager$Receiver;

    .line 14
    .line 15
    const/4 p2, 0x2

    .line 16
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Landroid/content/IntentFilter;

    .line 21
    .line 22
    sget p1, LVa/E1;->T:I

    .line 23
    .line 24
    add-int/lit8 p1, p1, 0x5b

    .line 25
    .line 26
    rem-int/lit16 v0, p1, 0x80

    .line 27
    .line 28
    sput v0, LVa/E1;->U:I

    .line 29
    .line 30
    rem-int/2addr p1, p2

    .line 31
    const/4 p2, 0x0

    .line 32
    invoke-static {}, LVa/E1;->M0()V

    .line 33
    .line 34
    .line 35
    throw p2
.end method
