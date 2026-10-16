.class public final synthetic Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ltf/p;

.field public final synthetic c:Ltf/p;

.field public final synthetic d:Ltf/p;

.field public final synthetic e:Ltf/p;

.field public final synthetic f:Ltf/p;

.field public final synthetic g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;

.field public final synthetic h:Ltf/p;

.field public final synthetic i:Ltf/p;

.field public final synthetic j:Ltf/p;

.field public final synthetic k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

.field public final synthetic l:Z


# direct methods
.method public synthetic constructor <init>(JLtf/p;Ltf/p;Ltf/p;Ltf/p;Ltf/p;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;Ltf/p;Ltf/p;Ltf/p;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->a:J

    iput-object p3, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->b:Ltf/p;

    iput-object p4, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->c:Ltf/p;

    iput-object p5, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->d:Ltf/p;

    iput-object p6, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->e:Ltf/p;

    iput-object p7, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->f:Ltf/p;

    iput-object p8, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;

    iput-object p9, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->h:Ltf/p;

    iput-object p10, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->i:Ltf/p;

    iput-object p11, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->j:Ltf/p;

    iput-object p12, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    iput-boolean p13, p0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->l:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    check-cast v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;

    .line 10
    .line 11
    const-string v2, "context"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "adViewModel"

    .line 17
    .line 18
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, Lu0/L;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Lu0/L;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    const v1, 0x7f0a01bd

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v1}, Landroid/view/View;->setId(I)V

    .line 30
    .line 31
    .line 32
    move-object v1, v2

    .line 33
    new-instance v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/S;

    .line 34
    .line 35
    iget-object v6, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->b:Ltf/p;

    .line 36
    .line 37
    iget-object v7, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->c:Ltf/p;

    .line 38
    .line 39
    iget-object v8, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->d:Ltf/p;

    .line 40
    .line 41
    iget-object v9, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->e:Ltf/p;

    .line 42
    .line 43
    iget-object v10, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->f:Ltf/p;

    .line 44
    .line 45
    iget-object v12, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->h:Ltf/p;

    .line 46
    .line 47
    iget-object v13, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->i:Ltf/p;

    .line 48
    .line 49
    iget-object v14, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->j:Ltf/p;

    .line 50
    .line 51
    iget-object v15, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->k:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;

    .line 52
    .line 53
    iget-boolean v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->l:Z

    .line 54
    .line 55
    move/from16 v16, v4

    .line 56
    .line 57
    iget-wide v4, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->a:J

    .line 58
    .line 59
    iget-object v11, v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/G;->g:Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;

    .line 60
    .line 61
    const/16 v17, 0x1

    .line 62
    .line 63
    invoke-direct/range {v2 .. v17}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/S;-><init>(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/ad/y;JLtf/p;Ltf/p;Ltf/p;Ltf/p;Ltf/p;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/render/compose/s;Ltf/p;Ltf/p;Ltf/p;Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/S;ZI)V

    .line 64
    .line 65
    .line 66
    new-instance v3, LV/d;

    .line 67
    .line 68
    const v4, -0x585ebea4

    .line 69
    .line 70
    .line 71
    const/4 v5, 0x1

    .line 72
    invoke-direct {v3, v4, v5, v2}, LV/d;-><init>(IZLef/e;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v3}, Lu0/L;->setContent(Ltf/p;)V

    .line 76
    .line 77
    .line 78
    return-object v1
.end method
