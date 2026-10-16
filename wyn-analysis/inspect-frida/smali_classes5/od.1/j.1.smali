.class public final Lod/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:Lpd/g;

.field public final b:Lod/D0;


# direct methods
.method public constructor <init>(Lpd/g;Lod/D0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lod/j;->a:Lpd/g;

    .line 5
    .line 6
    iput-object p2, p0, Lod/j;->b:Lod/D0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lod/j;->a:Lpd/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpd/g;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
