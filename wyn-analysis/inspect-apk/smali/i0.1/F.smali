.class public final Li0/F;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:F

.field public final synthetic k:F

.field public final synthetic l:F

.field public final synthetic m:F

.field public final synthetic n:F

.field public final synthetic o:F

.field public final synthetic p:F

.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:LV/d;


# direct methods
.method public constructor <init>(Ljava/lang/String;FFFFFFFLjava/util/List;LV/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Li0/F;->i:Ljava/lang/String;

    .line 2
    .line 3
    iput p2, p0, Li0/F;->j:F

    .line 4
    .line 5
    iput p3, p0, Li0/F;->k:F

    .line 6
    .line 7
    iput p4, p0, Li0/F;->l:F

    .line 8
    .line 9
    iput p5, p0, Li0/F;->m:F

    .line 10
    .line 11
    iput p6, p0, Li0/F;->n:F

    .line 12
    .line 13
    iput p7, p0, Li0/F;->o:F

    .line 14
    .line 15
    iput p8, p0, Li0/F;->p:F

    .line 16
    .line 17
    iput-object p9, p0, Li0/F;->q:Ljava/util/List;

    .line 18
    .line 19
    iput-object p10, p0, Li0/F;->r:LV/d;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, LN/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget-object v9, p0, Li0/F;->r:LV/d;

    .line 10
    .line 11
    iget v6, p0, Li0/F;->o:F

    .line 12
    .line 13
    iget v7, p0, Li0/F;->p:F

    .line 14
    .line 15
    iget-object v0, p0, Li0/F;->i:Ljava/lang/String;

    .line 16
    .line 17
    iget v1, p0, Li0/F;->j:F

    .line 18
    .line 19
    iget v2, p0, Li0/F;->k:F

    .line 20
    .line 21
    iget v3, p0, Li0/F;->l:F

    .line 22
    .line 23
    iget v4, p0, Li0/F;->m:F

    .line 24
    .line 25
    iget v5, p0, Li0/F;->n:F

    .line 26
    .line 27
    iget-object v8, p0, Li0/F;->q:Ljava/util/List;

    .line 28
    .line 29
    const v11, 0x38000001

    .line 30
    .line 31
    .line 32
    invoke-static/range {v0 .. v11}, Lgc/b;->a(Ljava/lang/String;FFFFFFFLjava/util/List;LV/d;LN/o;I)V

    .line 33
    .line 34
    .line 35
    sget-object p1, Lef/C;->a:Lef/C;

    .line 36
    .line 37
    return-object p1
.end method
