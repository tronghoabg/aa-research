.class public final Lz/c;
.super Lkotlin/jvm/internal/n;
.source "SourceFile"

# interfaces
.implements Ltf/p;


# instance fields
.field public final synthetic i:Z

.field public final synthetic j:LZ/k;

.field public final synthetic k:Lz/j;

.field public final synthetic l:Lz/k;

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:LV/d;

.field public final synthetic o:I


# direct methods
.method public constructor <init>(ZLZ/k;Lz/j;Lz/k;Ljava/lang/String;LV/d;I)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lz/c;->i:Z

    .line 2
    .line 3
    iput-object p2, p0, Lz/c;->j:LZ/k;

    .line 4
    .line 5
    iput-object p3, p0, Lz/c;->k:Lz/j;

    .line 6
    .line 7
    iput-object p4, p0, Lz/c;->l:Lz/k;

    .line 8
    .line 9
    iput-object p5, p0, Lz/c;->m:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p6, p0, Lz/c;->n:LV/d;

    .line 12
    .line 13
    iput p7, p0, Lz/c;->o:I

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
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, LN/o;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lz/c;->o:I

    .line 10
    .line 11
    or-int/lit8 v7, p1, 0x1

    .line 12
    .line 13
    iget-object v5, p0, Lz/c;->n:LV/d;

    .line 14
    .line 15
    iget-object v2, p0, Lz/c;->k:Lz/j;

    .line 16
    .line 17
    iget-object v3, p0, Lz/c;->l:Lz/k;

    .line 18
    .line 19
    iget-boolean v0, p0, Lz/c;->i:Z

    .line 20
    .line 21
    iget-object v1, p0, Lz/c;->j:LZ/k;

    .line 22
    .line 23
    iget-object v4, p0, Lz/c;->m:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static/range {v0 .. v7}, LFe/c;->b(ZLZ/k;Lz/j;Lz/k;Ljava/lang/String;LV/d;LN/o;I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lef/C;->a:Lef/C;

    .line 29
    .line 30
    return-object p1
.end method
