.class public final LK/E;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:LZ/i;

.field public final synthetic j:Le0/E;

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:F

.field public final synthetic n:LV/d;

.field public final synthetic o:I


# direct methods
.method public constructor <init>(LZ/i;Le0/E;JJFLV/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/E;->i:LZ/i;

    .line 2
    .line 3
    iput-object p2, p0, LK/E;->j:Le0/E;

    .line 4
    .line 5
    iput-wide p3, p0, LK/E;->k:J

    .line 6
    .line 7
    iput-wide p5, p0, LK/E;->l:J

    .line 8
    .line 9
    iput p7, p0, LK/E;->m:F

    .line 10
    .line 11
    iput-object p8, p0, LK/E;->n:LV/d;

    .line 12
    .line 13
    iput p9, p0, LK/E;->o:I

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, LN/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, LK/E;->o:I

    .line 10
    .line 11
    or-int/lit8 v9, p1, 0x1

    .line 12
    .line 13
    iget-object v7, p0, LK/E;->n:LV/d;

    .line 14
    .line 15
    iget-wide v2, p0, LK/E;->k:J

    .line 16
    .line 17
    iget-wide v4, p0, LK/E;->l:J

    .line 18
    .line 19
    iget-object v0, p0, LK/E;->i:LZ/i;

    .line 20
    .line 21
    iget-object v1, p0, LK/E;->j:Le0/E;

    .line 22
    .line 23
    iget v6, p0, LK/E;->m:F

    .line 24
    .line 25
    invoke-static/range {v0 .. v9}, LFe/g;->e(LZ/i;Le0/E;JJFLV/d;LN/o;I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    return-object p1
.end method
