.class public final LVa/D1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 0

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
    move-result-object p1

    .line 13
    check-cast p1, Lcom/applovin/impl/sdk/AppLovinBroadcastManager$Receiver;

    .line 14
    .line 15
    sget p1, LVa/E1;->U:I

    .line 16
    .line 17
    add-int/lit8 p1, p1, 0x33

    .line 18
    .line 19
    rem-int/lit16 p2, p1, 0x80

    .line 20
    .line 21
    sput p2, LVa/E1;->T:I

    .line 22
    .line 23
    rem-int/lit8 p1, p1, 0x2

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    new-instance p1, Ljava/lang/IncompatibleClassChangeError;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/IncompatibleClassChangeError;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/lang/IncompatibleClassChangeError;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1
.end method
