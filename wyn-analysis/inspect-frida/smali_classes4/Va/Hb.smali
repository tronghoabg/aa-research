.class public final LVa/Hb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitListener;


# instance fields
.field public synthetic a:LVa/Ga;


# virtual methods
.method public final adQualitySdkInitFailed(Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LVa/Hb;->a:LVa/Ga;

    .line 2
    .line 3
    iget-object v0, v0, LVa/Ga;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LVa/Kb;

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, LVa/Kb;->x(LVa/Kb;Lcom/ironsource/adqualitysdk/sdk/ISAdQualityInitError;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final adQualitySdkInitSuccess()V
    .locals 3

    .line 1
    iget-object v0, p0, LVa/Hb;->a:LVa/Ga;

    .line 2
    .line 3
    iget-object v0, v0, LVa/Ga;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LVa/Kb;

    .line 6
    .line 7
    sget v1, LVa/Kb;->x:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x57

    .line 10
    .line 11
    rem-int/lit16 v1, v1, 0x80

    .line 12
    .line 13
    sput v1, LVa/Kb;->w:I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance v1, LVa/v;

    .line 19
    .line 20
    const/16 v2, 0x18

    .line 21
    .line 22
    invoke-direct {v1, v2}, LVa/v;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object v0, v1, LVa/v;->d:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v1}, LVa/Cb;->g(LVa/Ba;)V

    .line 28
    .line 29
    .line 30
    sget v0, LVa/Kb;->x:I

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x6f

    .line 33
    .line 34
    rem-int/lit16 v1, v0, 0x80

    .line 35
    .line 36
    sput v1, LVa/Kb;->w:I

    .line 37
    .line 38
    rem-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    const/16 v0, 0x10

    .line 43
    .line 44
    div-int/lit8 v0, v0, 0x0

    .line 45
    .line 46
    :cond_0
    return-void
.end method
