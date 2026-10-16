.class public final LVa/I5;
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
    check-cast p1, Lcom/smaato/sdk/video/vast/model/VastMediaFileScenario;

    .line 7
    .line 8
    sget p2, LVa/h6;->T:I

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x9

    .line 11
    .line 12
    rem-int/lit16 p2, p2, 0x80

    .line 13
    .line 14
    sput p2, LVa/h6;->U:I

    .line 15
    .line 16
    invoke-static {p1}, LVa/h6;->N0(Lcom/smaato/sdk/video/vast/model/VastMediaFileScenario;)Lcom/smaato/sdk/video/vast/model/VastScenarioCreativeData;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget p2, LVa/h6;->T:I

    .line 21
    .line 22
    add-int/lit8 p2, p2, 0x25

    .line 23
    .line 24
    rem-int/lit16 p2, p2, 0x80

    .line 25
    .line 26
    sput p2, LVa/h6;->U:I

    .line 27
    .line 28
    return-object p1
.end method
