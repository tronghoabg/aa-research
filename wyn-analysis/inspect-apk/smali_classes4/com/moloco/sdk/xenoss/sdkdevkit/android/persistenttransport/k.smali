.class public final Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;
.super Llf/j;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public a:I

.field public b:I

.field public final synthetic c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:[B

.field public final synthetic f:LJd/f;


# direct methods
.method public constructor <init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;Ljava/lang/String;[BLJd/f;Ljf/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->d:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->e:[B

    .line 6
    .line 7
    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->f:LJd/f;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Llf/j;-><init>(ILjf/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljf/c;)Ljf/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;

    .line 2
    .line 3
    iget-object v3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->e:[B

    .line 4
    .line 5
    iget-object v4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->f:LJd/f;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->d:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;Ljava/lang/String;[BLJd/f;Ljf/c;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LEf/E;

    .line 2
    .line 3
    check-cast p2, Ljf/c;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->create(Ljava/lang/Object;Ljf/c;)Ljf/c;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;

    .line 10
    .line 11
    sget-object p2, Lef/C;->a:Lef/C;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    sget-object v6, Lkf/a;->a:Lkf/a;

    .line 4
    .line 5
    iget v0, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->b:I

    .line 6
    .line 7
    sget-object v7, Lef/C;->a:Lef/C;

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v9, 0x2

    .line 11
    const/4 v10, 0x1

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v10, :cond_1

    .line 15
    .line 16
    if-ne v0, v9, :cond_0

    .line 17
    .line 18
    iget v0, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->a:I

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_1
    iget v0, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->a:I

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move v11, v0

    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-static/range {p1 .. p1}, LFe/e;->U(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move v11, v8

    .line 46
    :goto_0
    const/4 v0, 0x5

    .line 47
    if-ge v11, v0, :cond_7

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-static {v0}, Lic/d;->e(Landroid/content/Context;)Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v1, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->c:Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;->b(Landroid/content/Context;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    sget-object v12, Lcom/moloco/sdk/internal/MolocoLogger;->INSTANCE:Lcom/moloco/sdk/internal/MolocoLogger;

    .line 64
    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v3, "Network available: "

    .line 68
    .line 69
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v3, " for non persistent request"

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v14

    .line 84
    const/4 v15, 0x0

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const-string v13, "NonPersistentRequest"

    .line 88
    .line 89
    const/16 v17, 0xc

    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    invoke-static/range {v12 .. v18}, Lcom/moloco/sdk/internal/MolocoLogger;->info$default(Lcom/moloco/sdk/internal/MolocoLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ZILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    iput v11, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->a:I

    .line 99
    .line 100
    iput v10, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->b:I

    .line 101
    .line 102
    iget-object v0, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->d:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v2, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->e:[B

    .line 105
    .line 106
    iget-object v3, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->f:LJd/f;

    .line 107
    .line 108
    const/4 v4, 0x0

    .line 109
    iget-object v1, v1, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/l;->a:Lwd/c;

    .line 110
    .line 111
    move-object/from16 v19, v1

    .line 112
    .line 113
    move-object v1, v0

    .line 114
    move-object/from16 v0, v19

    .line 115
    .line 116
    invoke-static/range {v0 .. v5}, LFe/c;->f(Lwd/c;Ljava/lang/String;[BLJd/f;Ljava/lang/String;Llf/c;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-ne v0, v6, :cond_3

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    goto :goto_2

    .line 130
    :cond_4
    move v0, v8

    .line 131
    :goto_2
    if-eqz v0, :cond_5

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_5
    iput v11, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->a:I

    .line 135
    .line 136
    iput v9, v5, Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/k;->b:I

    .line 137
    .line 138
    const-wide/16 v0, 0x2710

    .line 139
    .line 140
    invoke-static {v0, v1, v5}, LEf/H;->m(JLjf/c;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-ne v0, v6, :cond_6

    .line 145
    .line 146
    :goto_3
    return-object v6

    .line 147
    :cond_6
    move v0, v11

    .line 148
    :goto_4
    add-int/lit8 v11, v0, 0x1

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_7
    :goto_5
    return-object v7
.end method
