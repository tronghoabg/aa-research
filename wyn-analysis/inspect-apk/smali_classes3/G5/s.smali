.class public final LG5/s;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:LE5/T;


# direct methods
.method public constructor <init>(ILE5/T;Z)V
    .locals 1

    .line 1
    const-string v0, "AudioTrack write failed: "

    .line 2
    .line 3
    invoke-static {p1, v0}, Lka/n;->g(ILjava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iput-boolean p3, p0, LG5/s;->b:Z

    .line 11
    .line 12
    iput p1, p0, LG5/s;->a:I

    .line 13
    .line 14
    iput-object p2, p0, LG5/s;->c:LE5/T;

    .line 15
    .line 16
    return-void
.end method
