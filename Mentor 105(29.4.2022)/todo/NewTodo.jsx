import {
    ArrowRight,
    ArrowRightAlt,
    ArrowRightRounded,
    ChevronRight,
    Title,
} from "@mui/icons-material";
import { Box, Fab, Stack, TextField, Typography } from "@mui/material";
import React, { useState } from "react";

const NewTodo = ({ addTodo }) => {
    const [title, setTitle] = useState("")
    const [desc, setDesc] = useState("")
    console.log("title: ", title, "desc: ", desc);
    return (
        <Box>
            <Typography variant="h6" gutterBottom>
                Add new To-do
            </Typography>
            <Box display="flex" gap={2}>
                <Stack gap={2} flex={1}>
                    <TextField id="outlined-basic" label="Title" variant="outlined" value={title} onChange={(e) => setTitle(e.target.value)} />
                    <TextField
                        value={desc} onChange={(e) => setDesc(e.target.value)}
                        id="outlined-basic"
                        label="Description"
                        variant="outlined"
                        minRows={3}
                        multiline
                    />
                </Stack>
                <Stack justifyContent="flex-end">
                    <Fab color="secondary" aria-label="edit" onClick={() => addTodo(title, desc)}>
                        <ChevronRight />
                    </Fab>
                </Stack>
            </Box>
        </Box>
    );
};

export default NewTodo;
