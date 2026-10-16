.class public final LVa/g3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVa/Y0;


# virtual methods
.method public final a(Ljava/util/ArrayList;LVa/Ra;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 p2, 0x0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lcom/five_corp/ad/FiveAdInterface;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/five_corp/ad/FiveAdLoadListener;

    .line 14
    .line 15
    sget v1, LVa/l3;->S:I

    .line 16
    .line 17
    add-int/lit8 v1, v1, 0xf

    .line 18
    .line 19
    rem-int/lit16 v2, v1, 0x80

    .line 20
    .line 21
    sput v2, LVa/l3;->T:I

    .line 22
    .line 23
    rem-int/lit8 v1, v1, 0x2

    .line 24
    .line 25
    const/16 v2, 0xd

    .line 26
    .line 27
    invoke-static {v0, p1}, LVa/l3;->N0(Lcom/five_corp/ad/FiveAdInterface;Lcom/five_corp/ad/FiveAdLoadListener;)V

    .line 28
    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    div-int/lit8 p1, v2, 0x0

    .line 33
    .line 34
    :cond_0
    sget p1, LVa/l3;->T:I

    .line 35
    .line 36
    add-int/2addr p1, v2

    .line 37
    rem-int/lit16 p1, p1, 0x80

    .line 38
    .line 39
    sput p1, LVa/l3;->S:I

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    return-object p1
.end method
