.class public final LVa/m3;
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
    move-result-object p1

    .line 6
    check-cast p1, Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;

    .line 7
    .line 8
    sget p2, LVa/w3;->U:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x45

    .line 11
    .line 12
    rem-int/lit16 p2, p2, 0x80

    .line 13
    .line 14
    sput p2, LVa/w3;->T:I

    .line 15
    .line 16
    invoke-static {p1}, LVa/w3;->E0(Lcom/unity3d/mediation/impression/LevelPlayImpressionDataListener;)V

    .line 17
    .line 18
    .line 19
    sget p1, LVa/w3;->U:I

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x17

    .line 22
    .line 23
    rem-int/lit16 p2, p1, 0x80

    .line 24
    .line 25
    sput p2, LVa/w3;->T:I

    .line 26
    .line 27
    rem-int/lit8 p1, p1, 0x2

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    return-object p2

    .line 33
    :cond_0
    throw p2
.end method
