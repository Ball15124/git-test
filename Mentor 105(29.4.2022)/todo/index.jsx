import {
    Box,
    Container,
    Divider,
    Button
} from '@mui/material';
import React, { useState } from 'react';
import NewTodo from './NewTodo.jsx';
import TodoItem from './TodoItem.jsx';

const defaultTodos = [
    {
        id: 1,
        title: 'Attend CSC105 mentoring class',
        desc: 'P\'Float and P\'Thun still waiting',
        date: new Date(),
    },
    {
        id: 2,
        title: 'Learn React.js',
        desc: 'Please learn from somewhere else other than outdated Coursera',
        date: new Date(),
    },
    {
        id: 3,
        title: 'Find some inspirations',
        desc: 'Let start by browsing website design you interested, maybe from Pinterest or somewhere else, and find out the way you could achieve web development on these design.',
        date: new Date(),
    },
    {
        id: 4,
        title: 'Go out of comfort zone',
        desc: 'Not to stick with T.Chonlameth\'s assignment, go achieve the web development on your own. No need to care about score, you can gain experience from your own experimental. And you\'ll be found your own way to be a great web developer.',
        date: new Date(),
    },
];

const Todo = () => {
    {
        /* TODO: Use empty array as default todo */
    }
    const [todos, setTodos] = useState(defaultTodos);
    function deleteTodo() {
        setTodos(
            todos.filter((el, index) => {
                return index != todos.length - 1;
            })
        );
    }
    const addTodo = (title, desc) => {
        setTodos(
            [{ title, desc, id: new Date(), date: new Date() }, ...todos]
        )
    }


    return (
        <Container>
            <Box minHeight="calc(100vh - 620px)" paddingY={4}>
                <NewTodo addTodo={addTodo} />
                <Divider sx={{ marginY: 2 }} />
                {/* Use grid (see https://mui.com/material-ui/react-grid/) to map elements */}
                {todos.map((el) => (
                    <TodoItem key={el.id} title={el.title} />
                ))}
            </Box>
            <Button onClick={deleteTodo}>Delete To do</Button>
        </Container>
    );
};

export default Todo;
